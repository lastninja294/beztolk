package bahouchun;

import java.text.DecimalFormat;

public class first {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static double[] solution(int[] arr) {
        double sumOfEvenIndex = 0;
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                sumOfEvenIndex += arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                result[i] = Double.parseDouble(df.format((arr[i] / sumOfEvenIndex)));
            } else {
                result[i] = arr[i];
            }
        }
        return result;
    }
    

    public static void main(String[] args) {
        int[] a = { 99, 48, -20 };
        double[] res = solution(a);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
