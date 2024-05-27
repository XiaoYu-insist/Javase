package com.xiao.Study6;

/**
 * ClassName: Execise21
 * Package: com.xiao.Study6
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:23
 * @Version 1.0
 */
public class Execise21 {
    public static void main(String[] args) {
        try{
            Person p = new Person(-1,"张三");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            Person p2 = new Person();
            p2.setLifeValue(10);
            p2.setLifeValue(-10);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
