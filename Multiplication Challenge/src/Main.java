import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an intteger : ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            int result = num * i;
            System.out.print( num + " x " + i + " = " + result  + "\n");
            sum = sum + result;
        }
        System.out.println("The sum of all muliti" + sum);
    }
}