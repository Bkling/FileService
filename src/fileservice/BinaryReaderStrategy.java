package fileservice;

/**
 * This class reads binary files in the file service class, HOWEVER, I did not
 * write this program to read binary files, this is an add-on, but no code was
 * written.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public class BinaryReaderStrategy implements FileReaderStrategy {

    /*
     * Properties of a binary file reader.
     */
    private String NOT_SUPPORTED = "Not Supported Yet.";

    /**
     * This method overrides the readFile method given in the reader interface.
     * I did not write anymore code, I just override the method.
     *
     * @throws Exception - this method will throw an exception if the read file,
     * errors out.
     * @return - a binary file.
     */
    @Override
    public String readFile(String filePath) throws Exception {
        throw new Exception(NOT_SUPPORTED);
    }
}
