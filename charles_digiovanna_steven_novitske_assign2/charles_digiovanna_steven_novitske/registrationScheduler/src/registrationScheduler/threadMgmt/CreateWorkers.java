package registrationScheduler.threadMgmt;

import registrationScheduler.util.Logger;
import registrationScheduler.util.FileProcessor;
import registrationScheduler.store.Results;
import registrationScheduler.driver.Driver;
import registrationScheduler.pools.CoursePool;

public class CreateWorkers  {
    private FileProcessor file_processor;
    private Results results;
    private CoursePool course_pool;

    public CreateWorkers(FileProcessor fp, Results r, CoursePool cp) {
        Logger.writeMessage("CreateWorkers object constructed\n",
                              Logger.DebugLevel.CONSTRUCTOR);
        file_processor = fp;
        results = r;
        course_pool = cp;
    }

    public void startWorkers() {
        Thread[] workers = new Thread[Driver.NUM_THREADS];

        // create workers
        for (int i = 0; i < Driver.NUM_THREADS; ++i) {
            workers[i] = new Thread(new WorkerThread(file_processor, results, course_pool));
        }

        // run workers
        for (Thread w : workers) {
            w.run();
        }

        file_processor.finish();
        System.out.println("-----------");
        // join workers
        for (Thread w : workers) {
            try {
                w.join();
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            } finally {

            }
        }
    }
}
