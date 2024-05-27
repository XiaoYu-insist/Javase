package com.xiao.Study3;

/**
 * ClassName: Test1
 * Package: com.xiao.Study3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 11:21
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        //---add()---
        list.add("张三");
        list.add("李四");
        list.add("王五");

        list.remove(1);
        list.set(1,"赵六");
        System.out.println(list.get(1));

        Selector select = list.select();
        while (select.hasNext()){
            Object next = select.next();
            System.out.println(next);
        }
    }
}
