package com.xiao.Basics5;

/**
 * ClassName: book
 * Package: com.xiao.Basics5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/18 15:17
 * @Version 1.0
 */
public class book {
    private String bookName;
    private String author;
    private String publisher;
    private int price;


    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void showInfo(){
        System.out.println("书名: " + bookName+"作者: " + author+"出版社名: " + publisher+"价格: " + price);
    }
}
