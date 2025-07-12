package Oop_challenges;

public class bankAccount {
    private String accountnumber;
    private double balance;
    private String customername;
    private String  customeremail;
    private int customerphonenumber;


    public String getCustomername() {
        return customername;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }
    public String getCustomeremail() {
        return customeremail;
    }
    public int getCustomerphonenumber() {
        return customerphonenumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

    public void setCustomerphonenumber(int customerphonenumber) {
        this.customerphonenumber = customerphonenumber;
    }

    public static int depositAccount(String accountnumber, double balance) {
        return 0;
    }

    public static int withdrawAccount(String accountnumber, double balance) {
        if(balance < 0 || balance <= -0){
            System.out.println("Insufficient balance");
        }


        return 0;
    }

}


