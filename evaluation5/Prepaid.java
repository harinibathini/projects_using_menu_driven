package evaluation5;

import assignment14.InsufficientBalanceException;

import java.util.Scanner;
import java.util.*;

public class Prepaid extends User{
    int validity = this.validity;
    int amount = this.amount;
    int iniBal = this.iniBal;

    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    public void prepaidMenu(){
        System.out.println("___Prepaid___");
        System.out.println("Please enter your Mobile Number: ");
        String mobileNo = sc.nextLine();
        boolean flag1 = true;
        while(flag1){
            System.out.println("******************************");
            System.out.println("Enter your choice as : ");
            System.out.println("'0' to Check Balance and Validity");
            System.out.println("'1' to Recharge --");
            System.out.println("'2' to Exit --");

            System.out.println("******************************");
            int choice1 = sc.nextInt();
            switch (choice1){
                case 0:
                    System.out.println("--- Check Balance and Validity");
                    checkBalanceAndValidity();
                    break;
                case 1:
                    System.out.println("---  Recharge");
                    recharge();
                    break;
                case 2:
                    System.out.println("--- Exit");
                    flag1 = false;
                    break;
                default:
                    System.out.println("--- Please enter a valid Choice");
            }

        }
    }
    public void checkBalanceAndValidity(){
       //display name,balance,validity of user
        System.out.println("Name of user: ");
        System.out.println("Balance of user: "+iniBal);
        System.out.println("Validity of user: "+validity);
    }
    public void recharge(){
        System.out.println("Enter the amount you want to Recharge:--200 for 1 month ");
        amount = sc.nextInt();

                if (amount >= 200) {
                    System.out.println("Amount entered for recharge is: " + amount);
                }else {
                    try {
                        throw new RechargeAmountTooLowException();
                    } catch (RechargeAmountTooLowException e) {
                    }
                }

            iniBal = iniBal + amount;
                System.out.println("New balance is :"+iniBal);
           validity = 30;
           System.out.println("validity is: " + validity);
    }

}
