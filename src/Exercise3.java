import java.util.Scanner;
public class Exercise3 { //should be String
    public static String correctPhoneNumber(String num) {
        int count = 0; // checks if the String 'number' is built only by numbers.
        char[] digits = {'0','1','2','3','4','5','6','7','8','9', '-'};
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < digits.length; j++) {
                if (num.charAt(i) == digits[j]) {
                    ++count;
                }
            }
        } if (count != num.length()) {
            return"";
        }

        if (num.charAt(0) == '0' && num.charAt(1) == '5' && num.charAt(2) == '0' && num.length() == 10) {
            System.out.println("050-" + num.charAt(3) + num.charAt(4) + num.charAt(5) + num.charAt(6) + num.charAt(7) + num.charAt(8) + num.charAt(9));
        }
        else if (num.charAt(0) == '0' && num.charAt(1) == '5' && num.charAt(2) == '0' && num.charAt(3) == '-' && num.length() == 11) {
            System.out.println(num);
        }
        else if (num.charAt(0) == '9' && num.charAt(1) == '7' && num.charAt(2) == '2' && num.charAt(3) == '5' && num.charAt(4) == '0' && num.length() == 12) {
            System.out.println("050-" + num.charAt(5) + num.charAt(6) + num.charAt(7) + num.charAt(8) + num.charAt(9) + num.charAt(10) + num.charAt(11));
        }
        else {
            return"";
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phone number: ");
        String num = new String(sc.nextLine());
        correctPhoneNumber(num);
    }
}
