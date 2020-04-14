package inclass02;

/**
 * @author Laevatein
 */
public class Staff extends Employee {
    private String title;

    /**
     * 
     */
    public Staff() {

    }

    /**
     * 
     * @param title
     */
    public Staff(String title) {
        this.title = title;
    }

    /**
     * 
     * @param name
     * @param address
     * @param phone
     * @param email
     * @param office
     * @param salary
     * @param date
     * @param title
     */
    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate date, String title) {
        super(name, address, phone, email, office, salary, date);
        this.title = title;
    }

    /**
     * 
     */
    public String toString() {
        String aString = super.toString();
        aString = aString + String.format("\ttitle: %s\n", title);
        return aString;
    }
}