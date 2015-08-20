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
public class ScienceStudent extends Student {

    private double physics;
    private double astronomy;

    public ScienceStudent() {

        super();
    }

    /**
     * Constructor with parameters
     *
     * @param physiscs
     * @param name String with the name
     * @param astronomy
     */
    public ScienceStudent(String name, double physiscs, double astronomy) {
        super(name);
        this.physics = physiscs;
        this.astronomy = astronomy;
    }

    // getters and setters
    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(double astronomy) {
        this.astronomy = astronomy;
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

        return "Science.class: Name " + this.getName() + " physicsGrade: " + this.getPhysics()
                + " astronomyGrade: " + this.getAstronomy();

    }
}
