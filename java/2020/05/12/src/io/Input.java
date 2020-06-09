package io;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author Laevatein
 */
public class Input {
    static Scanner inputer = new Scanner(System.in);
    static Logger inputerLogger = Logger.getLogger("inputer");
    
    /**
     * 构造一个Scanner
     */
    public Input() {

    }

    /**
     * 获取任意整数
     * @param notice 提示语
     * @return 整数
     */
    public int getInt(String notice) {
        while (true) {
            inputerLogger.info(notice);
            if (inputer.hasNextInt()) {
                return inputer.nextInt();
            } else {
                inputerLogger.warning("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    /**
     * 获取指定范围的整数
     * @param min 最小值
     * @param max 最大值
     * @param notice 提示语
     * @return 整数
     */
    public int getInt(int min,int max,String notice) {
        while (true) {
            int inputed = getInt(notice);
            if (inputed >= min && inputed <= max) {
                return inputed;
            } else {
                inputerLogger.warning("输入不合规，请重新输入！"); 
            }
        }
    }

    /**
     * 获取任意浮点数
     * @param notice
     * @return 浮点数
     */
    public float getFloat(String notice) {
        while (true){
            inputerLogger.info(notice);
            if (inputer.hasNextFloat()) {
                return inputer.nextFloat();
            } else {
                inputerLogger.warning("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    /**
     * 获取指定范围的浮点数
     * @param min 最小值
     * @param max 最大值
     * @param notice 提示语
     * @return 浮点数
     */
    public float getFloat(float min,float max,String notice) {
        while (true) {
            float inputed = getFloat(notice);
            if (inputed >= min && inputed <= max) {
                return inputed;
            } else {
                inputerLogger.warning("输入不合规，请重新输入！"); 
            }
        }
    }

    /**
     * 获取任意双精度浮点数
     * @param notice 提示语
     * @return 双精度浮点数
     */
    public double getDouble(String notice) {
        while (true) {
            inputerLogger.info(notice);
            if (inputer.hasNextDouble()) {
                return inputer.nextDouble();
            } else {
                inputerLogger.warning("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    /**
     * 获取有范围的双精度浮点数
     * @param min 最小值
     * @param max 最大值
     * @param notice 提示语
     * @return 双精度浮点数
     */
    public double getDouble(double min,double max,String notice) {
        while (true) {
            double inputed = getDouble(notice);
            if (inputed >=min && inputed <= max) {
                return inputed;
            } else {
                inputerLogger.warning("输入不合规，请重新输入！"); 
            }
        }
    }

    public String getLine(String notice) {
        while (true) {
            inputerLogger.info(notice);
            if (inputer.hasNext()) {
                return inputer.next();
            } else {
                inputerLogger.warning("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    /**
     * 关闭Scanner
     */
    public void close() {
        inputer.close();
    }
}