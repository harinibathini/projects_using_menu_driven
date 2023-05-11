package evaluation5;

public class RechargeAmountTooLowException extends Throwable{
    RechargeAmountTooLowException(){
        System.out.println("RechargeAmountTooLowException... Recharge amount should be Greater than 0");
    }
}
