
public class three {
    public static int solution(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        else if (num % 2 == 0) {
            return solution(num / 2);
        }
        else {
            return solution((num - 1) / 2) + solution((num - 1) / 2 + 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(solution(5));
    }
}
