import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1500;
        String history = "";
        while (true) {
            System.out.println("\n~~ATM MENU~~");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double amount = input.nextDouble();
                    balance = balance + amount;
                    history = history + "deposit " + amount + "\n";
                    System.out.println("Deposited Successfully: ");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        history = history + "withdraw " + withdraw +  "\n";
                        System.out.println("Withdraw Successfully: ");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 3:
                    System.out.print("check balance: " + balance);
                    break;
                case 4:
                    if (history.isEmpty()) {
                        System.out.println("NOT Transaction history");
                    } else {
                System.out.println("Transaction history: ");
                        System.out.println(history);
                    }
                    break;
                case 5:
                    System.out.print(" Thank you !! ");
                    return;
                default:
                    System.out.println("Invalid choice");
                }
            }
        }
    }