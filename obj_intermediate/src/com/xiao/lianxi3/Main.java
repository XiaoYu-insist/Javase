package com.xiao.lianxi3;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: com.xiao.lianxi3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/23 16:58
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
            Employee[] all = new Employee[3];
            all[0] = new SalaryEmployee("张三",15000,new MyDate(1995,5,1));
            all[1] = new Manager("老王",20000,1990,6,1,0.1);
            all[2] = new HourEmployee("李四",50,100);

            double sum = 0;
            for (int i = 0; i < all.length; i++) {
                System.out.println(all[i].getInfo());
                sum += all[i].earing();
            }
            System.out.println("实发工资总额：" + sum);

            Scanner input = new Scanner(System.in);
            System.out.print("请输入月份：");
            int month = input.nextInt();

            for (int i = 0; i < all.length; i++) {
                if(all[i] instanceof SalaryEmployee){
                    SalaryEmployee s = (SalaryEmployee) all[i];
                    if(s.getBirthday().getMonth() == month){
                        System.out.println(s.getName() + "生日快乐，请到人事部门领取生日大礼包");
                    }
                }
            }
            input.close();
        }
    }

