package studentmanagement;

public class MarksNotInRangeException extends Exception{
    MarksNotInRangeException(){
        System.out.println("MarksNotInRangeException...Marks entered should not be less than '0' and not greater than '100'");
    }

}
