import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a 3-digit number: ");
        int num = input.nextInt();
        int original_number = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }if (sum == original_number) {
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not an Armstrong number");
        }
    }
}