import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ") ;
        String str = input.nextLine();
        for (int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean appears = false;
            for (int j = 0 ; j < i; j++) {
                if ( str.charAt(j) == ch) {
                    appears = true;
                    break;
                }
            }
            if ( ! appears) {
                int count = 0;
                for (int j = 0 ; j < str.length() ; j++) {
                    if ( str.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + ": " + count) ;
            }
        }
    }
}