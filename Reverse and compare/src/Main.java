import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an  integer: ");
        int num = input.nextInt();
        int orginal_num = num;
        int reverse_num = 0;
        while (num != 0) {
            reverse_num = reverse_num * 10 + num % 10;
            num /= 10;
        }System.out.println("Reversed number: " + reverse_num);
        if ( orginal_num == reverse_num) {
            System.out.println("The original number is equal to the reversed number");
        }else  {
            System.out.println("The original number is not equal to the reversed number");
        }
    }
}