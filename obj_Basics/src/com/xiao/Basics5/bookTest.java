package com.xiao.Basics5;

import java.awt.print.Book;

/**
 * ClassName: bookTest
 * Package: com.xiao.Basics5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/18 15:24
 * @Version 1.0
 */
public class bookTest {
    public static void main(String[] args) {
        book book = new book();
        book.setBookName("下雨");
        book.setAuthor("我");
        book.setPublisher("雨伞");
        book.setPrice(50);
        book.showInfo();
    }
}
