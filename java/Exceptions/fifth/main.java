import java.util.*;
import java.lang.*;
import java.io.*;

public class appMainNineSix {

    /**
     * @param args
     */
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