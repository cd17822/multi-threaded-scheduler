package registrationScheduler.util;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import registrationScheduler.util.Logger;

public class FileProcessor {
    FileReader reader;
    BufferedReader buffReader;

    public FileProcessor(String file) {
      Logger.writeMessage("FileProcessor constructed\n", Logger.DebugLevel.CONSTRUCTOR);
      try {
        reader = new FileReader(file);
        buffReader = new BufferedReader(reader);
      } catch(IOException ex) {
        ex.printStackTrace();
      }
    }

    public String readLine() {
      String line = "";
      try {
        line = buffReader.readLine();
      } catch(IOException ex) {
        ex.printStackTrace();
      }
      return line;
    }

    public void finish() {
      try {
        buffReader.close();
      } catch(IOException ex) {
        ex.printStackTrace();
      }
    }
}
