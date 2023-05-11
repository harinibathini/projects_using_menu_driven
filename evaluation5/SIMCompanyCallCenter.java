package evaluation5;

import java.util.Scanner;

public class SIMCompanyCallCenter extends User{

    int mobileNo = this.mobileNo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){

            User user = new User();
            Prepaid prepaid = new Prepaid();


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
//                  if(mobNoSet.contains(mobileNo)) {
                      System.out.println(" Prepaid User ---");

                      prepaid.prepaidMenu();
//                  }else{
//                      try{
//                          throw new UserDoesNotExistException();
//                      }catch(UserDoesNotExistException e){
//
//                      }
//                  }
                    break;
                case 2:
                    System.out.println(" New connection ---");
                    user.newConnection();
                    break;
                case 3:
                    System.out.println(" View All Users ---");
                    //user.viewAllUsers();
                    System.out.println(user.toString());
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
