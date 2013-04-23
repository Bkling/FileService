package fileservice;

/**
 * This class writes binary files in the file service class, HOWEVER, I did not
 * write this program to write binary files, this is an add-on, but no code was
 * written.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public class BinaryWriterStrategy implements FileWriterStrategy {

    /*
     * Properties of a binary file reader.
     */
    private String NOT_SUPPORTED = "Not Supported Yet.";

    /**
     * This method overrides the writeToFile method given in the writer
     * interface. I did not write anymore code, I just override the method.
     *
     * @throws Exception - this method will throw an exception if the
     * writeToFile, errors out.
     * @return - a binary file.
     */
    @Override
    public void writeToFile(String filePath, String data) throws Exception {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }
}
