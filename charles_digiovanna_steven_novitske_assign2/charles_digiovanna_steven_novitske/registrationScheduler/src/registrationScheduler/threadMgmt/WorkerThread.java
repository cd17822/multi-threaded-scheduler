package registrationScheduler.threadMgmt;

public class WorkerThread implements Runnable  {
    private FileProcessor file_processor;
    private Results results;
    private CoursePool course_pool;

    public WorkerThread(FileProcessor fileProcessor, Results results, CoursePool coursePool) {
        this.file_processor = fileProcessor;
        this.results = results;
        this.course_pool = coursePool;
    }

    public void run() {
        String line = this.file_processor.readLine();

        Student student = createStudent(line);

        this.assignCourses(student);

        this.results.storeStudent(student);
    }

    private Student createStudent(String line) {
        String[] tokens = line.split("\\s+");
        Student student;

        if (tokens.length != student.getMaxPreferences() + 1) {
            System.err.println("Invalid line in input: " + line);
            return null;
        }

        student = new Student(tokens[0]);

        Course[] preferences = new Course[student.getMaxPreferences() + 1];

        for (int i = 0; i < student.getMaxPreferences(); ++i) {
            String course_name = tokens[i];

            preferences[i] = this.course_pool.getCourseWithName(course_name);

            // if you can't find course in pool, add a new one by that name
            if (preferences[i] == null) {
                this.course_pool.addCourse(Course(course_name));
                preferences[i] = this.course_pool.getCourseWithName(course_name);
            }
        }
    }

    private void assignCourses(Student student) {
        Course[] courses_by_preference = student.getPreferences();

        float average_students_per_course = this.course_pool.getAverageStudentsPerCourse();

        Boolean all_preferences_met = true;

        for  (int i = 0; i < courses_by_preference.length; ++i) {
            Course course = courses_by_preference[i];

            if (course.getNumStudents()/average_students_per_course <= 1.25 || !all_preferences_met) { // golden ratio
                if (!student.tryToAddCourseAtPriority(i)) {
                    all_preferences_met = false;
                }
            }else{
                all_preferences_met = false;
            }
        }
    }
}
