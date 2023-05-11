package exambooking;

public class NoMinimumAttendanceException extends Exception{
    NoMinimumAttendanceException(){
        System.out.println("NoMinimumAttendanceException...You need to have minimum attendance of 75 % for writing exams");
    }
}
