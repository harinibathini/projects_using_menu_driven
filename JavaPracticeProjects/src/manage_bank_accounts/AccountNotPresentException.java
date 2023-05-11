package manage_bank_accounts;

public class AccountNotPresentException extends Exception{
        AccountNotPresentException(){
            System.out.println("AccountNotPresentException.. Add account in order to Deposit or Withdraw amount!");
        }
}
