package test04;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * 教师选课数据
 * @author Laevatein
 */
public class Teacher extends Person{

    private static Logger logger = Logger.getLogger("Teacher");
    private static ArrayList<String> teacherNameList = new ArrayList<String>();
    private static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

    private final int MAX_SUBJECTS = 3;

    /**
     * 添加一名新教师
     * @param name 姓名
     * @param age 年龄
     * @param id 工号
     */
    public Teacher(String name, int age, int id) {
        super(name, age, id);
        teacherNameList.add(name);
        teacherList.add(this);
    }

    /**
     * 查看教师已选课程
     * @return 已选课程列表
     */
    public String view() {
        return String.format("%s", subjectList); 
    }

    /**
     * 判断是否是教师
     * @param teacherName 教师姓名
     * @return  是教师 True
     *          不是教师 False
     */
    public static boolean ifTeacher(String teacherName) {
        return teacherNameList.contains(teacherName);
    }

    /**
     * 查找教师对象
     * @param teacherName 教师姓名
     * @return Teacher对象
     */
    public static Teacher getTeacher(String teacherName) {
        int i = teacherNameList.indexOf(teacherName);
        return teacherList.get(i);
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
            Subject.addTeacher(this.name, subjectName);
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
            Subject.removeTeacher(this.name, subjectName);
        }
    }

    /**
     * 将教师信息输出为格式化字符串
     * @return 学生信息
     */
    public String toString() {
        return String.format("姓名：%s\n年龄：%d\n工号：%d\n已选课程：%s", this.name, this.age, this.id, this.view());
    }

}