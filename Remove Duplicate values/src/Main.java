import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an array size : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an integer number " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n ; i++ ) {
            boolean duplicate = false;
            for (int j = 0; j < i ; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if ( ! duplicate) {
                System.out.println( "Uniqe array" + arr[i] ) ;
            }
        }
    }
}