import java.util.Scanner;

public class Exercise7 {
    public static final char[] BOARD = new char[9];

    public static void printBoard() {
        System.out.println("-------------");
        System.out.println("| " + BOARD[0] + " | " + BOARD[1] + " | " + BOARD[2] + " |");
        System.out.println("-------------");
        System.out.println("| " + BOARD[3] + " | " + BOARD[4] + " | " + BOARD[5] + " |");
        System.out.println("-------------");
        System.out.println("| " + BOARD[6] + " | " + BOARD[7] + " | " + BOARD[8] + " |");
        System.out.println("-------------");

    }

    public static boolean isAvailable(char BOARD[], int spot) {
        if (BOARD[spot] == 'X' || BOARD[spot] == 'O') {
            return false;
        } else {
            return true;
        }
    }

    public static int getPositionFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wanted position, from 1 to 9, to mark.");
        int spot = sc.nextInt() - 1;
        if (spot > 8 || spot < 0) {
            while (spot > 8 || spot < 0) {
                System.out.println("ERROR: invalid spot. Please try again. ");
                spot = sc.nextInt() - 1;
                return spot;
            }
        }
        if (BOARD[spot] == 'X' || BOARD[spot] == 'O') {
            while (BOARD[spot] == 'X' || BOARD[spot] == 'O') {
                System.out.println("ERROR: spot already marked. Please try again. ");
                spot = sc.nextInt() - 1;
                return spot;
            }
        } return spot;
    }

    public static char checkWinner(char BOARD[]) {
        for (int i = 0; i < 3; i++) {
            if (BOARD[0 + i] == 'X' && BOARD[3 + i] == 'X' && BOARD[6 + i] == 'X') {
                return 'X';
            } else if (BOARD[0 + i] == 'O' && BOARD[3 + i] == 'O' && BOARD[6 + i] == 'O') {
                return 'O';
            }
        }

        for (int i = 0; i < 7; i = i + 3) {
            if (BOARD[0 + i] == 'X' && BOARD[1 + i] == 'X' && BOARD[2 + i] == 'X') {
                return 'X';
            } else if (BOARD[0 + i] == 'O' && BOARD[1 + i] == 'O' && BOARD[2 + i] == 'O') {
                return 'O';
            }
        }

        if (BOARD[0] == 'X' && BOARD[4] == 'X' && BOARD[8] == 'X'  ||  BOARD[2] == 'X' && BOARD[4] == 'X' && BOARD[6] == 'X') {
            return 'X';
        } else if (BOARD[0] == 'O' && BOARD[4] == 'O' && BOARD[8] == 'O'  ||  BOARD[2] == 'O' && BOARD[4] == 'O' && BOARD[6] == 'O') {
            return 'O';
        } else {
            return '-';
        }

    }

    public static boolean placeSymbolOnBoard (char BOARD[], char symbol, int spot) {
        isAvailable(BOARD, spot);
        BOARD[spot] = symbol;
        printBoard();
        char res = checkWinner(BOARD);
        if (res == 'X' || res == 'O') {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char symbol = 'X';
        int spot = getPositionFromUser();
        boolean outcome = placeSymbolOnBoard(BOARD, symbol, spot);
        int i = 1;
        int count = 0;

        while (!outcome) {
            if(i % 2 == 0) {
                symbol = 'X';
            }
            else {
                symbol = 'O';
            }
            spot = getPositionFromUser();
            outcome  = placeSymbolOnBoard(BOARD, symbol, spot);
            i++;
            count++;
            if (count == 8) {
                System.out.println("The game has ended with a draw.");
                break;
            }
        }

        if (outcome == true) {
            System.out.println("Player " + symbol + " is the winner!" );
        }


    }
}