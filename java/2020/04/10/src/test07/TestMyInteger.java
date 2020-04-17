package test07;

import io.Input;

/**
 * @author Laevatein
 */
public class TestMyInteger {
	  public static void main(String[] args) {
        Input inputer = new Input();
	    MyInteger n1 = new MyInteger(inputer.getInt("请输入一个整数："));
	    System.out.println("n1是偶数吗? " + '\t' + n1.isEven());
	    /*
	     * 下面分别用非静态方法和静态方法，判断你n1是否为素数
	     */
	    System.out.println("n1是素数吗? "  + '\t' + n1.isPrime());
	    System.out.println("n1是素数吗? "  + '\t'+ MyInteger.isPrime(n1 ));
	    
	    
	    MyInteger n2 = new MyInteger(inputer.getInt("请输入一个整数："));
	    System.out.println("n2是奇数吗? " +  '\t' + n2.isOdd());
	    System.out.println("45是奇数吗? " +  '\t' + MyInteger.isOdd(45));
	    System.out.println("n1与n2相等吗? " +  '\t' + n1.equals(n2));
	    System.out.println("n1等于5吗? " +  '\t' + n1.equals(5));
	  }
}
