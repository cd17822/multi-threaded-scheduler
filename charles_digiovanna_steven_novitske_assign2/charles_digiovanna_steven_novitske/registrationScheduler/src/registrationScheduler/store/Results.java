package registrationScheduler.store;

import java.util.ArrayList;
import registrationScheduler.util.Logger;
import registrationScheduler.entities.Student;

public class Results implements StdoutDisplayInterface, FileDisplayInterface {
    // appropriate data structure as private data member
    private ArrayList<Student> studentData;

    // appropriate method to save prime number to the data structure

    public Results() {
      Logger.writeMessage("Results object constructed\n",
                            Logger.DebugLevel.CONSTRUCTOR);
    }

    public void writeSchedulesToFile() {
      for(int i=0; i<studentData.size(); i++) {

      }
    }

    public void writeSchedulesToScreen() {

    }

    public void storeStudent(Student studentIn) {
      Logger.writeMessage("Student " + studentIn.getName() + " added to Results\n",
                            Logger.DebugLevel.STORECONTENT);
    }
}
