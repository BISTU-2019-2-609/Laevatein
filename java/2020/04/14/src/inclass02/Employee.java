package inclass02;

/**
 * @author Laevatein
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate data;

    /**
     * 
     */
    public Employee(){

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
     */
    public Employee(String name, String address, String phone, String email,String office, double salary, MyDate date) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.data = date;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @param data the data to set
     */
    public void setData(MyDate data) {
        this.data = data;
    }

    /**
     * @return the office
     */
    public String getOffice() {
        return office;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @return the data
     */
    public MyDate getData() {
        return data;
    }

    /**
     * 
     */
    public String toString() {
        String aString = super.toString();
        aString = aString + String.format("\tOffice: %s\n", office);
        aString = aString + String.format("\tSalary: %s CNY\n", salary);
        aString = aString + String.format("\tEmployment Data: %s\n", data.toString());
        return aString;
    }
}