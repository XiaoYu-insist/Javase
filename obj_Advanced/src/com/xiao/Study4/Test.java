package com.xiao.Study4;

import java.util.Iterator;

/**
 * ClassName: Test
 * Package: com.xiao.Study4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 14:26
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("atguigu");
        list.add("java");
        list.add("bigdata");
        list.add("h5");
        list.add("ui");

        for (Object o : list){
            System.out.println(o);
        }
        System.out.println("--------------------");
        list.set(1,"javaee");
        System.out.println("替换[1]位置的元素为javaee后");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("--------------------");
        list.remove(1);
        System.out.println("删除[1]位置的元素后");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("--------------------");
        Object o = list.get(1);
        System.out.println("[1]位置的元素现在是" + o);
        System.out.println("--------------------");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
