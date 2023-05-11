package cafeallocationsystem;

public class InValidOrderException extends Throwable{
    InValidOrderException(){
        System.out.println("InValid Order Exception...Order atleast 1 coffee");
    }
}
