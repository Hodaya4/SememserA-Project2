import java.util.Scanner;

public class Exercise6 {
    public static int[] intersection (int[] arr1, int[] arr2) {      // function 1
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }
        int[] arr3 = new int[count];

        int count2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[count2] = arr1[i];
                    count2++;
                }
            }
        }
        return arr3;
    }

    public static boolean ifEstranged (int[] arr1, int[] arr2) {       // function 2
        int[] arr3 = intersection(arr1, arr2);
        if (arr3.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {23, 45, 87, 93, 17, 34};
        int[] arr2 = {23, 50, 90, 17, 38};
        int[] arr = intersection(arr1, arr2);
        for (int i = 0; i < arr.length; i++) {         // for checkup
            System.out.println(arr[i]);
        }
        boolean res = ifEstranged(arr1, arr2);         // for checkup
        System.out.println(res);

    }
}