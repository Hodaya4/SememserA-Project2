import java.util.Scanner;

public class Exercise1 {
    public static boolean ifInclude(String str1, String str2) {
        boolean answer;
        if(str1.length()<str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (i+j < str1.length() && str1.charAt(i+j) == str2.charAt(j)) {
                    if(j==str2.length()-1){
                        return true;
                    }
                } else{
                    break;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1  = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2  = sc.nextLine();
        boolean result = ifInclude(str1, str2);
        System.out.println(result);

    }
}