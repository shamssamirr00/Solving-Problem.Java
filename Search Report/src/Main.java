import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int arr_size = input.nextInt();
        int [] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            System.out.println("Enter array element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter array target : ");
        int target = input.nextInt();
        int position = -1 ;
        int occurrences = 0;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] == target) {
                occurrences++;
                if (position == -1) {
                    position = i;
                }
            }
        }
        if (occurrences > 0) {
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }
        System.out.println("position = " + position );
        System.out.println("occurrences = " + occurrences);
    }
}
