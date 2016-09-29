package registrationScheduler.util;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import registrationScheduler.util.Logger;

public class FileProcessor {
    String fileName;

    public FileProcessor(String file) {
        Logger.writeMessage("FileProcessor constructed\n",
                            Logger.DebugLevel.CONSTRUCTOR);
        fileName = file;
    }

    public String readLine() {
        String line = "";
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(fileName));
            line = buffReader.readLine();
            buffReader.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        return line;
    }
}
