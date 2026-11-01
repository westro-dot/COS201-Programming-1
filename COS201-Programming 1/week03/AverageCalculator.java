import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Input the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Input the third number: ");
        double thirdNumber = scanner.nextDouble();

        double result = (firstNumber + secondNumber + thirdNumber) / 3.0;

        System.out.println("Average: " + result);

        scanner.close();
    }
}