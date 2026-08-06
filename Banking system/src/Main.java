import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int[] AccNum = new int[10];
    static String[] name = new String[10];
    static double [] balance = new double[10];
    static int count = 0 ;
    public  static void main(String[] args) {
        while(true){
            System.out.println("\n == Bnking System ==");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Search by Account Number");
            System.out.println("5. Display All Accounts");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    creatAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    searchAccount();
                    break;
                case 5:
                    displayAllaccount();
                    break;
                case 6 :
                    System.out.println("Thank you..");
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
    public static void creatAccount(){
        System.out.println("Enter Account Number: ");
        AccNum[count] = input.nextInt();
        System.out.println("Enter Name: ");
        name[count] = input.nextLine();
        System.out.println("Enter Balance: ");
        balance[count] = input.nextInt();
        count ++ ;
        System.out.println("Account created successfully ");
    }
    public static void deposit(){
        System.out.println("Enter account number: ");
        int num = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (AccNum[i] == num){
                System.out.println("Enter amount to be deposited: ");
                double amount = input.nextDouble();
                balance[i] += amount;
                System.out.println("Account deposited successfully ");
            }
        }
    }
    public static void withdraw() {
        System.out.println("Enter account number: ");
        int num = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (AccNum[i] == num) {
                System.out.println("Enter amount to be withdrawn: ");
                double amount = input.nextDouble();
                if (balance[i] >= amount) {
                    balance[i] -= amount;
                    System.out.println("Account withdrawn successfully ");
                } else {
                    System.out.println("Account withdrawn failed");
                }
            }
        }
    }
    public static void searchAccount(){
    System.out.println("Enter account number: ");
        int num = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (AccNum[i] == num) {
                System.out.println("Account Number: " + AccNum[i]);
                System.out.println("Account name: " + name[i]);
                System.out.println("Account balance: " + balance[i]);
            }
        }
    }
    public static void displayAllaccount(){
        for (int i = 0; i < count; i++) {
            System.out.println("Account Number: " + AccNum[i]);
            System.out.println("Account name: " + name[i]);
            System.out.println("Account balance: " + balance[i]);
        }
    }
}