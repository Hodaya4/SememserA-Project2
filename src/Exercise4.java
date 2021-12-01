public class Exercise4 {
    public static int numOfSimilarities(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1 ; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
    public static int[] arrNoDoubles(int[] arr, int counter){
        int[] arrNoDoubles = new int[arr.length - counter];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (index == arrNoDoubles.length) {
                break;
            }
            for (int j = 0; j < arrNoDoubles.length; j++){
                if (arr[i] == arrNoDoubles[j] && j <= index){
                    break;
                }
                else if (arr[i] != arrNoDoubles[j] && j == index){
                    arrNoDoubles[index] = arr[i];
                    index++;
                    break;
                }
            }
        }
        return arrNoDoubles;
    }
    public static void printArray(int[] finalArr){
        System.out.print("{");
        for (int i = 0; i < finalArr.length - 1 ; i++) {
            System.out.print(finalArr[i] + "|");
        }
        System.out.print(finalArr[finalArr.length - 1]);
        System.out.println("}");
    }


    public static void main(String[] args) {
        int[] arr = {1,4,7,1,8,9,2,1,3,8,0};
        int counter = numOfSimilarities(arr);
        int[] finalArr = arrNoDoubles(arr, counter);
        printArray(finalArr);
    }
}