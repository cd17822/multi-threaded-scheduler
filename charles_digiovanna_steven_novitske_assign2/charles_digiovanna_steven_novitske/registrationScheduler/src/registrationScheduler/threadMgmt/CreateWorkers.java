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
        WorkerThread[] workers = new WorkerThread[Driver.NUM_THREADS];

        // create workers
        for (int i = 0; i < Driver.NUM_THREADS; ++i) {
            workers[i] = new WorkerThread(file_processor, results, course_pool);
        }

        // run workers
        for (WorkerThread w : workers) {
            w.run();
        }

        file_processor.finish();

        // join workers
        for (WorkerThread w : workers) {
            w.join();
        }
    }
}
