package test04;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * 学生选课数据
 * @author Laevatein
 */
public class Student extends Person {

    private static Logger logger = Logger.getLogger("Student");
    private static ArrayList<String> studentNameList = new ArrayList<String>();
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    private final int MAX_SUBJECTS = 5;

    /**
     * 添加一名新学生
     * @param name 姓名
     * @param age 年龄
     * @param id 学号
     */
    public Student(String name, int age, int id) {
        super(name, age, id);
        studentNameList.add(name);
        studentList.add(this);
    }

    /**
     * 查看学生已选课程
     * @return 已选课程列表
     */
    public String view() {
        return String.format("%s", subjectList); 
    }

    /**
     * 判断是否是学生
     * @param studentName 学生姓名
     * @return  是学生 True
     *          不是学生 False
     */
    public static boolean ifStudent(String studentName) {
        return studentNameList.contains(studentName);
    }

    /**
     * 查找学生对象
     * @param studentName 学生姓名
     * @return Student对象
     */
    public static Student getStuent(String studentName) {
        int i = studentNameList.indexOf(studentName);
        return studentList.get(i);
    }

    /**
     * 将课程添加到选课列表
     * @param subjectName 课程名
     */
    public void add(String subjectName) {
        if (subjectList.size() >= MAX_SUBJECTS) {
            logger.warning("选课数已达上限，无法选课");
        } else if (subjectList.contains(subjectName)) {
            logger.warning("该课程已选");
        } else {
            if (! Subject.ifSubject(subjectName)) {
                Subject.addSubject(subjectName);
            }
            subjectList.add(subjectName);
            Subject.addStudent(this.name, subjectName);
            logger.info("选课成功");
        }
    }

    /**
     * 将课程移出已选课程列表
     * @param subjectName
     */
    public void remove(String subjectName) {
        if (! subjectList.contains(subjectName)) {
            logger.warning("该课程未选");
        } else {
            subjectList.remove(subjectName);
            Subject.removeStudent(this.name, subjectName);
        }
    }

    /**
     * 将学生信息输出为格式化字符串
     * @return 学生信息
     */
    public String toString() {
        return String.format("姓名：%s\n年龄：%d\n学号：%d\n已选课程：%s", this.name, this.age, this.id, this.view());
    }

}