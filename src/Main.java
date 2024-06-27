//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Clothing");
            System.out.println("3. Display Cart");
            System.out.println("4. Calculate Total Price");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter product name: ");
                        String eName = scanner.next();
                        System.out.print("Enter product ID: ");
                        int eId = scanner.nextInt();
                        System.out.print("Enter price: ");
                        double ePrice = scanner.nextDouble();
                        System.out.print("Enter quantity in stock: ");
                        int eStock = scanner.nextInt();
                        System.out.print("Enter brand: ");
                        String eBrand = scanner.next();
                        System.out.print("Enter warranty period (months): ");
                        int eWarranty = scanner.nextInt();

                        Electronics electronics = new Electronics(eName, eId, ePrice, eStock, eBrand, eWarranty);
                        cart.addProduct(electronics);
                        break;

                    case 2:
                        System.out.print("Enter product name: ");
                        String cName = scanner.next();
                        System.out.print("Enter product ID: ");
                        int cId = scanner.nextInt();
                        System.out.print("Enter price: ");
                        double cPrice = scanner.nextDouble();
                        System.out.print("Enter quantity in stock: ");
                        int cStock = scanner.nextInt();
                        System.out.print("Enter size: ");
                        String cSize = scanner.next();
                        System.out.print("Enter material: ");
                        String cMaterial = scanner.next();

                        Clothing clothing = new Clothing(cName, cId, cPrice, cStock, cSize, cMaterial);
                        cart.addProduct(clothing);
                        break;

                    case 3:
                        cart.displayCartContents();
                        break;

                    case 4:
                        System.out.println("Total Price: " + cart.calculateTotalPrice());
                        break;

                    case 5:
                        System.out.print("Enter product ID to delete: ");
                        int deleteId = scanner.nextInt();
                        cart.deleteProduct(deleteId);
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            } catch (DuplicateProductIDException | ProductNotFoundException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

