package evaluation5;

public class UserDoesNotExistException extends Throwable{
    UserDoesNotExistException(){
        System.out.println("UserDoesNotExistException... This mobile number is not valid..Enter a valid mobno ");
    }
}
