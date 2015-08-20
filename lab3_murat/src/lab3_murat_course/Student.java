/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_murat_course;

import java.util.Scanner;

/*

 @author:  murat aka
 @version: v1
 @date:    2015/02/14
 @email:   murat-aka@hotmail.com


 ///////Objective////////

 The purpose of this document is to provide a structure for the design of an application
 able to display 3 diamonds on the screen, using 3 different control structures (for, while and do
 while), of variable height, storing the structure on a String array and finally displaying the contents
 of the array on the screen. As an added complication, we should be able to print a special character
 (“o”) in the middle of the pyramid.

 ///////Solution////////

 Due to the repetitive elements found within a diamond, the natural choice to build them
 would be through repetitive control structures that walk from top to bottom or bottom to top
 adding '*' or spaces as and when required. In this case the requirement is very specific. All we need
 is 3 methods within the same class, each one with a type of loop.

 ///////Conclusion////////

 The objective required on point 3 was reached through the solution. What took the most
 time on putting the solution together was the calculation of where to put the '*' against where to put
 the spaces. The control structures were relatively simple as they are similar to those in C, php, etc.

 */
public class Student {

    private String name;
    private int age;
    private String number;
    public String gender = "na";
    private String course;

    public static int instances = 0;

    // Getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getCourse() {
        return this.course;
    }

    public String getNumber() {
        return number;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.gender = number;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Default constructor. Populates age and gender with defaults
     */
    public Student() {
        // this.age = 18;

        this.name = "Not Set";
    }

    /**
     * Constructor with parameters
     *
     * @param age integer
     * @param name String with the name
     */
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Gender constructor
     *
     * @param gender
     */
    public Student(String gender) {
        // this(); // Must be the first line!
        this.gender = gender;

    }

    protected void finalize() throws Throwable {
        //do finalization here
        super.finalize(); //not necessary if extending Object.
    }

    /**
     * ***********************************************************************
     * My Methods:
     *
     ************************************************************************
     */
    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age + " Gender: "
                + this.gender + " Number: " + this.number + "Course: " + this.course;
    }

    /*  public static void main(String[] args) {
     // TODO code application logic here

     // for (;;) {
     Student student = new Student();
     //        student.setName("James");
     //        student.setAge(20);
     //        student.setNumber("12343ms");

     System.out.println(student);
     // }

     // userinterface();
     }
     */
    public static void userinterface() {

        String name;
        int age;
        Scanner in = new Scanner(System.in);

        // Get a text line from the console:
        System.out.print("Enter name: ");
        name = in.nextLine();

        // Get an int from the console
        System.out.print("Enter Age: ");
        age = in.nextInt();

        in.close();

    }

    public static void text() {

        System.out.println("Student database app! \n Choose an aplication\n "
                + "using \n"
                + "1. for loop \n"
                + "2. while loop\n"
                + "3. do while loop\n"
                + "4. to exit"
        );
        System.out.print("Enter(1-4): ");
    }

}
