package fileservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class uses CSV format for reading a file. this one uses comma's.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public class CsvReader implements TextReaderStrategy {

    /*
     * Properites of a CsvTextReader, these properites also evade magic numbers.
     */
    private String ERROR = "Sorry, there was a problem reading this file.";
    private String COMMA = "\\,";
    private String FULL_NAME = "Full Name: ";
    private String SPACE = " ";
    private String NEW_LINE = "\n";
    private String ADDRESS = "Address: ";
    private String PHONE = "Phone: ";
    private String EMAIL = "Email: ";
    private String info;

    /**
     * This method overrides the interface method to implement it's own.
     *
     * @param filePath - Uses the file path of file to reade it
     * @return - a String of info.
     * @throws Exception - if an error occurs exception will be thrown.
     */
    @Override
    public String readFile(String filePath) throws Exception {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(filePath));
            String line = in.readLine();
            while (line != null) {
                String[] pieces = line.split(COMMA);
                info = FULL_NAME + pieces[1] + SPACE + pieces[0] + NEW_LINE + ADDRESS + pieces[2]
                        + SPACE + pieces[3] + SPACE + pieces[4] + SPACE
                        + pieces[5] + NEW_LINE + PHONE + pieces[7]
                        + NEW_LINE + EMAIL + pieces[6] + NEW_LINE;
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println(ERROR);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return info;
    }
}
