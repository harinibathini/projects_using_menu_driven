package simcallcenter;

import java.util.Scanner;

public class CallCenterMainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserOperations userOperations = new UserOperations();
        boolean flag = true;
        while (flag){
            System.out.println("---------------------------");
            System.out.println("Enter your choice as: ");
            System.out.println("'1' to select Prepaid User ---");
            System.out.println("'2' to select New connection ---");
            System.out.println("'3' to View All Users ---");
            System.out.println("'0' to Exit ---");
            System.out.println("---------------------------");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println(" Prepaid User ---");
                    userOperations.prepaid();
                    break;
                case 2:
                    System.out.println(" New connection ---");
                    userOperations.newConnection();
                    break;
                case 3:
                    System.out.println(" View All Users ---");
                    userOperations.viewAllUsers();
                    break;
                case 0:
                    System.out.println(" Exit ---");
                    flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("-- Please enter a valid choice");
                    break;
            }
        }
    }
}
