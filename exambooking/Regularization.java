package exambooking;

import java.util.Scanner;

public class Regularization extends ViewAttendance{
    Scanner sc = new Scanner(System.in);
    static float eventLeave = 3;
    static float emergencyLeave = 2;
    static float homeVisitLeave = 1;
    boolean flag1 = true;
    public void updateAttendance(){
      while(flag1) {
          System.out.println("------------------------------------------------------------");
          System.out.println("-- Enter your reason for Absence as:");
          System.out.println("'1' for updating attendance for event leaves");
          System.out.println("'2' for updating attendance for emergency leaves");
          System.out.println("'3' for updating attendance for homeVisit leaves");
          System.out.println("'0' to exit and to view your Updated Attendance");
          System.out.println("------------------------------------------------------------");
          int reasonForAbsence = sc.nextInt();
        switch (reasonForAbsence) {
            case 1:
                System.out.println("your attendance will be: 3 % + current attendance % for each eventLeave");
                System.out.println("Enter the no. of events attended");
                int events = sc.nextInt();
                attendance += (events * eventLeave);
                break;
            case 2:
                System.out.println("your attendance will be: 2 % + current attendance % for each emergencyLeave");
                System.out.println("Enter the no. of emergency leaves");
                int emergencies = sc.nextInt();
                attendance += (emergencies * emergencyLeave);
                break;
            case 3:
                System.out.println("your attendance will be: 2 % + current attendance % for each homeVisitLeave");
                System.out.println("Enter the no. of homeVisit leaves");
                int homeVisits = sc.nextInt();
                attendance += (homeVisits * homeVisitLeave);
                break;
            case 0:
                flag1 = false;
                System.out.println("Exit");
                break;
            default:
                System.out.println("Please enter a valid leave name");

        }
      }
        System.out.println("Your Updated attendance is: "+attendance);
        if(attendance>=75){
            isEligible = true;
        }
    }
}
