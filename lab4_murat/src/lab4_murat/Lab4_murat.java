/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_murat;

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
public class Lab4_murat {

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
        studentTable[0] = new MathStudent("George", 10, 5.2);
        studentTable[1] = new MathStudent("Mike", 8, 6.2);

        //studentTable[2] = new MathStudent("George", 10, 5.2);
        //studentTable[3] = new MathStudent("George", 10, 5.2);
        studentTable[4] = new ComputerStudent("George", 8, 5.2);
        studentTable[5] = new ComputerStudent("Mike", 10, 5.2);

        //studentTable[6] = new MathStudent("George", 10, 5.2);
        //studentTable[7] = new MathStudent("George", 10, 5.2);
        studentTable[8] = new ScienceStudent("George", 5, 5.2);
        studentTable[9] = new ScienceStudent("Mike", 5, 10.2);

    }

    public static void userinterface() {
        text();

        int choice = getinput();

        switch (choice) {
            case 1:
                print();
                break;
            case 2:
                populate();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
        }

    }

    public static void populate() {
        studentTable = null;
        text2();

        int choice = getinput();

        switch (choice) {
            case 1: {
                getMaths();
            }
            break;
            case 2:
                getComputer();
                break;
            case 3:
                getScience();
                break;
            case 4:
                print2();
                break;
            case 5:
                userinterface();
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
                + "1. print grades \n"
                + "2. enter grades \n"
                + "3. to exit"
        );
        System.out.print("Enter(1-3): ");

    }

    public static void text2() {

        System.out.println("\nChoose a class\n"
                + "1. maths \n"
                + "2. computer \n"
                + "3. science\n"
                + "4. print\n"
                + "5. userinterface"
        );
        System.out.print("Enter(1-3): ");

    }

    public static void text(String a, String b) {

        System.out.print("Please enter " + a + " for " + b);
    }

    public static void getMaths() {

        text("name", "mathStudent ");
        String name = getInputString();
        text("algebraGrade", "mathStudent ");
        double algebra = getInputDouble();
        text("calculusGrade", "mathStudent ");
        double calculus = getInputDouble();
        Student student = new MathStudent(name, algebra, calculus);
        studentList.add(student);

        print2();

        populate();

    }

    public static void getComputer() {
        text("name", "computerStudent ");
        String name = getInputString();
        text("fortanGrade", "computerStudent ");
        double fortan = getInputDouble();
        text("adaGrade", "computerStudent ");
        double ada = getInputDouble();
        Student student = new ComputerStudent(name, fortan, ada);

        studentList.add(student);

        print2();

        populate();

    }

    public static void getScience() {
        text("name", "scienceStudent ");
        String name = getInputString();
        text("physicsGrade", "scienceStudent ");
        double physics = getInputDouble();
        text("astronomyGrade", "scienceStudent ");
        double astronomy = getInputDouble();
        Student student = new ScienceStudent(name, physics, astronomy);

        studentList.add(student);

        print2();

        populate();
    }

    public static void print() {
        /* the following loop will throw an exception */
        for (int loop = 0; loop < studentTable.length; loop++) {
            try {
                System.out.println("Iteration: " + loop
                        + ". " + studentTable[loop].getSubject());

            } catch (NullPointerException npe) {
                System.out.println("Don't have student at mem pos: " + loop);
            }
            if (loop % 2 != 0) { // pause the system

                pauseprog();

            }
        }
    }

    public static void print2() {
        for (int i = 0; i < studentList.size(); i++) {

            System.out.println(studentList.get(i).getSubject());

        }

        pauseprog();

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
