package cafeallocationsystem;

public class NoReservationFound extends Throwable{
    NoReservationFound(){
        System.out.println("No Reservation Found Exception...Please reserve a table in order to place an order");
    }
}
