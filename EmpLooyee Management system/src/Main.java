import java.util.Scanner;

public class Main {
        static Scanner input = new Scanner(System.in);
        static int [] id = new int[10];
        static String[] name = new String[10];
        static double[] salary = new double[10];
        static int count = 0;
        public static void main(String[] args){
            while(true){
                System.out.println("\n Employee Management System MENU");
                System.out.println("1. Add Employee");
                System.out.println("2. Search Employee");
                System.out.println("3. Update Employee Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Display All Employee ");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        searchEmployee();
                        break;
                    case 3:
                        updateSlary();
                        break;
                    case 4:
                        deletEmployee();
                        break;
                    case 5:
                        displayAllEmployee();
                        break;
                    case 6:
                        System.out.println("Bye!");
                        return;
                    default:
                        System.out.println("Invalid choice");
            }
        }
    }
    public static void addEmployee(){
            System.out.println("Enter ID : ");
            id[count] = input.nextInt();
            System.out.println("Enter name : ");
            name[count] = input.next();
            System.out.println("Enter salary : ");
            salary[count] = input.nextDouble();
            count++;
            System.out.println("Employee Added Successfully");
    }
    public static void searchEmployee(){
            System.out.println("Enter ID : ");
            int num = input.nextInt();
            for(int i = 0; i < count; i++){
                if(id[i] == num){
                    System.out.println("ID : "+id[i]);
                    System.out.println("Name : "+name[i]);
                    System.out.println("Salary : "+salary[i]);
                    return;
                }
            }
            System.out.println("Employee Not Found");
    }
    public static void updateSlary(){
            System.out.println("Enter ID : ");
            int num = input.nextInt();
            for(int i = 0; i < count; i++){
                if(id[i] == num){
                    System.out.println("Enter new salary : ");
                    salary[i] = input.nextDouble();
                    System.out.println("Salary updated successfully");
                    return;
                }
            }
            System.out.println("Employee not Found");
    }
    public static void deletEmployee(){
            System.out.println("Enter ID : ");
            int num = input.nextInt();
            for(int i = 0; i < count; i++){
                if(id[i] == num){
                    for(int j = i ; j < count-1 ; j++){
                        id[j] = id[j+1];
                        name[j] = name[j+1];
                        salary[j] = salary[j+1];
                    }
                    count--;
                    System.out.println("Employee Deleted Successfully");
                    return;
                }
            }
            System.out.println("Employee Not Found");
    }
    public static void displayAllEmployee(){
            if(count == 0) {
                System.out.println("Employee Not Found");
                return;
            }
            for(int i = 0; i < count; i++) {
                System.out.println("ID : " + id[i]);
                System.out.println("Name" + name[i]);
                System.out.println("Salary : " + salary[i]);
            }
    }
}