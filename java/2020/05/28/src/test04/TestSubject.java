package test04;

import io.Input;

/**
 * 测试选课系统
 * @author Laevatein
 */
public class TestSubject {
    private static Input inputer = new Input();

    private static void studentOperation(Student student) {
        while (true) {
            System.out.println("");
            System.out.println("1. 选择课程");
            System.out.println("2. 取消课程");
            System.out.println("3. 查看课程");
            System.out.println("4. 查看个人信息");
            System.out.println("5. 退出");
            int choose = inputer.getInt("请输入选项：");
            if (choose == 1) {
                String subject = inputer.getLine("请输入要选择的课程名：");
                student.add(subject);
            } else if (choose == 2) {
                String subject = inputer.getLine("请输入要取消选择的课程名：");
                student.remove(subject);
            } else if (choose == 3) {
                System.out.println("已选课程：\n" + student.view()); 
            } else if (choose == 4) {
                System.out.println(student.toString());
            } else if (choose == 5) {
                break;
            } else {
                System.out.println("输入不正确，请重新输入！");
            }
        }
    }

    private static void teacherOperation(Teacher teacher) {
        while (true) {
            System.out.println("");
            System.out.println("1. 选择课程");
            System.out.println("2. 取消课程");
            System.out.println("3. 查看课程");
            System.out.println("4. 查看个人信息");
            System.out.println("5. 退出");
            int choose = inputer.getInt("请输入选项：");
            if (choose == 1) {
                String subject = inputer.getLine("请输入要选择的课程名：");
                teacher.add(subject);
            } else if (choose == 2) {
                String subject = inputer.getLine("请输入要取消选择的课程名：");
                teacher.remove(subject);
            } else if (choose == 3) {
                System.out.println("已选课程：\n" + teacher.view()); 
            } else if (choose == 4) {
                System.out.println(teacher.toString());
            } else if (choose == 5) {
                break;
            } else {
                System.out.println("输入不正确，请重新输入！");
            }
        }
    }

    private static void subjectOperation() {
        while (true) {
            System.out.println("");
            System.out.println("1. 查看课程选课数据");
            System.out.println("2. 退出");
            int choose = inputer.getInt("请输入选项：");
            if (choose == 1) {
                String subject = inputer.getLine("请输入要查看的课程名：");
                System.out.print(Subject.toString(subject));
            } else if (choose == 2) {
                break;
            } else {
                System.out.println("输入不正确，请重新输入！");
            }
        }
    }

    public static void main(String[] args) {
        new Student("Student1", 18, 1);
        new Student("Student2", 22, 2);
        new Teacher("Teacher1", 44, 1);
        new Teacher("Techaer2", 59, 2);
        while (true) {
            System.out.println("");
            System.out.println("1. 学生操作");
            System.out.println("2. 教师操作");
            System.out.println("3. 课程操作");
            System.out.println("4. 退出");
            int mainChoose = inputer.getInt("请输入选项：");
            if (mainChoose == 1) {
                while (true) {
                    String studentName = inputer.getLine("请输入姓名：");
                    if (! Student.ifStudent(studentName)) {
                        System.out.println("该学生不存在，请重新输入");
                        continue;
                    } else {
                        studentOperation(Student.getStuent(studentName));
                        break;
                    }
                }
            } else if (mainChoose == 2) {
                while (true) {
                    String teacherName = inputer.getLine("请输入姓名：");
                    if (! Teacher.ifTeacher(teacherName)) {
                        System.out.println("该教师不存在，请重新输入");
                        continue;
                    } else {
                        teacherOperation(Teacher.getTeacher(teacherName));
                        break;
                    }
                }
            } else if (mainChoose == 3) {
                subjectOperation();
            } else if (mainChoose == 4) {
                break;
            } else {
                System.out.println("输入不正确，请重新输入！");
            }
        }
        inputer.close();
    }
}