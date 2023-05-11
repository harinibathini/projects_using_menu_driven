package manage_bank_accounts;

public class BankUser {
    private String name, address, emailId, accountType, companyName;
    private long phoneNumber,accountNo;
    double balance;
    public BankUser(){

    }
     public BankUser(String name,String address,long phoneNumber,String emailId,String accountType,double balance,long accountNo){
         this.name = name;
         this.address = address;
         this.phoneNumber = phoneNumber;
         this.emailId = emailId;
         this.accountType = accountType;
         this.balance = balance;
         this.accountNo = accountNo;
     }
     public BankUser(String companyName){
         this.companyName = companyName;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
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
