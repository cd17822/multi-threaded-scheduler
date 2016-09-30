package registrationScheduler.store;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import registrationScheduler.util.Logger;
import registrationScheduler.entities.Student;
import registrationScheduler.entities.Course;

public class Results implements StdoutDisplayInterface, FileDisplayInterface {
    private ArrayList<Student> studentData = new ArrayList<>();
    private String outputFile;
    private float avgPreferenceScore;

	/**
	 * Creates new Results object containing the name of file to write to
	 */
    public Results(String fileIn) {
      Logger.writeMessage("Results object constructed\n", Logger.DebugLevel.CONSTRUCTOR);
      outputFile = fileIn;
    }

	/**
	 * @return void
	 */
    public void writeSchedulesToFile() {
      try {
        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter buffWriter = new BufferedWriter(writer);
        for (Student s : studentData) {
          buffWriter.write(s.getName());
          for (Course c : s.getCourses()){
            buffWriter.write(" " + c);
          }
          buffWriter.write("\n");
        }
        buffWriter.close();
      } catch(IOException ex) {
        ex.printStackTrace();
      } finally {

      }
    }

	/**
	 * @return void
	 */
    public void writeSchedulesToScreen() {
      for (Student s : studentData) {
        System.out.println(s.getName());
        for (Course c : s.getCourses()) {
          System.out.println(" " + c);
        }
        System.out.println("\n");
      }
    }

	/**
	 * @return void
	 */
    public synchronized void storeStudent(Student studentIn) {
      Logger.writeMessage("Student " + studentIn.getName() + " added to Results\n",
                            Logger.DebugLevel.ADDTORESULTS);
      studentData.add(studentIn);
    }

	/**
	 * @return float of average preference score of all students
	 */
    public float getAvgScore() {
      float totalScore = 0;

      for (Student s : studentData) {
        totalScore += s.getPreferenceScore();
      }

      avgPreferenceScore = totalScore/80;

      return avgPreferenceScore;
    }
}
