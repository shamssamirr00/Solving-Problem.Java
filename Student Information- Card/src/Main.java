import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Full Name :");
        String fullName = input.nextLine();
        System.out.println("Enter Age of Student:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter University of Student :");
        String university = input.nextLine();
        System.out.println("Enter Student GPA :");
        double gpa = input.nextDouble();
        System.out.println("\n ===== Student Card ===== ");
        System.out.println("Student Full Name: " + fullName);
        System.out.println("Student Age: " + age);
        System.out.println("Student GPA: " + gpa);
        System.out.println("Student University: " + university);
        System.out.println("Student Student GPA: " + gpa);
        System.out.println("=========================");
    }
}