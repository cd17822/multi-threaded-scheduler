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

        if (tokens.length != Student.max_preferences + 1) {
            System.err.println("Invalid line in input: " + line);
            return null;
        }

        Student student = new Student(tokens[0]);

        Course[] preferences = new Course[Student.max_preferences + 1];

        for (int i = 0; i < Student.max_preferences; ++i) {
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

    }
}