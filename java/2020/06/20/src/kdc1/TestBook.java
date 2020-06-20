package kdc1;

public class TestBook {
	public static void main(String[] args) {
		Book book = new Book("978-7-111-60074-9", "Java语言程序设计与数据结构", "梁勇", "机械工业出版社", 99);
		//进货50本书
		book.purchaseQuantity(50);
		//图书打8折
		System.out.println("打折后的图书价格：" + book.discountedPrice(0.8f));
		//输出图书信息
		System.out.println("----------------------------");
		System.out.println(book.toString());
		System.out.println("----------------------------");
		//售卖10本图书
		int amount = book.sellOut(10);
		System.out.println("实际售卖的图书数量：" + amount);
		System.out.println("售卖10本图书后的库存：" + book.getAmount());
		//售卖60本图书
		amount = book.sellOut(60);
		System.out.println("实际售卖的图书数量：" + amount);
		System.out.println("售卖60本图书后的库存：" + book.getAmount());
	}
}
