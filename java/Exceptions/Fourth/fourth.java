
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class fourth {
    public static void solution() throws FileNotFoundException, IOException {
        File data = new File("date.txt");
        FileReader flrd = new FileReader(data);

        BufferedReader bfrd = new BufferedReader(flrd);

        String temp1, bir = "", ikki = "";

        String[] tempArray;

        
        
        while ((temp1 = bfrd.readLine()) != null) {
            tempArray = temp1.split("/");

            bir = bir + tempArray[0] + "\n";
            ikki = ikki + tempArray[1] + "\n";

        }
        
        FileWriter fwrt1 = new FileWriter("day.txt");
        FileWriter fwrt2 = new FileWriter("month.txt");

        fwrt1.write(bir);
        fwrt2.write(ikki);

        fwrt1.close();
        fwrt2.close();
    }
    public static void main(String[] args) {
        try {
            solution();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
