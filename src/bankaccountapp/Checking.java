package bankaccountapp;

public class Checking extends Account{

    int debitCardNumber;
    int PIN;


    public Checking(String name, String sN, double initDpeosit){
        super(name,sN, initDpeosit);
        System.out.println("New checking account created for "+name);

    }
}
