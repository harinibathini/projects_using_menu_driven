package simcallcenter;

public class User {
    String name;
    String email;
    String address;
    String simType;
    String aadharNo;
    double balance;
    int mobileNo;
    int validity;

    public User(){

    }

    public User(String name,String email,String address,String simType,String aadharNo,double balance,int mobileNo){
        this.name = name;
        this.email = email;
        this.address = address;
        this.simType = simType;
        this.aadharNo = aadharNo;
        this.balance = balance;
        this.mobileNo = mobileNo;
        validity = 1;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", simType='" + simType + '\'' +
                ", aadharNo='" + aadharNo + '\'' +
                ", balance=" + balance +
                ", mobileNo=" + mobileNo +
                ", validity=" + validity +
                '}';
    }
}
