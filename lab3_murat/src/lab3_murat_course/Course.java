/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_murat_course;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*

 @author:  murat aka
 @version: v1
 @date:    2015/02/10
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
public class Course {

    private static ArrayList<Student> studentList;
    private static String courseName;

    private static String teacher;
    private static Student student;

    public Course() {
    }

    public Course(String name) {
        this.courseName = name;

    }

    public Course(String name, String teacher) {
        this.courseName = name;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * *********************************************
     *
     * METHODS
     *
     **********************************************
     */
    public static void main(String[] args) {
        // TODO code application logic here

        studentList = new ArrayList<Student>();
        // Get a text line from the console:
        String name = null;
        String number = null;
        String gender = null;
        int age = 0;
        Scanner in = new Scanner(System.in);
        // Get a text line from the console:
        try {

            System.out.print("Enter course name: ");
            courseName = in.nextLine();

            // Get a text line from the console:
            System.out.print("Enter teacher name: ");
            teacher = in.nextLine();
            while (true) {
                System.out.print("Add a student (yes or exit)");
                String answer = in.nextLine();

                if ("yes".equals(answer) || "YES".equals(answer) || "Yes".equals(answer)) {
                    // Get a text line from the console:
                    System.out.print("Enter student name: ");
                    name = in.nextLine();

                    // Get an int from the console
                    System.out.print("Enter Age: ");
                    age = in.nextInt();

                    // Get an int from the console
                    System.out.print("Enter number: ");
                    number = in.nextLine();

                    // Get an int from the console
                    System.out.print("Enter gender: ");
                    gender = in.nextLine();
                } else {
                    break;
                }
            }
        } catch (InputMismatchException exception) //Add import java.util.InputMismatchException; at the top
        {
            System.out.println("Error - Enter an integer");

        }

        // for (;;) {
        student = new Student();
        Course course = new Course(courseName, teacher);
        //eee student.setName(name);
        student.setName(name);
        student.setAge(age);
        student.setNumber(number);
        student.setGender(gender);

        studentList.add(student);

        System.out.println(course);

        System.out.println();
        int studentListSize = studentList.size();

        for (int i = 0; i < studentListSize; i++) {
            System.out.print(studentList.get(i));
        }

        // userinterface();
    }

    @Override
    public String toString() {
        return "Course: " + this.courseName + " Teacher: " + this.teacher;
    }

}
