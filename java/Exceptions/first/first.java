import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class first {
    public static void solution() throws FileNotFoundException, IOException {
        File forScan = new File("first.txt");
        Scanner numbers = new Scanner(forScan);
        List<String> BufferedNums = new ArrayList<String>();
        FileWriter forWrite = new FileWriter("sec.txt");
        while (numbers.hasNextLine()) {
            BufferedNums.add( numbers.nextLine());
        }

        for (int i = BufferedNums.size() - 1; i >= 0; i--) {
            forWrite.write(BufferedNums.get(i)+"\n");
        }
        forWrite.close();
        numbers.close();
    }
    public static void main(String[] args) {
        try {
            solution();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}