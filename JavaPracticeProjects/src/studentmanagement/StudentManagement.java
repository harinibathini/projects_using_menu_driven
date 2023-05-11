package studentmanagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***  Student Management System  ***");
        boolean flag = true;
        while(flag){

            System.out.println("------------------------------");
            System.out.println("Please enter your choice as: ");
            System.out.println("'1' to Add a student");
            System.out.println("'2' to Display students");
            System.out.println("'3' to Add student Marks");
            System.out.println("'4' to Display student Result");
            System.out.println("'0' to Exit");
            System.out.println("------------------------------");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("--- Add a student");
                    Student student = new Student();
                    student.inputStudentDetails();
                    student.addStudent();
                    break;
                case 2:
                    System.out.println("--- Display students");
                    Student student1 = new Student();
                    student1.displayStudents();
                    break;
                case 3:
                    System.out.println("--- Add student Marks");
                    break;
                case 4:
                    System.out.println("--- Display student Result");
                    break;
                case 0:
                    System.out.println("--- Exit");
                    flag = false;
                    System.exit(0);
                default:
                    System.out.println("--- Please enter the valid choice");
                    break;
            }
        }
    }
}
