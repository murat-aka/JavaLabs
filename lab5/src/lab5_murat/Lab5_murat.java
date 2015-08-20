/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_murat;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*

 @author:  murat aka
 @version: v1
 @date:    2015/02/10
 @email:   murat-aka@hotmail.com


 /*******************************************
 *                  METHODS
 *******************************************/
public class Lab5_murat {

    /**
     * @param args the command line arguments
     */
    static Student[] studentTable;
    static ArrayList<Student> studentList;

    public static void main(String[] args) {

        initialize();
        userinterface();

    }

    public static void initialize() {
        studentList = new ArrayList<>();
        studentTable = new Student[10];

        /* Initialize the Students */
        studentTable[0] = new MathStudent(
                "George", 10, 5.2);

        studentTable[1] = new MathStudent(
                "Mike", 8, 6.2);

        //studentTable[2] = new MathStudent("George", 10, 5.2);
        //studentTable[3] = new MathStudent("George", 10, 5.2);
        studentTable[4] = new ComputerStudent(
                "George", 8, 5.2);
        studentTable[5] = new ComputerStudent(
                "Mike", 10, 5.2);

        //studentTable[6] = new MathStudent("George", 10, 5.2);
        //studentTable[7] = new MathStudent("George", 10, 5.2);
        studentTable[8] = new ScienceStudent(
                "George", 5, 5.2);
        studentTable[9] = new ScienceStudent(
                "Mike", 5, 10.2);

    }

    public static void userinterface() {
        text();

        int choice = getinput();

        switch (choice) {
            case 1:
                count();
                break;

            case 2:
                System.exit(0);
                break;
            default:
                break;
        }

    }

    public static void text() {
        System.out.println("***********************************");
        System.out.println("Welcome to student grades database!");
        System.out.println("***********************************");
        pauseprog();

        System.out.println("Choose an aplication\n"
                + "1. start count \n"
                + "2. to exit"
        );
        System.out.print("Enter(1-2): ");

    }

    public static void count() {

        System.out.print("please enter number of counts: ");
        int count = getinput();

        PrintThread[] pt = new PrintThread[studentTable.length];
        for (int loop = 0; loop < studentTable.length; loop++) {

            try {
                pt[loop] = new PrintThread(studentTable[loop].getSubject(), 1000, count);
                pt[loop].start();

            } catch (NullPointerException npe) {
                System.out.println("Don't have student at mem pos: " + loop);
            }
        }
        //pt[5].setActive(false);

    }

    public static void multipleThreads(int number) {

    }

    public static String getInputString() {

        Scanner in = new Scanner(System.in);
        String a = "";

        try {

            a = in.nextLine();

        } catch (InputMismatchException exception) //Add import java.util.InputMismatchException; at the top
        {
            System.out.println("Error - Enter a string");
            getinput();
        }

        return a;
    }

    public static double getInputDouble() {

        Scanner in = new Scanner(System.in);
        double a = 0;

        try {

            a = in.nextInt();

        } catch (InputMismatchException exception) //Add import java.util.InputMismatchException; at the top
        {
            System.out.println("Error - Enter a double");
            getinput();
        }

        return a;
    }

    public static int getinput() {

        Scanner in = new Scanner(System.in);
        int a = 0;

        try {

            a = in.nextInt();

        } catch (InputMismatchException exception) //Add import java.util.InputMismatchException; at the top
        {
            System.out.println("Error - Enter an integer");
            getinput();
        }

        return a;
    }

    public static void pauseprog() {
        System.out.println("Press enter to continue...");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();

    }

}
