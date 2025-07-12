package Oop_challenges;

public class Main {
    public static void main(String[] args) {



        bankAccount SbusAccount = new bankAccount();
        SbusAccount.setAccountnumber("123456789");
        SbusAccount.setBalance(1000.00);
        SbusAccount.setCustomername("Sbus Mthiya");
        SbusAccount.setCustomeremail("SbusMthiya@gmail.com");
        SbusAccount.setCustomername("(067) 632-5924");

        SbusAccount.withdrawAccount(100.0);
        SbusAccount.depositAccount(250);
        SbusAccount.withdrawAccount(30);

        SbusAccount.withdrawAccount(220);
        SbusAccount.depositAccount(100);
        SbusAccount.withdrawAccount(45.55);
        SbusAccount.withdrawAccount(54.46);

    }
}
