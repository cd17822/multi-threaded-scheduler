package registrationScheduler.driver;

public class Driver{
    private String input_filename;
    private String output_filename;
    private int num_threads;

    public static void main(String args[]) {
        if (args.length != 4) {
            System.err.println("Invalid number of arguments");
        }

        CoursePool course_pool = new CoursePool();
        FileProcessor file_processor = new FileProcessor();
        Results results = new Results();
        CreateWorkers create_workers_factory = new CreateWorkers(file_processor, results);
        create_workers_factory.startWorkers(num_threads);
    }
}
