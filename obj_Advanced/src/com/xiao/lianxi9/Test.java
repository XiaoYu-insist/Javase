package com.xiao.lianxi9;

/**
 * ClassName: Test
 * Package: com.xiao.lianxi9
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 15:22
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Employee[] e = new Employee[2];
        e[0]=new Manager("天天",001,1000,100);
        e[1]=new CommonEmployee("dd",003,100);
        for (int i=0;i < e.length;i++){
            e[i].work();
            System.out.println(e[i]);
        }
    }
}
