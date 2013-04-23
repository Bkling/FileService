package fileservice;

/**
 * This is an interface for the file writing side of the file service.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public interface FileWriterStrategy {

    /**
     * This method is used so that all the writers below it have to override it,
     * and write their own writers. They also implements the exception too if it
     * errors out.
     */
    public abstract void writeToFile(String filePath, String data) throws Exception;
}
