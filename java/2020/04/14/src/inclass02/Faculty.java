package inclass02;

/**
 * @author Laevatein
 */
public class Faculty extends Employee {
    private String workTime, level;

    /**
     * 
     */
    public Faculty() {

    }

    /**
     * 
     * @param workTime
     * @param level
     */
    public Faculty(String workTime, String level) {
        this.workTime = workTime;
        this.level = level;
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
     * @param workTime
     * @param level
     */
    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate date, String workTime, String level) {
        super(name, address, phone, email, office, salary, date);
        this.workTime = workTime;
        this.level = level;
    }

    /**
     * @param workTime the workTime to set
     */
    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return the workTime
     */
    public String getWorkTime() {
        return workTime;
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * 
     */
    public String toString() {
        String aString = super.toString();
        aString = aString + String.format("\tWorkTime: %s\n", workTime);
        aString = aString + String.format("\tLevel: %s\n", level);
        return aString;
    }
}