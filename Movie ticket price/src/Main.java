import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if (age < 6) {
            System.out.println("Free");
        }else if (age >= 6 && age <= 17) {
            System.out.println("Student Ticket");
        }else if (age >= 18 && age <= 60) {
            System.out.println("Regular Ticket");
        } else if (age > 60) {
            System.out.println("Senior Discount");
        }else{
            System.out.println("Not avaliable");
        }
    }
}