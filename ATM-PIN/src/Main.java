import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int correct_PIN = 1234 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN");
        int PIN = sc.nextInt();
        if(PIN == correct_PIN){
            System.out.println("Access Granted");
        }else {
            System.out.println("Invalid PIN");
        }
    }
}