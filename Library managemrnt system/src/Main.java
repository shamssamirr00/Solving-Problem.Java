import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] books = new String[25];
        boolean[] borrowed = new boolean[25];
        int cont = 0;
        while ( true) {
            System.out.println(" --Library system-MENU-- ");
            System.out.println("1. Add Book " );
            System.out.println("2. Borrow Book " );
            System.out.println("3. Return Book " );
            System.out.println("4. Display Available Books " );
            System.out.println("5. Exit" );
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    books[cont] = input.next() ;
                    cont++;
                    break;
                case 2:
                    System.out.print("Enter book num: ");
                    int num = input.nextInt();
                    borrowed[num] = true;
            System.out.println("BOOK BORROWED");
                    break;
                case 3:
                    System.out.print("Enter book num: ");
                    int num2 = input.nextInt();
                    borrowed[num2] = false;
            System.out.println("BOOK RETURNED");
                    break;
                case 4:
                    System.out.print("Available Books : ");
                    for (int i = 0 ; i < cont ; i++) {
                        if(borrowed[i] == false) {
                            System.out.println(books[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}