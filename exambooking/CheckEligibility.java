package exambooking;

public class CheckEligibility extends ViewAttendance{

    public void eligibleOrNot(){
        if(attendance >= 75){
            isEligible = true;
            System.out.println("You are Eligible for attending Exams");
        }else{
            try{
                throw new NoMinimumAttendanceException();
            }catch(NoMinimumAttendanceException e) {
                System.out.println("Check if you can increase your attendance percentage to the minimum per. required by regularizing(if applicable)");
                System.out.println("else, you are not Eligible for attending Exams");
            }
        }
    }
}
