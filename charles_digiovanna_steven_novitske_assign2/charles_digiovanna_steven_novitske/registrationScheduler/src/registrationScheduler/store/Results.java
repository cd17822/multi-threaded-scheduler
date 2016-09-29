package registrationScheduler;//.store;

public class Results implements StdoutDisplayInterface {
    // appropriate data structure as private data member


    // appropriate method to save prime number to the data structure

    public Results() {
      Logger.writeMessage("Results object constructed\n",
                            Logger.DebugLevel.CONSTRUCTOR);
    }

    public void writeScheduleToScreen() {
    }

    public void storeStudent(Student studentIn) {
      Logger.writeMessage("Student " + studentIn.getName() + " added to Results\n",
                            Logger.DebugLevel.STORECONTENT);
    }
}
