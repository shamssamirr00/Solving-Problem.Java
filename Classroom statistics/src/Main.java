import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Highest_Mark = 0;
        double Lowest_Mark = 100 ;
        int sum = 0;
        int passed = 0;
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print("Enter Mark " + (i) + " = ");
            double mark = input.nextInt();
            if (mark > Highest_Mark) {
                Highest_Mark = mark;
            }
            if (mark < Lowest_Mark) {
                Lowest_Mark = mark;
            }
            sum += mark;
            if (mark >= 60) {
                passed++;
            }
        }
        System.out.println("Highest Mark: " + Highest_Mark);
        System.out.println("Lowest Mark: " + Lowest_Mark);
        System.out.println("Average Mark: " + sum/10.0);
        System.out.println("Passed: " + passed);
    }
}