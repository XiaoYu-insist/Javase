package com.xiao.lianxi1;

/**
 * ClassName: Person
 * Package: com.xiao.lianxi1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 10:20
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {

    }

    public Person(char gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInfo(){
        return "姓名："+name + "，年龄：" + age + "，性别：" + gender;
    }
}
