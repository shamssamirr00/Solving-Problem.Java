import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an array element: " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int largest_num = arr[0];
        int secondLargest_num = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest_num) {
                secondLargest_num = largest_num;
                largest_num = arr[i];
            }else  if (arr[i] > secondLargest_num && arr[i] !=largest_num) {
                secondLargest_num = arr[i];
            }
        }
    System.out.println("The largest number is: " + largest_num);
    System.out.println("The second largest number is: " + secondLargest_num);
    }
}