public class four {
    public static void solution(int a, int b, int c) {
        if (a + b >= c) {
            System.out.println(a+b-c);
        } else {
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        solution(4, 4, 3);
    }
}
