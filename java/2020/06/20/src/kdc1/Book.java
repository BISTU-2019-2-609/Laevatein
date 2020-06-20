package kdc1;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private float price;
    private int amount = 0;
    private float discount = 1;

    public Book(){};

    public Book(String isbn, String title, String author, String publisher, float price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmount() {
        return amount;
    }

    public String getAuthor() {
        return author;
    }

    public float getDiscount() {
        return discount;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public int sellOut(int quantity) {
        if (quantity >= this.amount) {
            this.amount = 0;
            return this.amount;
        } else {
            this.amount -= quantity;
            return quantity;
        }
    }

    public int purchaseQuantity(int quantity) {
        this.amount += quantity;
        return this.amount;
    }

    public float discountedPrice(float disount) {
        return this.price * disount;
    }
    
    public String toString() {
        String bookString = String.format("ISBN: %s\n", this.isbn);
        bookString += String.format("书名: %s\n", this.title);
        bookString += String.format("作者: %s\n", this.author);
        bookString += String.format("出版社: %s\n", this.publisher);
        bookString += String.format("价格: %f\n", this.price);
        bookString += String.format("库存: %d\n", this.amount);
        return bookString;
    }
}