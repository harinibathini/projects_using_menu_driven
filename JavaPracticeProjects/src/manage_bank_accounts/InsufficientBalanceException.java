package manage_bank_accounts;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        System.out.println("InsufficientBalanceException.. Balance must not go negative!");

    }
}
