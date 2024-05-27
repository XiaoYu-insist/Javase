package com.xiao.Basics7;

/**
 * ClassName: Student
 * Package: com.xiao.Basics7
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/18 16:32
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

}
