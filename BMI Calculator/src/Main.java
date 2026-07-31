import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter wight(kg) : ");
        double weight = input.nextDouble();
        System.out.println("Enter height (meters) : ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi > 30 && bmi < 35) {
            System.out.println("Obese");
        }
    }
}
