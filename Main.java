

import java.util.ArrayList;
import java.util.Scanner;




public class Main {




        public static void addItem (Scanner scanner, ArrayList < Inventory > items){
            System.out.println("Enter item to add to inventory");
            String text = scanner.nextLine();
            String category = scanner.nextLine();
            Inventory item = new Inventory(text, 0, category);
            items.add(item);

        }

    public static void removeItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Enter item you wish to remove");
        String numStr = scanner.nextLine();
        int num = Integer.valueOf(numStr);
        items.remove(num - 1);
    }

    public static void listItem(ArrayList<Inventory> items) {
        int i = 1;
        for (Inventory inventory : items) {
            //System.out.println ("[" + inventory.quantity + "] " + i + ". " + inventory.name);
            System.out.printf("[ %s ].", inventory.quantity, i, inventory.name);
            i++;

        }
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
        ArrayList<Inventory> items = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item to Inventory");
            System.out.println("2. Remove Item");
            System.out.println("3. List Items");
            System.out.println("4. Update Item Quantity");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    addItem(scanner, items);

                    break;

                case "2":
                    removeItem(scanner, items);

                    break;

                case "3":
                    listItem(items);

                    break;

                case "4":
                    updateQuantity(scanner, items);

                default:
                    System.out.println("Invalid option.");
                }

            }

        }


    }

