public class Exercise5 {
    public static int ifGoingUpAndDown(int[] arr) {
        int largest = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                if (largest == arr[i]) {
                    index = i;
                }
            }
        }
        boolean ifGoingUp = true;
        boolean ifGoingDown = true;

        if (index == 0 || index == arr.length -1) { // ASK SHAI
            ifGoingDown = false;
            ifGoingUp = false;
        }

        for (int i = 0; i < index; i++) { // checks if going up until largest
            if (arr[i] >= arr[i + 1]) {
                ifGoingUp = false;
                return -1;
            }
        }

        for (int i = index + 1; i < arr.length - 1; i++) { // checks if going down until end
            if (arr[i] <= arr[i + 1]) {
                ifGoingDown = false;
                return -1;
            }
        }

        if (ifGoingUp == true && ifGoingDown == true) {
            return index;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] arr = {23,6,4,9,6};
        int res = ifGoingUpAndDown(arr);
        System.out.println(res);
    }
}
