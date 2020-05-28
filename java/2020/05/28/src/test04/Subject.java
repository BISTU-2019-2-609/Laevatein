package test04;

import java.util.ArrayList;

/**
 * 用来记录课程信息
 * @author Laevatein
 */
public class Subject {
    private static ArrayList<String> subjects = new ArrayList<String>();

    /**
     * 第一层：所有课程
     * 第二层：各个课程
     * 第三层： 0:学生
     *         1:教师
     */
    private static ArrayList<ArrayList<ArrayList<String>>> personList = new ArrayList<ArrayList<ArrayList<String>>>();

    /**
     * 添加一门新的课程
     * @param subjectName 课程名
     */
    public static void addSubject(String subjectName) {
        subjects.add(subjectName);
        personList.add(new ArrayList<ArrayList<String>>());
        int i = subjects.indexOf(subjectName);
        personList.get(i).add(new ArrayList<String>());
        personList.get(i).add(new ArrayList<String>());
    }

    /**
     * 判断课程是否存在
     * @param subjectName 课程名
     * @return  存在 True
     *          不存在 False
     */
    public static boolean ifSubject(String subjectName) {
        return subjects.contains(subjectName);
    }

    public static String viewSubject() {
        String subjectsName = "";
        for (int i = 0; i < subjects.size(); i++) {
            subjectsName += subjects.get(i);
            subjectsName += "\n";
        }
        return subjectsName;
    }

    /**
     * 将学生添加到课程中
     * @param studentName 学生名
     * @param subjectName 课程名
     */
    public static void addStudent(String studentName, String subjectName) {
        int i = subjects.indexOf(subjectName);
        personList.get(i).get(0).add(studentName);
    }

    /**
     * 将学生从课程中移除
     * @param studentName 学生名
     * @param subjectName 课程名
     */
    public static void removeStudent(String studentName, String subjectName) {
        int i = subjects.indexOf(subjectName);
        personList.get(i).get(0).remove(studentName);
    }

    /**
     * 将老师添加到课程中
     * @param teacherName 教师名
     * @param subjectName 课程名
     */
    public static void addTeacher(String teacherName, String subjectName) {
        int i = subjects.indexOf(subjectName);
        personList.get(i).get(1).add(teacherName);
    }

    /**
     * 将老师从课程中移除
     * @param teacherName 教师名
     * @param subjectName 课程名
     */
    public static void removeTeacher(String teacherName, String subjectName) {
        int i = subjects.indexOf(subjectName);
        personList.get(i).get(1).remove(teacherName);
    }

    /**
     * 显示课程选课数据
     * @param subjectName 课程名
     * @return 选课名单
     */
    public static String toString(String subjectName) {
        int i = subjects.indexOf(subjectName);
        return String.format("学生名单：%s教师名单：%s", personList.get(i).get(0), personList.get(i).get(1));
    }
}