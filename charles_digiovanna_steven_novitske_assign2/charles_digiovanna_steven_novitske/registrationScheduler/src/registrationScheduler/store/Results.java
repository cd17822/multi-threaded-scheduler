package registrationScheduler.store;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import registrationScheduler.util.Logger;
import registrationScheduler.entities.Student;

public class Results implements StdoutDisplayInterface, FileDisplayInterface {
    // appropriate data structure as private data member
    private ArrayList<Student> studentData;
    String outputFile;

    // appropriate method to save prime number to the data structure

    public Results(String fileIn) {
      Logger.writeMessage("Results object constructed\n", Logger.DebugLevel.CONSTRUCTOR);
      outputFile = fileIn;
    }

    public void writeSchedulesToFile() {
      int totalScore = 0;
      int avgScore = -1;
      try {
        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter buffWriter = new BufferedWriter(writer);
        for(int i=0; i<studentData.size(); i++) {
          buffWriter.write(studentData[i].getName());
          for(int j=0; j<5; j++) {
            buffWriter.write(" " + studentData[i].getCourses[j]);
          }
          buffWriter.write("\n");
          totalScore += studentData[i].getPreferenceScore();
        }
        avgScore = totalScore/80;
        buffWriter.write("Average preference score: " + totalScore/80);
        buffWriter.close();
      } catch(IOException ex) {
        ex.printStackTrace();
      } finally {

      }
    }

    public void writeSchedulesToScreen() {
      int totalScore = 0;
      for(int i=0; i<studentData.size(); i++) {
        System.out.println(studentData[i].getName());
        for(int j=0; j<5; j++) {
          System.out.println(" " + studentData[i].getCourses[j]);
        }
        System.out.println("\n");
        totalScore += studentData[i].getPreferenceScore();
      }
      System.out.println("Average preference score: " + totalScore/80);
    }

    public void storeStudent(Student studentIn) {
      Logger.writeMessage("Student " + studentIn.getName() + " added to Results\n",
                            Logger.DebugLevel.STORECONTENT);
    }
}
