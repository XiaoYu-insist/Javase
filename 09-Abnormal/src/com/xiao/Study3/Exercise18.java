package com.xiao.Study3;

import java.util.Scanner;

/**
 * ClassName: Exercise18
 * Package: com.xiao.Study3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 10:17
 * @Version 1.0
 */
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        while (true){
            try {
                System.out.println("请输入被除数：");
                a = scanner.nextInt();
                break;
            }catch (Exception e){
                scanner.nextLine();
                System.out.println("输入错误，请重新输入！");
            }
        }
        int b;
        while (true){
            try {
                System.out.println("请输入除数：");
                b = scanner.nextInt();
                if (b == 0){
                    System.out.println("请重新输入！");
                }else {
                    break;
                }
            }catch (Exception e){
                scanner.nextLine();
                System.out.println("输入错误，请重新输入！");
            }
        }

        System.out.println(a/b);

        scanner.close();
    }
}
