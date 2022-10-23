package Third;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class third {
    public static void solution() throws IOException {
        File onefile = new File("one.txt");
        File twoFile = new File("two.txt");
        File threeFile = new File("three.txt");

        FileReader oneReader = new FileReader(onefile);
        FileReader twoReader = new FileReader(twoFile);
        FileReader threeReader = new FileReader(threeFile);

        BufferedReader BfrdOne = new BufferedReader(oneReader);
        BufferedReader Bfrdtwo = new BufferedReader(twoReader);
        BufferedReader BfrdThree = new BufferedReader(threeReader);

        String temp1, temp2, temp3;

        String result = new String("");

        while ((temp1 = BfrdOne.readLine()) != null && (temp2 = Bfrdtwo.readLine()) != null
                && (temp3 = BfrdThree.readLine()) != null) {
            result += temp1 + "\n" + temp2 + "\n" + temp3 + "\n";
        }

        FileWriter newfile = new FileWriter("result.txt");
        newfile.write(result);
        newfile.close();
        
        System.out.println(result);
    }
    public static void main(String[] args) {
        try {
            solution();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
