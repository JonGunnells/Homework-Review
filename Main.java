

import java.util.ArrayList;
import java.util.Scanner;




public class Main {

    public static Inventory createItem(String name, int quantity, String category) {

        switch (category) {

            case "Food":
                return new Food(name, quantity);

            case "Clothing":
                return new Clothing(name, quantity);

            case "Tools":
                return new Tools(name, quantity);

            case "Office Supplies":
                return new OfficeSupplies(name, quantity);

            case "Electronics":
                return new Electronics(name, quantity);


            default:
                System.out.println("No Such Category");

        }
        return new Inventory();


    }

    public static void addItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Enter Item");
        String name = scanner.nextLine();
        System.out.println("Enter Quantity");
        int quantity = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter Category");
        String category = scanner.nextLine();
        Inventory inventory = createItem(name, quantity, category);
        items.add(inventory);


    }

    public static void removeItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Enter item number you wish to remove from the list.");
        int num = Integer.valueOf(scanner.nextLine());
        items.remove(num - 1);
    }



    public static void updateQuantity(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Enter item you with to update");
        String itemStr = scanner.nextLine();
        int item = Integer.valueOf(itemStr);

        System.out.println("Enter new quantity");
        String quantityStr = scanner.nextLine();
        int quantity = Integer.valueOf(quantityStr);

        Inventory inv = items.get(item - 1);
        inv.quantity = quantity;
    }

    public static void main(String[] args) {

        while (true) {
            ArrayList<Inventory> items = new ArrayList();
            Scanner scanner = new Scanner(System.in);


            System.out.println("1. Add Item to Inventory");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item Quantity");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    addItem(scanner, items);

                    break;

                case "2":
                    removeItem(scanner, items);

                    break;


                case "3":
                    updateQuantity(scanner, items);

                    break;

                default:
                    System.out.println("Invalid option.");
            }

        }

    }
}



