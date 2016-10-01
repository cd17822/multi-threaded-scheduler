package registrationScheduler.driver;

import registrationScheduler.util.Logger;
import registrationScheduler.util.FileProcessor;
import registrationScheduler.pools.CoursePool;
import registrationScheduler.store.Results;
import registrationScheduler.threadMgmt.CreateWorkers;

public class Driver{
    public static int NUM_THREADS;
    public static int DEBUG_VALUE;

    public static void main(String args[]) {
        if (args.length != 4) {
    			System.err.println("Must have 4 arguments\n");
    			System.exit(0);
    		} else if(Integer.parseInt(args[2]) < 1 || Integer.parseInt(args[2]) > 3) {
          System.err.println("NUM_THREADS must be between 1 and 3\n");
    			System.exit(0);
        } else if(Integer.parseInt(args[3]) < 0 || Integer.parseInt(args[3]) > 4) {
          System.err.println("DEBUG_VALUE must be between 0 and 4\n");
    			System.exit(0);
        }

        String input_filename = args[0];
        String output_filename = args[1];
        NUM_THREADS = Integer.parseInt(args[2]);
        DEBUG_VALUE = Integer.parseInt(args[3]);

        Logger.setDebugValue(DEBUG_VALUE);
        CoursePool course_pool = new CoursePool();
        FileProcessor file_processor = new FileProcessor(input_filename);
        Results results = new Results(output_filename);
        CreateWorkers create_workers_factory = new CreateWorkers(file_processor, results, course_pool);
        create_workers_factory.startWorkers(NUM_THREADS);

        results.writeSchedulesToFile();

        if(DEBUG_VALUE == 1) {
          results.writeSchedulesToScreen();
        }

        System.out.println("The average preference value is: " + results.getAvgScore());
    }
}
