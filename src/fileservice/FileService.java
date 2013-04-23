package fileservice;

/**
 * This is a file service class that uses two components a reader and a writer,
 * and can be used in almost any program, but this file service cannot use
 * binary files.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public class FileService {

    /*
     * Componenets of a file service
     */
    private FileReaderStrategy reader;
    private FileWriterStrategy writer;

    /*
     * Constructor
     */
    public FileService(FileReaderStrategy reader, FileWriterStrategy writer) {
        this.reader = reader;
        this.writer = writer;
    }

    /*
     * Getters and Setters for the strategy objects
     */
    public FileReaderStrategy getReader() {
        return reader;
    }

    /**
     * This method sets a reader to be used in the file service class.
     *
     * @param reader - uses a reader to read from the file.
     * @throws Exception - if the reader is not there, it throws an exception.
     */
    public void setReader(FileReaderStrategy reader) throws Exception {
        if (reader == null) {
            throw new Exception();
        }
        this.reader = reader;
    }

    public FileWriterStrategy getWriter() {
        return writer;
    }

    /**
     * This method sets a writer to be used in the file service class.
     *
     * @param writer - uses a writer to write to the file.
     * @throws Exception - if the writer is not there, it throws an exception.
     */
    public void setWriter(FileWriterStrategy writer) throws Exception {
        if (writer == null) {
            throw new Exception();
        }
        this.writer = writer;
    }

//    public String getFilePath() {
//        return filePath;
//    }
//
//    /**
//     * This method sets the file path for the file service class.
//     *
//     * @param filePath - uses a file path to write or read to a file.
//     * @throws Exception - if the file path is not there, it throws an
//     * exception.
//     */
//    public void setFilePath(String filePath) throws Exception {
//        if (filePath == null) {
//            throw new Exception();
//        }
//        this.filePath = filePath;
//    }
}
