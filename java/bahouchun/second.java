package bahouchun;

public class second {
    public static int[][] solution(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length+1];
        for (int i = 0; i < matrix.length; i++) {
            Integer sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
                result[i][j] = matrix[i][j];
            }
            result[i][matrix.length] = sum;
            sum = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = solution(a);
        String mat = "";
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                mat += res[i][j] + " ";
            }
            System.out.println(mat);
            mat = "";
        }
    }
}
