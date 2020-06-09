package inclass02;

/**
 * @author Laevatein
 */
public class Person {
    private String name, address, phone, email;
    
    /**
     * 
     */
    public Person() {

    }

    /**
     * 
     * @param name
     * @param address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * 
     * @param name
     * @param address
     * @param phone
     * @param email
     */
    public Person(String name, String address, String phone, String email) {
        this(name, address);
        this.phone = phone;
        this.email = email;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @return 格式化字符串
     */
    public String toString() {
        String aString = String.format("Name: %s\n", name);
        aString = aString + String.format("\tAddress: %s\n", address);
        aString = aString + String.format("\tPhone: %s\n", phone);
        aString = aString + String.format("\tEmail: %s\n", email);
        return aString;
    }
}