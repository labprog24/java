import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the numerator:");
            int numerator = scanner.nextInt();
            System.out.println("Enter the denominator:");
            int denominator = scanner.nextInt();
            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (java.util.InputMismatchException ime) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }

    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }
}
