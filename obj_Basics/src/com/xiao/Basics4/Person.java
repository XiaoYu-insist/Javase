package com.xiao.Basics4;

/**
 * ClassName: Person
 * Package: com.xiao.Basics4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/18 15:12
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int age) {
        if(age > 0 && age < 130){
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
}
