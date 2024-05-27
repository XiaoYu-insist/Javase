package com.xiao.lianxi4;

/**
 * ClassName: Main
 * Package: com.xiao.lianxi4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/24 14:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee(1,"段誉",22,3000);
        arr[1] = new Architect(2,"令狐冲",32,18000,15000,2000);
        arr[2] = new Programmer(3,"任我行",23,7000);
        arr[3] = new Programmer(4,"张三丰",24,7300);
        arr[4] = new Designer(5,"周芷若",28,10000,5000);

        System.out.println("--------员工信息---------");
        System.out.println("编号\t姓名\t年龄\t工资\t职位\t奖金\t股票");
        for (int i = 0; i < arr.length; i++) {
            arr[i].setId(i+1);
            System.out.println(arr[i].getInfo());
        }
        System.out.println("------------------------------");
    }
}
