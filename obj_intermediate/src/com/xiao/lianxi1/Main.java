package com.xiao.lianxi1;

/**
 * ClassName: Main
 * Package: com.xiao.lianxi1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 10:29
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("张三",20,'男',50);
        System.out.println(student.getInfo());
        Teacher teacher = new Teacher("李四",50,'女',5000);
        System.out.println(teacher.getInfo());
    }
}
