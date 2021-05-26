package bankaccountapp;

public class Savings extends Account {

    int depositBoxID;
    int depositBoxKey;

    public Savings(String name, String sN, double initDpeosit) {
        super(name, sN, initDpeosit);
        System.out.println("New savings account created for "+name);

    }
}
