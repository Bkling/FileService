package fileservice;

public class Startup {

    public static void main(String[] args) {
        try {
            FileReaderStrategy frs = new CustomTextReader();
            FileWriterStrategy fws = new CustomTextWriter();
            FileService fs = new FileService(frs, fws);
            fs.getReader().readFile("F:/Advanced Java/Temp/ContactList.txt");
        } catch (Exception ex) {
            ex.getMessage();
        }

        /*
         * This Class is used to read from a file. If you want to write to a file,
         * switch to the InputGUICustomWriter or InputGUICsvWriter.
         * 
         * Couldn't find a way to implement them both into the start up class,
         * and yes I know that is not as flexible as it should be.
         */

    }
}
