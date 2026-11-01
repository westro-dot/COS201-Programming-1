import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the number of items: ");
        int quantityBought = scanner.nextInt();

        double amount = unitPrice * quantityBought;

        System.out.println("\n===== PURCHASE SUMMARY =====");
        System.out.println("Product: " + productName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity Purchased: " + quantityBought);
        System.out.println("Total Amount: " + amount);

        scanner.close();
    }
}