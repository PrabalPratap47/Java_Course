import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ticketNumber = input.nextInt();

        if (ticketNumber % 10 == 3 || ticketNumber % 10 == 8) {
            System.out.println("Lucky winner");
        } else {
            System.out.println("Not a lucky winner");
        }
    }
}