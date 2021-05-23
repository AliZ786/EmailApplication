package studentdbapp;

import java.util.Scanner;

public class Student {

    /**
     * Declaration of variables
     */

    private String fName;
    private String lName;
    private int currentYear;
    private String year;
    private int StudentID;
    private String courses;
    private String tuition;
    private int COST = 600;



    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.fName = input.nextLine();

        System.out.print("Enter student's last name: ");
        this.lName = input.nextLine();

        System.out.print("Enter student's current grade level:\n1- Freshmen\n2-Sophomore\n3-Junior\n4-Senior");
        this.currentYear = input.nextInt();

        switch(this.currentYear){

            case 1:
                year = "Freshmen";
                break;

            case 2:
                year = "Sophomore";
                break;

            case 3:
                year = "Junior";
                break;

            case 4:
                year = "Senior";
                break;

        }
        System.out.println(fName + lName +"\n" +year);







    }
}
