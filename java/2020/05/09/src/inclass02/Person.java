package inclass02;

/**
 * 一个人的基本资料
 * @author Laevatein
 */
public class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 将类的内容以字符串形式表达
     * @return 描述类的字符串
     */
    public String toString() {
        return "Name: " + this.name + "\n";
    }
}