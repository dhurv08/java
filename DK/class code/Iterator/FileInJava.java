import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileInJava {

    public static void main(String args[]) {
        try {
            final String fileName = "MyFile.txt";
            final File fileObj = new File(fileName);

            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            final FileWriter fw = new FileWriter(fileName);
            final String fileString = "This is my File";
            // //0-T 1-H 2-I ...... 13-l 14-e
            // //String = collection characters
            for(int i = 0; i < fileString.length(); i++) {
                final char charToAddInFile = fileString.charAt(i);
                fw.write(charToAddInFile);
            }
            fw.close();

            final FileReader fr = new FileReader(fileName);

            System.out.println("Text in File:");
            int k;
            while ((k = fr.read()) > 0) {
                System.out.print((char)k);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("An error has occurred. Error = " + e);
        }
    }
}