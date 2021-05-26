package bankaccountapp;

public abstract class Account implements IBaseRate {

    String name;
    String serialNumber;
    double balance;
    String accountNum;
    double rate;

    public Account(String name, String sN, double initDeposit) {
        this.name = name;
        this.serialNumber = sN;
        this.balance = initDeposit;

        System.out.println("New account created: " + name.toUpperCase() + " Serial Number: " + sN + " Balance: " + initDeposit + "$");

    }

    public String setAccountNum() {
        String lastTwoDigitsOfSN = serialNumber.substring(serialNumber.length()-2, serialNumber.length());

    }
}
