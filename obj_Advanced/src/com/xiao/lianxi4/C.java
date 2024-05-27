package com.xiao.lianxi4;

/**
 * ClassName: C
 * Package: com.xiao.lianxi4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/10 16:28
 * @Version 1.0
 */
public class C extends B {
    protected int numc = 30;
    public void showA(){
        System.out.println("numa="+super.numa);
    }
    public void showB(){
        System.out.println("numb="+super.numb);
    }
    public void showC(){
        System.out.println("numc="+this.numc);
    }
}
