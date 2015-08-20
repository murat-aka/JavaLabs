/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_murat;

/*

 @author:  murat aka
 @version: v1
 @date:    2015/02/10
 @email:   murat-aka@hotmail.com

 /********************************************
 *                  METHODS
 *********************************************/
public class Student {

    private String name;

    // Getters
    public String getName() {
        return this.name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
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
     * @param name String with the name
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * ***********************************************************************
     * My Methods:
     *
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + this.name;
    }

    /* My inherited example method */
    public String getSubject() {

        return "Student.class";

    }

    public int getCounter(int count) {
        count = +1;
        return 0;
    }

}
