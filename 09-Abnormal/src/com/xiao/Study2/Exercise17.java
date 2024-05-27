package com.xiao.Study2;

/**
 * ClassName: Exercise17
 * Package: com.xiao.Study2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 10:02
 * @Version 1.0
 */
public class Exercise17 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,2);
        System.out.println("r1 = "+r1);
        Rectangle r2;
        try {
            r2 = (Rectangle) r1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            r2 = new Rectangle();
            r2.setLength(r1.getLength());
            r2.setWidth(r1.getWidth());
        }
        System.out.println("r2 = " + r2);
    }
}
