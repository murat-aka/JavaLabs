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
public class ComputerStudent extends Student {

    private double fortan;
    private double ada;

    public ComputerStudent(String name) {
        super();
    }

    /**
     * Constructor with parameters
     *
     * @param fortan
     * @param ada
     * @param name String with the name
     */
    public ComputerStudent(String name, double fortan, double ada) {
        super(name);
        this.fortan = fortan;
        this.ada = ada;
    }

    // getters and setters
    public double getFortan() {
        return fortan;
    }

    public void setFortan(double fortan) {
        this.fortan = fortan;
    }

    public double getAda() {
        return ada;
    }

    public void setAda(double ada) {
        this.ada = ada;
    }

    /**
     * ***********************************************************************
     * My Methods:
     *
     *
     * @return
     */
    @Override
    public String getSubject() {

        return "Computer.class: Name " + this.getName() + " adaGrade: " + this.getAda()
                + " fortanGrade: " + this.getFortan();

    }

}
