import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fifth {
    // public static void solution() throws FileNotFoundException, IOException {
    //     File file1 = new File("matrix1.txt");
    //     File file2 = new File("matrix2.txt");

    //     FileReader frd1 = new FileReader(file1);
    //     FileReader frd2 = new FileReader(file2);

    //     // BufferedReader bfrd1 = new BufferedReader(frd1);
    //     // BufferedReader bfrd2 = new BufferedReader(frd2);

    //     Integer[] matrix1, matrix2;
    //     System.out.println(frd1)
        

    // }
    public static void main(String[] args) 
        throws java.io.FileNotFoundException{
        // TODO Auto-generated method stub
        Scanner input = new Scanner (new File("matrix1.txt"));
        int m = 3;
        int n = 3;
        int[][] a = new int [m][n];
        while (input.next()!=null){
            for (int i=0;i<m;i++){
                for (int j=0;j<n;j++)
                    a[i][j]= input.nextInt();
            }   

        }
        //print the input matrix
        System.out.println("The input sorted matrix is : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.println(a[i][j]);
        }
    }
}
