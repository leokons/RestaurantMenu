package restaurant;

import javax.swing.*;
import java.util.Scanner;

public class Restaurant {
    private static Menu menu = new Menu();
    private static int menuIDNum = 1;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int selection = 0;
            do {
                System.out.println();
                System.out.println("Welcome to the restaurant!");
                System.out.println("1) Print the menu");
                System.out.println("2) Print single menu item");
                System.out.println("3) Add a menu item");
                System.out.println("4) Remove a menu item");
                System.out.println("5) Exit");
                System.out.print("Selection: ");

                String userInput = in.nextLine();

                selection = Integer.parseInt(userInput);

                switch (selection) {
                    case 1:
                        System.out.println(menu.getLastUpdated());
                        for (MenuItem menuItems : menu.getMenu()) {
                            System.out.println(menuItems.toString());
                        }
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Enter the menu ID you wish to print: ");
                        String userInToPrint = in.nextLine();

                        int menuIDToPrint = Integer.parseInt(userInToPrint);
                        for (MenuItem menuItem : menu.getMenu()) {
                            if (menuItem.getMenuId() == menuIDToPrint) {
                                System.out.println(menuItem);
                                break;
                            }
                        }
                    case 3:
                        System.out.println("Enter menu item description: ");
                        String desc = in.nextLine();
                        System.out.println("Enter menu item price: ");
                        String priceStr = in.nextLine();
                        System.out.println("Enter menu category: ");
                        String category = in.nextLine();

                        double price = Double.parseDouble(priceStr);
                        menu.addMenuItem(new MenuItem(menuIDNum++, desc, price, MenuCategory.valueOf(category)));
                        break;
                    case 4:
                        System.out.println("Please enter the menu item ID you wish to delete: ");
                        String deleteItemId = in.nextLine();

                        int menuIdToDelete = Integer.parseInt(deleteItemId);
                        menu.removeMenuItem(menuIdToDelete);

                        break;
                }

            } while (selection != 5);

            System.out.println("Goodbye!");
            System.exit(0);
        } catch (Exception e) {
            System.err.println("Noooooooooooope");
            System.exit(1);
        }
    }


}
