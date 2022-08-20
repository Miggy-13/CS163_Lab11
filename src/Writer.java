import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Writer {
    PrintWriter outputFile;

    public Writer(String fileName) throws IOException {
        // TODO Student
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            PrintWriter outputFile = new PrintWriter(file);
            this.outputFile = outputFile;

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void closeWriter() {
        outputFile.print("End of file.");
        outputFile.close();
    }

    public void logReverse(ArrayList<String> fileContents) {

        outputFile.println("Reversed file contents: ");

        Collections.reverse(fileContents);

        for (String string : fileContents) {
            outputFile.println(string);
        }

        closeWriter();

    }

    public void logMax(ArrayList<String> fileContents) {
        // TODO Student

        outputFile.print("The largest number in the file is: ");
        // You will want to print your max number on this line.

        outputFile.println(Collections.max(fileContents));
        closeWriter();

    }

    public void logDuplicates(ArrayList<String> fileContents) {
        outputFile.print("Duplicates found: ");

        for (String string : fileContents) {
            int index = 0;
            if (string.equals(fileContents.get(index + 1))) {
                outputFile.println("true");
            }
        }

        // TODO Student
    }

}
