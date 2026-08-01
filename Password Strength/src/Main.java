import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        boolean Digit_num = false;
        for (int i = 0 ; i <= password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                Digit_num = true;
                break;
            }
        }
        if (password.length() >= 8 && Digit_num ) {
            System.out.print(" Strong password ");
        }else {
            System.out.println("Weak password");
        }
    }
}

