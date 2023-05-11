package cafeallocationsystem;


import java.util.Scanner;

public class CafeAllocationSystem {
    public static void main(String[] args) {

        System.out.println("***   Welcome to our Cafe   ***");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {

            BookTable bookTable = new BookTable();

            PrintMenu printMenu = new PrintMenu();

            PlaceOrder placeOrder = new PlaceOrder();
            System.out.println("-----------------------------");
            System.out.println("Please enter: ");
            System.out.println(" '1' to Book Table");
            System.out.println(" '2' to Print Menu");
            System.out.println(" '3' to Place Order");
            System.out.println(" '0' to Exit");
            System.out.println("-----------------------------");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("--- Book Table ---");
                    //bookTable.hasReservation(hasTable);
                    bookTable.bookTable();
                    break;
                case 2:
                    System.out.println("--- Print Menu ---");
                    printMenu.displayMenu();
                    break;
                case 3:
                    if(BookTable.hasTable == false){
                        try{
                            throw new NoReservationFound();
                        } catch (NoReservationFound e) {
                        }
                    }
                    else {
                        System.out.println("--- Order Please ---");
                        placeOrder.inputDetails();
                    }
                    break;
                case 0:
                    flag = false;
                    System.out.println("--- Exit ---");
                    System.exit(0);
                    break;
                default:
                    System.out.println("--- Invalid choice entered. Please select from the above menu ---");
                    break;
            }
        }


    }
}

/*
-- Please Enter 0 to exit ---- Enter 1 to Book Table ---- Enter 2 to Print Menu ---- Enter 3 to Place Order --
1
--- Book Table ---
Please enter your name
harini
Enter the number of seats to be booked
3
Yay! Table of 4 is booked for you!
-- Please Enter 0 to exit ---- Enter 1 to Book Table ---- Enter 2 to Print Menu ---- Enter 3 to Place Order --
2
--- Print Menu ---
----------------------------------------------------
## S.No |  Food Item Name  |  Price Of OrderedItem ##
- - - - - - - - - - - - - - - - - - - - - - - - - - -
  (0)   |  Coffee          |  80
  (1)   |  French fries    |  180
  (2)   |  Veg Burger      |  150
  (3)   |  Chicken Burger  |  220
  (4)   |  Pizza           |  190
  (5)   |  Ice cream       |  160
----------------------------------------------------
Please Order Something!
-- Please Enter 0 to exit ---- Enter 1 to Book Table ---- Enter 2 to Print Menu ---- Enter 3 to Place Order --
3
--- Order Please ---
Please enter your Table number
3
Please enter your choice as 'yes' to order and 'no' to exit
yes
----------------------------------------------------
## S.No |  Food Item Name  |  Price Of OrderedItem ##
- - - - - - - - - - - - - - - - - - - - - - - - - - -
  (0)   |  Coffee          |  80
  (1)   |  French fries    |  180
  (2)   |  Veg Burger      |  150
  (3)   |  Chicken Burger  |  220
  (4)   |  Pizza           |  190
  (5)   |  Ice cream       |  160
----------------------------------------------------
Please Order Something!
Enter the number of items you want to order
4
Please enter the serialNo of your order as in the menu
0
Please enter the required quantity of your order
1
Please enter the serialNo of your order as in the menu
5
Please enter the required quantity of your order
3
Please enter the serialNo of your order as in the menu
2
Please enter the required quantity of your order
1
Please enter the serialNo of your order as in the menu
3
Please enter the required quantity of your order
2
itemOrdered: Coffee         |   quantityOrdered: 1   |   totalCost: 80
itemOrdered: Ice cream      |   quantityOrdered: 3   |   totalCost: 480
itemOrdered: Veg Burger     |   quantityOrdered: 1   |   totalCost: 150
itemOrdered: Chicken Burger |   quantityOrdered: 2   |   totalCost: 440
---   Order number of your order is: 129   ---
----- Total bill to be paid for this order number-129 is: 1150 -----
-- Please Enter 0 to exit ---- Enter 1 to Book Table ---- Enter 2 to Print Menu ---- Enter 3 to Place Order --
0
--- Exit ---

Process finished with exit code 0


 */