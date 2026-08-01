import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (N) : ");
        int n = scanner.nextInt();
        int even_sum = 0;
        int odd_sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even_sum += i;
            } else {
                odd_sum -= i;
            }
        }
        System.out.println("SUM of Even num : " + even_sum);
        System.out.println("SUM of Odd num : " + odd_sum);
    }
}