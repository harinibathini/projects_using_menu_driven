package manage_bank_accounts;

public class User {
   String name, address, emailId, accountType, companyName;
    long phoneNumber,accountNo;
    double balance;
    public User(){

    }
    public User(String name,String address,long phoneNumber,String emailId,String accountType,double balance,long accountNo){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.accountType = accountType;
        this.balance = balance;
        this.accountNo = accountNo;
    }
    public User(String companyName){
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BankUser{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", emailId='" + emailId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", companyName='" + companyName + '\'' +
                ", phoneNumber=" + phoneNumber + '\'' +
                ", balance =" + balance + '\'' +
                ", accountNo =" + accountNo +
                '}';
    }
}
