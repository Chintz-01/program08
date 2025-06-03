import java.util.Scanner;

public class DivisibilityBy10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (isDivisibleBy10(number)) {
            System.out.println(number + " is divisible by 10.");
        } else {
            System.out.println(number + " is not divisible by 10.");
        }

        scanner.close();
    }
    public static boolean isDivisibleBy10(int num) {
        return num % 10 == 0;
    }
}
