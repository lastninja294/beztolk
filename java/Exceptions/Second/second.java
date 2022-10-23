import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class second {
    public static void solution() throws FileNotFoundException, IOException {
        File forRead = new File("second.txt");
        FileReader frd = new FileReader(forRead);
        String fullText = new String("");
        int lengthOfFile = 0;

        BufferedReader bfrd = new BufferedReader(frd);


        String temp;
        while ((temp = bfrd.readLine()) != null) {
            lengthOfFile++;
            fullText = fullText + (temp + "\n");
        }

        while (50 - lengthOfFile > 0) {
            fullText = "0\n" + fullText;
            lengthOfFile++;
        }

        FileWriter fwrt = new FileWriter("second.txt");
        fwrt.write(fullText);
        fwrt.close();
    }
    public static void main(String[] args) {
        try {
            solution();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }
    }
}
