import java.util.Scanner;
public class Integer_swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.println("Enter two integers separated by a space: ");

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped integers: " + a + " " + b);
  scanner.close();
    }
}
