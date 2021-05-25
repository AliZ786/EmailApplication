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
    private int yearNumber;
    private String studentID;
    private String courses;
    private int tuition = 0;
    private static int COST = 600;
    private static int id = 1000;


    public Student() {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.fName = input.nextLine();

        System.out.print("Enter student's last name: ");
        this.lName = input.nextLine();

        System.out.println("Enter student's current grade level:\n1-Freshmen\n2-Sophomore\n3-Junior\n4-Senior");
        this.currentYear = input.nextInt();

        switch (this.currentYear) {

            case 1:
                year = "Freshmen";
                yearNumber = 1;
                break;

            case 2:
                year = "Sophomore";
                yearNumber = 2;
                break;

            case 3:
                year = "Junior";
                yearNumber = 3;
                break;

            case 4:
                year = "Senior";
                yearNumber = 4;
                break;

        }

        setStudentID();

        System.out.println(fName + " " + lName + "\n" + "Current year: " + year + "\n" + "Student ID: " + studentID);


    }

    /**
     * Method to generates an ID
     */
    private void setStudentID() {
        id++;
        this.studentID = yearNumber + "" + id;
    }

    /**
     * Allows the student to enroll
     */

    public void enroll() {

        do {
            System.out.println("Enter the course that you wish to enroll in (Q to quit):");
            Scanner in = new Scanner(System.in);
            String courseChoice = in.nextLine();
            if (!courseChoice.equals("Q")) {
                courses = courses + "\n" + courseChoice;
                tuition = tuition + COST;

            } else {
                System.out.println("Break!");
                break;
            }

        } while (true);

        System.out.println("Enrolled in: " +courses );
        System.out.println("Tuition balance: " +tuition);
    }
}