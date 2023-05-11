package exambooking;
import java.util.Scanner;
public class ViewAttendance {
    static float attendance = 0.0f;
    static boolean isEligible = false;
    Scanner sc = new Scanner(System.in);
    public void displayDetails(){
        System.out.println("--  Enter your Name");
        String name = sc.nextLine();
        System.out.println("--  Enter your ID");
        int id = sc.nextInt();
        System.out.println("--  Enter your Attendance for this semester");
        attendance = sc.nextFloat();
    }
    public void displayAttendance(){
        System.out.println("--  Your Attendance is: "+attendance);

    }
}
