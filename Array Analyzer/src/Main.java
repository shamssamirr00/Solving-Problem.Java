import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Array size : ");
        int arr_size = input.nextInt();
        int [] array  = new int[arr_size];
        int sum = 0;
        for(int i = 0; i < arr_size; i++){
            array[i] = input.nextInt();
            sum += array[i];
        }
        int Largest = array[0];
        int smallest = array[0];
        for(int i = 1 ; i < arr_size ; i++) {
            if (array[i] > Largest) {
                Largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Largest number is = " + Largest);
        System.out.println("Smallest number is = " + smallest);
        System.out.println("Sum is = " + sum);
        System.out.println("Average number is = " + (sum / (double)arr_size));
    }
}