/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_murat;

/*

 @author:  murat aka
 @version: v1
 @date:    2015/02/10
 @email:   murat-aka@hotmail.com

 /********************************************
 *                  METHODS
 *********************************************/
public class MathStudent extends Student {

    private double algebra;
    private double calculus;

    public MathStudent() {

        super();
    }

    /**
     * Constructor with parameters
     *
     * @param algebra double
     * @param calculus double
     * @param name String with the name
     */
    public MathStudent(String name, double algebra, double calculus) {
        super(name);
        this.algebra = algebra;
        this.calculus = calculus;

    }

    // getters and setters
    public double getAlgebra() {
        return algebra;
    }

    public void setAlgebra(double algebra) {
        this.algebra = algebra;
    }

    public double getCalculus() {
        return calculus;
    }

    public void setCalculus(double calculus) {
        this.calculus = calculus;
    }

    /**
     * ***********************************************************************
     * My Methods:
     *
     * @return returns a string
     */
    @Override
    public String getSubject() {

        return "Maths.class: Name " + this.getName() + " algebraGrade: " + this.getAlgebra()
                + " calculusGrade: " + this.getCalculus();

    }

}
