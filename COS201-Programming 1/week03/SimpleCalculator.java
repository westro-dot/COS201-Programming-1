import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("\nSelect an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Choose an option (1-4): ");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Answer: " + (firstNumber + secondNumber));
                break;

            case 2:
                System.out.println("Answer: " + (firstNumber - secondNumber));
                break;

            case 3:
                System.out.println("Answer: " + (firstNumber * secondNumber));
                break;

            case 4:
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Answer: " + (firstNumber / secondNumber));
                }
                break;

            default:
                System.out.println("Invalid option. Please select between 1 and 4.");
        }

        scanner.close();
    }
}