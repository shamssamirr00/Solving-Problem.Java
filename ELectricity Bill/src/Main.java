import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a consumed units:");
        int units = input.nextInt();
        double bill;
        if (units <= 100) {
            bill = units * 0.50 ;
        }else if (units <= 200) {
            bill = (100 * 0.50) + ((units - 100 )* 0.75 ) ;
        }else {
            bill = (100 * 0.50) + (100 * 0.75) + ((units - 200)* 1.20) ;
        }
        System.out.println("Total Price :" + bill);
    }
}