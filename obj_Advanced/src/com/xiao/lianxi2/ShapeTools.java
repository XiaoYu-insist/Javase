package com.xiao.lianxi2;

/**
 * ClassName: ShapeTools
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/26 16:58
 * @Version 1.0
 */
public class ShapeTools {
    public static int compare(Shape s1, Shape s2) {
        if(s1.area() > s2.area()){
            return 1;
        } else if (s1.area() < s2.area()) {
            return -1;
        }
        return 0;
    }
    public static boolean equals(Shape s1, Shape s2) {
        return s1.area() == s2.area() && s1.perimeter() == s2.perimeter();
    }

    public static void sort(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                boolean flag = false;
                if (arr[i].area() > arr[j].area()) {
                    flag = true;
                }else if (arr[i].area() == arr[j].area()) {
                    if (arr[i].perimeter() > arr[j].perimeter()) {
                        flag = true;
                    }
                }
                if(flag){
                    Shape temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void print(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
