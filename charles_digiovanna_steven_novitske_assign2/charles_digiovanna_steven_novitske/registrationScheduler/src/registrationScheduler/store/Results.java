package registrationScheduler.store;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import registrationScheduler.util.Logger;
import registrationScheduler.entities.Student;
import registrationScheduler.entities.Course;

public class Results implements StdoutDisplayInterface, FileDisplayInterface {
    // appropriate data structure as private data member
    private ArrayList<Student> studentData = new ArrayList<>();
    private String outputFile;
    private float avgPreferenceScore;

    // appropriate method to save prime number to the data structure

    public Results(String fileIn) {
      Logger.writeMessage("Results object constructed\n", Logger.DebugLevel.CONSTRUCTOR);
      outputFile = fileIn;
    }

    public void writeSchedulesToFile() {
      float totalScore = 0;
      try {
        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter buffWriter = new BufferedWriter(writer);
        for (Student s : studentData) {
          buffWriter.write(s.getName());
          for (Course c : s.getCourses()){
            buffWriter.write(" " + c);
          }
          buffWriter.write("\n");
          totalScore += s.getPreferenceScore();
        }
        avgPreferenceScore = totalScore/80;
        buffWriter.write("Average preference score: " + avgPreferenceScore);
        buffWriter.close();
      } catch(IOException ex) {
        ex.printStackTrace();
      } finally {

      }
    }

    public void writeSchedulesToScreen() {
      float totalScore = 0;
      System.out.println(studentData.size());
      for (Student s : studentData) {
        System.out.println(s.getName());
        for (Course c : s.getCourses()) {
          System.out.println(" " + c);
        }
        System.out.println("\n");
        totalScore += s.getPreferenceScore();
      }
      avgPreferenceScore = totalScore/80;
      System.out.println("Average preference score: " + avgPreferenceScore);
    }

    public void storeStudent(Student studentIn) {
      Logger.writeMessage("Student " + studentIn.getName() + " added to Results\n",
                            Logger.DebugLevel.STORECONTENT);
    }

    public float getAvgScore() {
      return avgPreferenceScore;
    }
}
