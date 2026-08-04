import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the of num students: ");
        int n = input.nextInt();
        String top_student = "" ;
        String lowest_student = "" ;
        int highest_student = 0;
        int low_student = 100 ;
        int sum = 0 ;
        int passed = 0;
        for (int i = 0 ; i < n ; i++) {
            System.out.print("name of student " + (i+1) + ": ");
            String name = input.next();
            System.out.print("mark of student " + (i+1) + ": ");
            int mark = input.nextInt();
            sum += mark;
            if (mark > highest_student) {
                highest_student = mark;
                top_student = name;
            }
            if (mark < low_student) {
                low_student = mark;
                lowest_student = name;
            }
            if (mark >= 60){
                passed++;
            }
        }
        System.out.println("Top Student = " + top_student);
        System.out.println("Lowest Student = " + lowest_student);
        System.out.println("Class average = " + sum/ (double) n);
        System.out.println("Number of passed students = " + passed);


    }
}