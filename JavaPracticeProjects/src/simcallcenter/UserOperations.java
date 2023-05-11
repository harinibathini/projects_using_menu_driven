package simcallcenter;

import java.util.*;

public class UserOperations {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    ArrayList<User> users = new ArrayList<>();

    public void prepaid() {
        System.out.println("Please enter your Mobile Number: ");
        int enteredMobileNo = sc.nextInt();
        boolean userExists = false;

        for (User user1 : users) {
            if (user1.mobileNo == enteredMobileNo) {
                userExists = true;


                boolean flag1 = true;
                while (flag1) {
                    System.out.println("******************************");
                    System.out.println("Enter your choice as : ");
                    System.out.println("'0' to Check Balance and Validity --");
                    System.out.println("'1' to Recharge --");
                    System.out.println("'2' to Exit --");
                    System.out.println("******************************");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 0:
                            System.out.println("--- Check Balance and Validity");
                            System.out.println("enter your name: "+user1.name);
                            System.out.println("your balance is: " + user1.balance);
                            System.out.println("validity is: " + user1.validity);
                            break;
                        case 1:
                            System.out.println("---  Recharge");
                            System.out.println("Enter recharge amount: ");
                            int amount = sc.nextInt();
                            if (amount <= 0) {
                                try {
                                    throw new RechargeAmountTooLowException();
                                } catch (RechargeAmountTooLowException e) {

                                }
                            } else {
                                user1.balance += amount;
                                user1.validity += 1;
                                System.out.println("Your balance and validity has been updated!");
                            }
                            break;
                        case 2:
                            System.out.println("--- Exit");
                            flag1 = false;
                            break;
                        default:
                            System.out.println("--- Please enter a valid Choice");
                            break;
                    }
                }
            }
        }
        if (!userExists) {
            try {
                throw new UserDoesNotExistException();
            } catch (UserDoesNotExistException e) {

            }
        }

    }


    public void newConnection() {

        int mobNo;

        while (true) {
            mobNo = random.nextInt(900000000) + 1000000000;
            boolean userAlreadyExists = false;
            for (User user1 : users) {
                if (user1.mobileNo == mobNo) {
                    userAlreadyExists = true;
                }
            }
            if (!userAlreadyExists) {
                break;
            }
        }

        System.out.println("Please enter your details as prompted --");
        System.out.println("Enter Name --");
        String name = sc.next();
       // String name = sc.nextLine();
        System.out.println("Enter Email --");
        String email = sc.next();
        //String email = sc.nextLine();
        System.out.println("Enter Address --");
        String address = sc.next();
        //String address = sc.nextLine();
        System.out.println("Enter AadharNo --");
        String aadharNo = sc.next();
        //String aadharNo = sc.nextLine();
        System.out.println("Enter SimType : 'prepaid' / 'postpaid' --");
        String simType = sc.next();
        //String simType = sc.nextLine();
        System.out.println("Enter Initial Balance --");
        int balance = sc.nextInt();


        users.add(new User(name, email, address, aadharNo, simType, balance, mobNo));

        System.out.println("You have been successfully Registered!!");
        System.out.println("Your mobileNo is: "+mobNo);

    }

    public void viewAllUsers() {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (o1.name).compareTo(o2.name);
            }
        });
        for (User user : users) {
            System.out.println(user);
        }
    }
}
