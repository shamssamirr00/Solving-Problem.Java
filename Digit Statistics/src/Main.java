import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int num = input.nextInt();
        int count = 0;
        int sum = 0;
        int largest = 0;
        int smallest = 9;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            if (digit > largest) {
                largest = digit;
            } else if (digit < smallest) {
                smallest = digit;
            }
            num = num /  10;
        }
        System.out.println("Number of digits is : " + count);
        System.out.println("Sum is : " + sum);
        System.out.println("Largest is : " + largest);
        System.out.println("Smallest is : " + smallest);
    }
}