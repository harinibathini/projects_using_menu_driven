package studentmanagement;

public class StudentNotExistException extends Exception{
    StudentNotExistException(){
        System.out.println("StudentNotExistException...This student is not registered");
        System.out.println("Marks can only be added if a student is registered");
    }
}
