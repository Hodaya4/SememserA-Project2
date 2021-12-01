import java.util.Scanner;

public class Exercise2 {
    public static void printBiggerThanAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / 10F;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        printBiggerThanAverage(arr);
    }
}
