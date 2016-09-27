package registrationScheduler.threadMgmt;

public class CreateWorkers  {
    private FileProcessor file_processor;
    private Results results;

    public CreateWorkers(FileProcessor fileProcessor, Results results) {
        this.file_processor = fileProcessor;
        this.results = results;
    }

    public void startWokers(int num_threads) {
        WorkerThread[] workers = new WorkerThread[num_threads];

        // create and run workers
        for (int i = 0; i < num_threads; ++i) {
            workers[i] = new WorkerThread();
            workers[i].run();
        }

        // join workers
        for (int i = 0; i < num_threads; ++i) {
            workers[i].join();
        }
    }
}