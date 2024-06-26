package com.xiao.Study3;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//
///**
// * ClassName: Test2
// * Package: com.xiao.Study3
// * Description:
// *
// * @Author xiao-yu
// * @Create 2024/5/15 13:51
// * @Version 1.0
// */
public class Test2 {
    private static MyArrayList list;

    @BeforeClass
    public static void init(){
        list = new MyArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
    }

    @Before
    public void before(){
        System.out.println("该测试方法开始前list中的数据如下：");
        Selector select = list.select();
        while(select.hasNext()){
            Object next = select.next();
            System.out.println(next);
        }
    }

    @After
    public void after(){
        System.out.println("该测试方法结束后list中的数据如下：");
        Selector select = list.select();
        while(select.hasNext()){
            Object next = select.next();
            System.out.println(next);
        }
    }

    @Test
    public void testAdd() {
        System.out.println("现在测试的是testAdd()方法");
        list.add("赵六");
    }

    @Test
    public void testRemove() {
        System.out.println("现在测试的是testRemove()方法");
        list.remove(1);
    }

    @Test
    public void testSet() {
        System.out.println("测试的是testSet()方法");
        list.set(1, "张七");
    }

    @Test
    public void testGet() {
        System.out.println("测试的是testGet()方法");
        System.out.println(list.get(1));
    }

}


