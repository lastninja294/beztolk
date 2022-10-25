import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fifth {
    public static void solution() throws FileNotFoundException, IOException {
        File file1 = new File("matrix1.txt");
        File file2 = new File("matrix2.txt");

        FileReader frd1 = new FileReader(file1);
        FileReader frd2 = new FileReader(file2);

        BufferedReader bfrd1 = new BufferedReader(frd1);
        BufferedReader bfrd2 = new BufferedReader(frd2);

        Integer[] matrix1, matrix2;

        

    }
    public static void main(String[] args) {
        try {
            solution();
        } catch (Exception e) {
            
        }
    }
}
