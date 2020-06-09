package test04;

import java.util.ArrayList;

/**
 * 系统中所有人的基本信息
 * @author Laevatein
 */
public class Person {
    protected String name;
    protected int age;
    protected int id;

    protected ArrayList<String> subjectList = new ArrayList<String>();

    protected Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}