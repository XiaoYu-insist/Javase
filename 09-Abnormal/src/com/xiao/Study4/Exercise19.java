package com.xiao.Study4;

/**
 * ClassName: Exercise19
 * Package: com.xiao.Study4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 10:26
 * @Version 1.0
 */
public class Exercise19 {
    public static void main(String[] args) {
        //  int[] arr = null;
        // int[] arr = {}
        // int[] arr = {3,2,1,4};
        int[] arr = {1,5,16,28,39};

        try {
            System.out.println(ArrayTools.toString(arr));
            System.out.println("最大值：" + ArrayTools.max(arr));
            System.out.println("查找5：" + ArrayTools.binarySearch(arr,5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
