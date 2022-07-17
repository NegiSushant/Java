import java.util.Scanner;

class Account
{
    private String accNo;
    private String name;
    private String Address;
    private String phno;
    private String DOB;
    protected long balance;

    public Account(String acc, String n, String Add, String phno, String DOB)
    {
        accNo = acc;
        name = n;
        Address = Add;
        this.phno = phno;
        this.DOB = DOB;
        balance = 0;
    }

    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return Address;}
    public String getPhno(){return phno;}
    public String getDOB(){return DOB;}
    public long getBalance(){return balance;}

    public void setAddress(String Add)
    {
        Address = Add;
    }

    public void setPhno(String phno)
    {
        this.phno = phno;
    }
}
class SavingAccount extends Account
{
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}
class LoanAccount extends Account
{
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if (balance == amt)
        {
            balance = 0;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        LoanAccount la = new LoanAccount();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello world!");
    }
}