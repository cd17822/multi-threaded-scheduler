package registrationScheduler.util;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import registrationScheduler.util.Logger;

public class FileProcessor {
    FileReader reader;
    BufferedReader buffReader;

	/**
	 * Creates new FileProcessor object and opens FileReader and
	 * BufferedReader objects with @param file
	 */
    public FileProcessor(String file) {
      Logger.writeMessage("FileProcessor constructed\n", Logger.DebugLevel.CONSTRUCTOR);
      try {
        reader = new FileReader(file);
        buffReader = new BufferedReader(reader);
      } catch(IOException ex) {
        ex.printStackTrace();
      } finally {

      }
    }

	/**
	 * @return String that is the current line of the input file
	 */
    public String readLine() {
      String line = "";
      try {
        line = buffReader.readLine();
      } catch(IOException ex) {
        ex.printStackTrace();
      } finally {

      }
      return line;
    }

	/**
	 * @return void
	 */
    public void finish() {
      try {
        buffReader.close();
      } catch(IOException ex) {
        ex.printStackTrace();
      } finally {
        
      }
    }
}
