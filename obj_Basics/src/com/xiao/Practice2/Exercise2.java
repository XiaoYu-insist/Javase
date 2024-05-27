package com.xiao.Practice2;

/**
 * ClassName: Exercise2
 * Package: com.xiao.Practice2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 9:15
 * @Version 1.0
 */
public class Exercise2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name="张三";
        s1.age=18;
        s2.name = "李四";
        s2.age=19;
        System.out.println("第一个学生名字为："+s1.name+"，年龄为："+s1.age);
        System.out.println("第二个学生名字为："+s2.name+"，年龄为："+s2.age);
    }
}
