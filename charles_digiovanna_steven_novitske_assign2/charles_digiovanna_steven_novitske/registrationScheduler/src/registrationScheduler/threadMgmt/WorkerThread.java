package registrationScheduler;//.threadMgmt;

public class WorkerThread implements Runnable  {
    private FileProcessor file_processor;
    private Results results;
    private CoursePool course_pool;

    public WorkerThread(FileProcessor fp, Results r, CoursePool cp) {
        Logger.writeMessage("WorkerThread constructed\n",
                              Logger.DebugLevel.CONSTRUCTOR);
        file_processor = fp;
        results = r;
        course_pool = cp;
    }

    public void run() {
        Logger.writeMessage("Thread run() called\n",
                              Logger.DebugLevel.THREADRUN);
        String line = file_processor.readLine();
        Student student = createStudent(line);
        assignCourses(student);
        results.storeStudent(student);
    }

    public void join() {

    }

    private Student createStudent(String line) {
        String[] tokens = line.split("\\s+");
        Student student;
        student = new Student(tokens[0]);

        if (tokens.length != student.getMaxPreferences() + 1) {
            System.err.println("Invalid line in input: " + line);
            return null;
        }

        Course[] preferences = new Course[student.getMaxPreferences() + 1];

        for (int i = 0; i < student.getMaxPreferences(); ++i) {
            String course_name = tokens[i];

            preferences[i] = course_pool.getCourseWithName(course_name);

            // if you can't find course in pool, add a new one by that name
            if (preferences[i] == null) {
                Course newCourse = new Course(course_name);
                course_pool.addCourse(newCourse);
                preferences[i] = course_pool.getCourseWithName(course_name);
            }
        }
        return student; //Added for compilation
    }

    private void assignCourses(Student student) {
        Course[] courses_by_preference = student.getPreferences();
        float average_students_per_course = course_pool.getAverageStudentsPerCourse();
        Boolean all_preferences_met = true;

        for  (int i = 0; i < courses_by_preference.length; ++i) {
            Course course = courses_by_preference[i];
            if (course.getNumStudents()/average_students_per_course <= 1.25 || !all_preferences_met) { // golden ratio
                if (!student.tryToAddCourseAtPriority(i)) {
                    all_preferences_met = false;
                }
            } else {
                all_preferences_met = false;
            }
        }
    }
}
