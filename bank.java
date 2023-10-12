package bank;

public class bank {
    public static void main(String[] args) {
        account a1=new account(123456,"Ranit Parida","Balasore", 9777373113L,"24July2003");
        System.out.println(a1.toString());
        a1.balance=100000;
        a1.getBalance();
    }
}

class account{
    private long accountNum;
    private String name;
    private String address;
    private long phone;
    private String dob;
    protected long balance;
    public long getAccountNum(){
        return accountNum;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public long getPhone(){
        return phone;
    }
    public String getDob(){
        return dob;
    }

    public long getBalance() {
        System.out.println("Current Balance: "+balance);
        return balance;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setPhone(long phone){
        this.phone=phone;
    }
    public account(){

    }
    public account(long accountNum,String name,String address,long phone,String dob){
        this.accountNum=accountNum;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.dob=dob;
        balance=0;
    }
    public String toString(){
        return "Account Number: "+getAccountNum()+"\n Name: "+getName()+" \n Address: "+getAddress()+"\n Phone: "+getPhone()+" \n Date of Birth:"+getDob();
    }
}

class savingsAccount extends account{
    public void deposit(long amt){
        balance+=amt;
    }
    public void withdraw(long amt){
        balance-=amt;
    }
}
class LoanAccount extends account
{
    public void payEMI(long amt) {
        if(balance>=amt){
            balance-=amt;
        }
        else{
            System.out.println("Insufficient Balance");
            System.out.println("Available Balance :"+balance);
        }
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
        else if(balance>amt)
            balance-=amt;
        else{
            System.out.println("Insufficient Balance");
            System.out.println("Available Balance :"+balance);
        }


    }
}
