package manage_bank_accounts;

import simcallcenter.User;

import java.util.*;

public class ManageBankAccount {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    ArrayList<BankUser> bank = new ArrayList();
    double bal = 0.0d;
    public void addBankAccount(){
        String accType;
        System.out.println("Enter Account Type::  '1' for selecting 'current' ; '2' for selecting 'savings' ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                long accNo;
                while (true) {
                    long leftLimit = 100000000000L;
                    long rightLimit = 999999999999L;
                    accNo = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
                    //long AccountNo = random.nextLong(900000000000);
                    boolean exist = false;
                    for (BankUser bank1 : bank) {
                        if (bank1.getAccountNo() == accNo) {
                            exist = true;
                        }
                    }
                    if (!exist) {
                        break;
                    }
                }
                accType = "savings";
                System.out.println("--  enter details: ");
                System.out.println("enter Name");
                String name = sc.next();
                System.out.println("enter Address");
                String address = sc.next();
                System.out.println("enter Phone Number");
                Long phoneNumber = sc.nextLong();
                System.out.println("enter emailId");
                String emailId = sc.next();

                bank.add(new BankUser(name,address,phoneNumber,emailId, accType,bal,accNo));
                System.out.println("++++++++++++++++++++++++++++++++");
                System.out.println("Account No. is:: " + accNo);
                System.out.println("++++++++++++++++++++++++++++++++");
                break;
            case 2:
                accType = "current";
                System.out.println("enter Company Name");
                String companyName = sc.next();
                bank.add(new BankUser(companyName));
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }

    }
    public void deposit(){

            System.out.println("enter Account Number : ");
            long accNo = sc.nextLong();
            boolean accExist = false;
        for(BankUser bank1 : bank) {
            if (bank1.getAccountNo() == accNo) {
                accExist = true;
            }
        }

            if (accExist) {
                for(BankUser bank1 : bank) {
                    bank1.setBalance(bal);
                    System.out.println("Enter the amount to be deposited");
                    double deposit = sc.nextDouble();
                    bank1.balance = bank1.getBalance() + deposit;
                    System.out.println("Updated balance is: " + bank1.getBalance());
                }
            } else if(!accExist){
                try {
                    throw new AccountNotPresentException();
                } catch (AccountNotPresentException e) {

                }
            }
        }


    public void withdraw() {
            System.out.println("enter Account Number : ");
            long accNo = sc.nextLong();
            boolean accExist = false;
        for(BankUser bank1 : bank) {
            if (bank1.getAccountNo() == accNo) {
                accExist = true;
            }
        }
            if (accExist) {
                System.out.println("Enter the amount of withdrawal");
                double withdraw = sc.nextDouble();
                for(BankUser bank1 : bank) {
                if (bank1.balance - withdraw < 0) {
                    try {
                        throw new InsufficientBalanceException();
                    } catch (InsufficientBalanceException e) {

                    }
                } else {
                    bank1.balance = bank1.getBalance() - withdraw;
                    System.out.println("Updated balance is: " + bank1.getBalance());
                }
                }
            } else {
                try {
                    throw new AccountNotPresentException();
                } catch (AccountNotPresentException e) {

                }
            }
        }


    public void displayDetails(){
        Collections.sort(bank, new Comparator<BankUser>(){
            public int compare(BankUser o1, BankUser o2) {
                return (o1.getName()).compareTo(o2.getName()); }
            });
        for(BankUser bank1 : bank){
            System.out.println(bank);
        }

    }

}
