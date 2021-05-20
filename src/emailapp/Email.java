package emailapp;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailCapacity;
    private String altEmail;

    /**
     * Constructor which creates an email given someone's name
     *
     * @param firstName
     * @param lastName
     */
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for " + this.firstName + " " + this.lastName);

        this.department = selectDepartment();
        System.out.println("Selected department is: " +this.department);


    }
    /*
        Method to select current department
     */

    private String selectDepartment() {
        System.out.println("Enter the department\n1. For sales\n2. For development\n3. For accounting\n 0. To return to previous menu");
        Scanner saleInput = new Scanner(System.in);

        int depChoice = saleInput.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {

            return "development";

        }else if(depChoice == 3 ){
            return "accounting";
        }
        else
            return "";

    }
}

