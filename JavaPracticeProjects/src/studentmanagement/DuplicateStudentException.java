package studentmanagement;

public class DuplicateStudentException extends Exception{
    DuplicateStudentException(){
        System.out.println("DuplicateStudentException...This Rollno already exists!");
        System.out.println("Please enter non-repetitive valid Rollno");
    }
}
