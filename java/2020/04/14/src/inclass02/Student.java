package inclass02;

/**
 * @author Leavatein
 */
public class Student extends Person {
    private int grade;

    /**
     * 
     */
    public Student() {

    }

    /**
     * 
     * @param grade
     */
    public Student(int grade) {
        this.grade = grade;
    }

    /**
     * 
     * @param name
     * @param address
     * @param phone
     * @param email
     * @param grade
     */
    public Student(String name, String address, String phone, String email, int grade){
        super(name, address, phone, email);
        this.grade = grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 
     */
    public String toString() {
        String aString = super.toString();
        aString = aString + String.format("\tgrade: %s\n", grade);
        return aString;
    }
}