package simcallcenter;

public class UserDoesNotExistException extends Exception{
    UserDoesNotExistException(){
        System.out.println("UserDoesNotExistException... This mobile number is not valid!!Enter a valid mobileNo! ");
    }
}
