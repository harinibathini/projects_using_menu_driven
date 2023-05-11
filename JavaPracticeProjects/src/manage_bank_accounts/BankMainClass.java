package manage_bank_accounts;

import java.util.Scanner;

public class BankMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageBankAccount manageBankAccount = new ManageBankAccount();
        System.out.println("*******  Welcome to BANK  *******");
        while(true){
            System.out.println("------------------------------");
            System.out.println("enter choice as : ");
            System.out.println("'1' ADD BANK ACCOUNT");
            System.out.println("'2' DEPOSIT AMOUNT");
            System.out.println("'3' WITHDRAW AMOUNT");
            System.out.println("'4' DISPLAY ALL ACCOUNT DETAILS");
            System.out.println("'0' EXIT");
            System.out.println("------------------------------");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("---  ADD BANK ACCOUNT- CURRENT/SAVINGS");
                    manageBankAccount.addBankAccount();
                    break;
                case 2:
                    System.out.println("---  DEPOSIT AMOUNT");
                    manageBankAccount.deposit();
                    break;
                case 3:
                    System.out.println("---  WITHDRAW AMOUNT");
                    manageBankAccount.withdraw();
                    break;
                case 4:
                    System.out.println("---  DISPLAY ALL ACCOUNT DETAILS");
                    manageBankAccount.displayDetails();
                    break;
                case 0:
                    System.out.println("---  EXIT");
                    System.exit(0);
                    break;
                default:
                    System.out.println("-- Please enter a valid choice --");
                    break;
            }
        }
    }
}
