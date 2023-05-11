package evaluation5;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
  //  long mobileNo = random.nextLong() % 10000000000L;
  HashSet<Integer> mobNoSet = new HashSet<>();
  int mobileNo;
    public int validity;
    public int amount;
    public int iniBal;
    public String name;
    public String email;
    public String address;
    public String aadhaarNo;
    public String simType;

   public User(){

    }
    public User(String name,String email,String address,String aadhaarNo,String simType){
        this.name = name;
        this.email = email;
        this.address = address;
        this.aadhaarNo = aadhaarNo;
        this.simType = simType;

    }

    @Override
    public String toString() {
        return "User{" +
                "mobNoSet=" + mobNoSet +
                ", mobileNo=" + mobileNo +
                ", validity=" + validity +
                ", amount=" + amount +
                ", iniBal=" + iniBal +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", aadhaarNo='" + aadhaarNo + '\'' +
                ", simType='" + simType + '\'' +
                '}';
    }

    public void newConnection(){
        System.out.println("--- New Connection --");
        System.out.println("Please enter your details--");
        System.out.println("Enter name ");
        name = sc.nextLine();
        System.out.println("Enter email ");
         email = sc.nextLine();
        System.out.println("Enter address ");
        address = sc.nextLine();
        System.out.println("Enter aadhaarNo ");
        aadhaarNo = sc.nextLine();
        System.out.println("Enter SimType: prepaid/postpaid ");
        simType = sc.nextLine();
        System.out.println("Enter initial balance ");
        iniBal = sc.nextInt();
        validity = 30;

        mobileNo = random.nextInt(900000000) + 1000000000;
        System.out.println("Your mobile no is: "+mobileNo);


//        HashSet<Long> mobNoSet = new HashSet<>();
        mobNoSet.add(mobileNo);


    }
    public void viewAllUsers(){
        for(Integer i : mobNoSet){
            System.out.println("Mobile numbers of users are: "+i);
        }

    }
}
