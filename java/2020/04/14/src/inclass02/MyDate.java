package inclass02;

/**
 * @author Laevatein
 */
public class MyDate {
    private int year, month, day;

    /**
     * 
     */
    public MyDate() {

    }

    /**
     * 
     * @param year
     * @param month
     * @param day
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * 
     * @return 格式化字符串
     */
    public String toString(){
        return String.format("%d-%d-%d", year, month, day);
    }
}