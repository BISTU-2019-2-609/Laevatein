package inclass02;

import java.util.logging.Logger;

import io.Input;

/**
 * 测试Student类
 * @author Laevatein
 */
public class TestStudent {
    private static Logger logger = Logger.getLogger("TestStudent");
    public static void main(String[] args) {
        Input inputer = new Input();
        String name = inputer.getLine("请输入姓名：");
        String org = inputer.getLine("请输入组织名：");
        Student stu1 = new Student(name, Student.JUNIOR);
        logger.info(stu1.toString() + "Organization: " + stu1.volunteer(org));
        inputer.close();
    }
}