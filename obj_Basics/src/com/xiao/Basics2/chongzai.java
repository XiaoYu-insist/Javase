package com.xiao.Basics2;

/**
 * ClassName: chongzai
 * Package: com.xiao.Basics2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/16 16:48
 * @Version 1.0
 */
public class chongzai {
    public void mOL(int a){
        System.out.println("是什么"+a);
    }
    public void mOL(int a,int b){
        System.out.println("是什么"+a+","+b);
    }
    public void mOL(String a){
        System.out.println("是什么"+a);
    }
    public void max(int a,int b){
        if(a>b){
            System.out.println("最大值是"+a);
            return;
        }
        System.out.println("最大值是"+b);

    }
    public void max(double a,double b){
        if(a>b){
            System.out.println("最大值是"+a);
            return;
        }
        System.out.println("最大值是"+b);
    }
    public void max(double a,double b,double c){
        if(a>b&&a>c){
            System.out.println("最大值是"+a);
        }else if (b>a&&b>c){
            System.out.println("最大值是" + b);
        }else {
            System.out.println("最大值是" + c);
        }
    }
}
