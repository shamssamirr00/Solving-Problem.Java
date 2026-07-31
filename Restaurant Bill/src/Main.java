import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of meal one :" );
        double meal1 = input.nextDouble();
        System.out.print("Enter the price of meal two :" );
        double meal2 = input.nextDouble();
        System.out.print("Enter the price of meal three :" );
        double meal3 = input.nextDouble();
        double total_price = meal1 + meal2 + meal3;
        double VAT = total_price * 0.14 ;
        double fimal_price = total_price - VAT;
        System.out.println("Total Price :" + total_price);
        System.out.println("VAT :" + VAT);
        System.out.println("Final price :" + fimal_price);
    }
}