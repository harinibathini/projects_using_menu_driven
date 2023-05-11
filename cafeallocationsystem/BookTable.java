package cafeallocationsystem;
import java.util.Scanner;
public class BookTable extends Thread{
    static int tableOf2 = 8;
    static int tableOf4 = 4;
    static int tableOf6 = 2;
    static int tableOf8 = 2;
    static boolean hasTable = false;
    Scanner sc = new Scanner(System.in);
    //public void run() {
//        public void enterDetails() {
//            System.out.println("Please enter your name");
//            String reservationName = sc.nextLine();
//            System.out.println("Enter the number of seats to be booked");
//            int numberOfSeats = sc.nextInt();
//        }
        public void bookTable(){
            System.out.println("Please enter your name");
            String reservationName = sc.nextLine();
            System.out.println("Enter the number of seats to be booked");
            int numberOfSeats = sc.nextInt();
            int i = numberOfSeats;
            if (i>0 && i <= 2) {
                if (tableOf2 != 0) {
                    System.out.println("Yay! Table of 2 is booked for you!");
                    tableOf2--;
                    hasTable = true;
                } else if (tableOf4 != 0) {
                    System.out.println("Yay! Table of 4 is booked for you!");
                    tableOf4--;
                    hasTable = true;
                } else if (tableOf6 != 0) {
                    System.out.println("Yay! Table of 6 is booked for you!");
                    tableOf6--;
                    hasTable = true;
                } else if (tableOf8 != 0) {
                    System.out.println("Yay! Table of 8 is booked for you!");
                    tableOf8--;
                    hasTable = true;
                } else {
                    hasTable = false;
                    System.out.println("Sorry! no tables are empty");
                }
            } else if (i>0 && i <= 4) {
                if (tableOf4 != 0) {
                    System.out.println("Yay! Table of 4 is booked for you!");
                    tableOf4--;
                    hasTable = true;
                } else if (tableOf6 != 0) {
                    System.out.println("Yay! Table of 6 is booked for you!");
                    tableOf6--;
                    hasTable = true;
                } else if (tableOf8 != 0) {
                    System.out.println("Yay! Table of 8 is booked for you!");
                    tableOf8--;
                    hasTable = true;
                } else {
                    hasTable = false;
                    System.out.println("Sorry! no tables are empty");
                }
            } else if (i>0 && i <= 6) {
                if (tableOf6 != 0) {
                    System.out.println("Yay! Table of 6 is booked for you!");
                    tableOf6--;
                    hasTable = true;
                } else if (tableOf8 != 0) {
                    System.out.println("Yay! Table of 8 is booked for you!");
                    tableOf8--;
                    hasTable = true;
                } else {
                    hasTable = false;
                    System.out.println("Sorry! no tables are empty");
                }
            } else if (i>0 && i <= 8) {
                if (tableOf8 != 0) {
                    System.out.println("Yay! Table of 8 is booked for you!");
                    tableOf8--;
                    hasTable = true;
                } else {
                    hasTable = false;
                    System.out.println("Sorry! no tables are empty");
                }
            }
            else{
                hasTable = false;
                System.out.println("Sorry! No Seats Available");
            }
        }
       /* public boolean hasReservation(boolean hasTable){
            if(hasTable==true)
                return true;
            else
                return false;
        }*/
    //}
//    public static void main(String[] args) {
//        BookTable bookTable = new BookTable();
//        bookTable.bookTable();
//        System.out.println(bookTable.hasReservation(hasTable));
//    }

}
