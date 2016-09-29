package registrationScheduler;//.threadMgmt;

public class CreateWorkers  {
    private FileProcessor file_processor;
    private Results results;

    public CreateWorkers(FileProcessor fp, Results r) {
        Logger.writeMessage("CreateWorkers object constructed\n",
                              Logger.DebugLevel.CONSTRUCTOR);
        file_processor = fp;
        results = r;
    }

    public void startWorkers() {
        WorkerThread[] workers = new WorkerThread[Driver.NUM_THREADS];

        // create and run workers
        for (int i = 0; i < Driver.NUM_THREADS; ++i) {
            workers[i].run();
        }

        // join workers
        for (int i = 0; i < Driver.NUM_THREADS; ++i) {
            workers[i].join();
        }
    }
}
