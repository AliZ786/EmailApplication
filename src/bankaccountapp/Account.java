package bankaccountapp;

public abstract class Account implements IBaseRate {

    String name;
    String serialNumber;
    double balance;
    static int index = 10000;
    String accountNum;
    double rate;

    public Account(String name, String sN, double initDeposit) {
        this.name = name;
        this.serialNumber = sN;
        this.balance = initDeposit;

        index++;
        this.accountNum = setAccountNum();


    }

    public String setAccountNum() {
        String lastTwoDigitsOfSN = serialNumber.substring(serialNumber.length()-2, serialNumber.length());
        int uniqueID = index;
        int randomNum = (int) (Math.random() * Math.pow(10,3));
        return lastTwoDigitsOfSN + uniqueID +randomNum;

    }

    public void showInfo(){
        System.out.println("Name: " +name.toUpperCase() +"\nAccount Number: "+accountNum + "\nBalance: "+balance);
    }
}
