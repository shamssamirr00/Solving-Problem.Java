import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        boolean isPrime = true;
        int smallest_divisor = 0;
        if (number < 2){
            System.out.println("not prime number");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                smallest_divisor = i;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        }else  {
            System.out.println("Not Prime Number");
            System.out.println("Smallest divisor Number = " + smallest_divisor );
        }
    }
}