package cafeallocationsystem;
import java.util.*;
import java.util.Scanner;

public class PrintMenu extends BookTable {
    Scanner sc = new Scanner(System.in);
    String menu[] = {"Coffee        ", "French fries  ", "Veg Burger    ", "Chicken Burger", "Pizza         ", "Ice cream     "};
    int price[] = {80, 180, 150, 220, 190, 160};
    int serialNo[] = {0, 1, 2, 3, 4, 5};

    public void displayMenu() {
        System.out.println("----------------------------------------------------");
        System.out.println("## S.No |  Food Item Name  |  Price Of OrderedItem ##");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("  (" + serialNo[i] + ")" + "   " + "|  " + menu[i] + "  " + "|  " + price[i]);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Please Order Something!");
    }
}
//    public void takeOrder(){
//        System.out.println("Do you want to order anything:)");
//        String response = sc.nextLine();
//        switch(response){
//            case "yes":
//                System.out.println("Please select your order from menu: ");
//                String order = sc.nextLine();
//                break;
//            case "no":
//                System.out.println("Your order is being processed and will be served to you");
//                break;
//            default:
//                System.out.println("Please enter the valid response");
//        }
//    }

//    public static void main(String[] args) {
//        PrintMenu printMenu = new PrintMenu();
//        printMenu.displayMenu();
//    }

