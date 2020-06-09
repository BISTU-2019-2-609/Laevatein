package inclass02;

/**
 * 表述一个学生的类
 * @author Laevatein
 */
public class Student extends Person implements Volunteer {
    private int grade;
    static final public int FRESHMAN = 1;
    static final public int SOPHOMORE = 2;
    static final public int JUNIOR = 3;
    static final public int SENIOR = 4;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public String volunteer(String organization) {
        return organization;
    }

    public String toString() {
        return super.toString() + "Grade: " + this.grade + "\n";
    }
}