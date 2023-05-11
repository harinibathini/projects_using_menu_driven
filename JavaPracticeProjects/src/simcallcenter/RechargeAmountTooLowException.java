package simcallcenter;

public class RechargeAmountTooLowException extends Exception{
    RechargeAmountTooLowException(){
        System.out.println("RechargeAmountTooLowException... Recharge amount should be Greater than 0!");
    }
}
