package com.xiao.Further7;

/**
 * ClassName: InstanceTest
 * Package: com.xiao.Further7
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 16:00
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Graduate());
    }
    public void method(Person e){
        System.out.println(e.getInfo());
        if(e instanceof Person){
            System.out.println("a person");
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Graduate){
            System.out.println("a graduate");
        }
    }
}
