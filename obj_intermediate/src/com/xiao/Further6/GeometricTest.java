package com.xiao.Further6;

/**
 * ClassName: GeometricTest
 * Package: com.xiao.Further6
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 15:37
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red",3.2,2.1);
        Circle c2 = new Circle("blue",9.2,2.8);
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        boolean a = test.equalsArea(c1,c2);
        if(a){
            System.out.println("相等");
        }else {
            System.out.println("no");
        }
    }
    public boolean equalsArea(GeometricObject g1, GeometricObject g2){

            return g1.findArea() == g2.findArea();

    }
    public void displayGeometricObject(GeometricObject g){
        System.out.println("几何图形面积为："+g.findArea());
    }
}
