import java.util.Scanner;

public class board {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the total number of coins left on the board: ");
        int totalCoins = Scanner.nextInt();

        System.out.print("Enter 'r' if the red coin has been pocketed: ");
        String redPocketed = Scanner.next();

        // Check for valid input
        if (totalCoins < 1 || totalCoins > 9) {
            System.out.println("Invalid Input");
        } else {
            int points;
            if (redPocketed.equals("r")) {
                points = totalCoins + 5;
            } else {
                points = totalCoins;
            }

            System.out.println("Total points won: " + points);
        }
    }
}