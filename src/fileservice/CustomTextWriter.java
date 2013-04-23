package fileservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * This class writes to a custom text file that uses vertical bars as
 * separators.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public class CustomTextWriter implements TextWriterStrategy {

    /**
     * This method overrides the interface method and implements it's own.
     *
     * @param filePath - uses a file path to write to a file
     * @return - a String of info
     * @throws Exception - if an error occurs then it will throw an exception.
     */
    @Override
    public void writeToFile(String filePath, String data) throws Exception {
        boolean append = true;
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filePath, append)));
        out.println(data);
        out.close();
    }
}
