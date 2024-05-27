package com.xiao.Basics3;

/**
 * ClassName: PassObject
 * Package: com.xiao.Basics3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/18 14:35
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
      PassObject p = new PassObject();
      Circle c = new Circle();
      p.printAreas(c,5);
      System.out.println("now\tradius\t"+c.radius);

    }
    public void printAreas(Circle c,int time){
        System.out.println("Radius\t\tArea");
        int i = 1;
        for (;i<=time;i++){
            c.radius = i;
            System.out.println(c.radius+"\t\t"+c.findArea());
        }
        c.radius = i;
    }
}
