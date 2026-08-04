import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temps = new int[7];
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature of day " + (i + 1) + ": ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        int Highest_temp = temps[0];
        int Lowest_temp = temps[0];
        for (int i = 0; i < 7; i++) {
            if (temps[i] > Highest_temp) {
                Highest_temp = temps[i];
            }
            if (temps[i] < Lowest_temp) {
                Lowest_temp = temps[i];
            }
        }
        double weekly_average = sum / 7.0;
        int days_above_average = 0;
        for (int i = 0; i < 7; i++) {
            if (temps[i] > weekly_average) {
                days_above_average++;
            }
        }
        System.out.println("Highest temperature: " + Highest_temp);
        System.out.println("Lowest temperature: " + Lowest_temp);
        System.out.println("weekly average: " + weekly_average);
        System.out.println("days above average: " + days_above_average);
    }
}