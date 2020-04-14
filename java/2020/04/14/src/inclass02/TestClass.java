package inclass02;

/**
 * @author Laevatein
 */
public class TestClass {
    static final String NAME = "Laevatein Scarlet";
    static final String ADDRESS = "Beisihuan";
    static final String PHONE = "+8617600976058";
    static final String EMAIL = "fish_magic@ftmc.me";
    static final int GRADE = 1;
    static final String OFFICE = "null";
    static final double SALARY = 0;
    static final MyDate DATE = new MyDate(2019,9,3);
    static final String WORK_TIME = "Never";
    static final String LEVEL = "Not a Faculty";
    static final String TITLE = "A Touching Fish Person";
    
    public static void main(String[] args) {
        Student student1 = new Student(NAME, ADDRESS, PHONE, EMAIL, GRADE);
        System.out.print(student1.toString() + "\n");
        Faculty faculty1 = new Faculty(NAME, ADDRESS, PHONE, EMAIL, OFFICE, SALARY, DATE, WORK_TIME, LEVEL);
        System.out.print(faculty1.toString() + "\n");
        Staff staff1 = new Staff(NAME, ADDRESS, PHONE, EMAIL, OFFICE, SALARY, DATE, TITLE);
        System.out.print(staff1.toString() + "\n");
    }
}