import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a (N) : ");
        int n = input.nextInt();
        int x = 0;
        int y = 1;
        int largest_Num = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(x + " ");
            sum += x;
            largest_Num = x;
            int z = x + y;
            x = y;
            y = z;
        }
        System.out.println( " \n The largest fibonacci number is: " + largest_Num);
        System.out.println("The sum of all generated number : " + sum);
    }
}