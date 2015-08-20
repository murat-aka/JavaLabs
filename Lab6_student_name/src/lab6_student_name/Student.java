package lab6_student_name;

/**
 * Same student we had before but now we've implemented the Serializable
 * interface to allow the class to be converted to IO Streams
 *
 * @author alex
 */
import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -1848148348931789644L;
    private String name;
    private int age;
    public String gender = "na";
    public static int instances = 0;

    private int StudentID;

    private String Email;

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    // Getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Default constructor. Populates age and gender with defaults
     */
    public Student() {
        this.age = 18;
        this.name = "Not Set";
        this.StudentID = 001;
        this.Email = "tel@tele.com";
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
        this(); // Must be the first line!
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
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age + " Gender: "
                + this.gender + " ID: " + this.StudentID + " Email: "
                + this.Email;
    }
}
