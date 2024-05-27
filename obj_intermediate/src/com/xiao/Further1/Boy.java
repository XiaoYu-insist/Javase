package com.xiao.Further1;

/**
 * ClassName: Boy
 * Package: com.xiao.Further1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 9:35
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("hello"+girl.getName());
    }

    public void showt(){
        if(this.age>5){
            System.out.println("记住了");
        }else {
            System.out.println("没有记住");
        }
    }
}
