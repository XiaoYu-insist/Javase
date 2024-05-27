package com.xiao.lianxi11;

/**
 * ClassName: nterfaceTe
 * Package: com.xiao.lianxi11
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/13 15:58
 * @Version 1.0
 */
public class nterfaceTe {
    public static void main(String[] args) {
        ComparableCircle c1=new ComparableCircle(1.3);
        ComparableCircle c2 = new ComparableCircle(3.5);
        int Compars = c1.compareTo(c2);
        if (Compars > 0){
            System.out.println("c1大");
        } else if (Compars < 0) {
            System.out.println("c2大");
        }else {
            System.out.println("一样大");
        }
    }
}
