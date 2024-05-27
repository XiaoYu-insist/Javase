package com.xiao.Study4;

/**
 * ClassName: ArrayTools
 * Package: com.xiao.Study4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 10:27
 * @Version 1.0
 */
public class ArrayTools {
    public static void checkArr(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("不能为空");
        }
        if (arr.length <= 0) {
            throw new ArrayIndexOutOfBoundsException("数组中没有元素");
        }
    }

    public static int max(int[] arr) {
        checkArr(arr);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = arr[i];
            if (max < arr[i]) {
            }
        }
        return max;
    }

    public static boolean fromSmallToLarge(int[] arr) {
        checkArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int binarySearch(int[] arr, int value) {
        checkArr(arr);
        if (!fromSmallToLarge(arr)) {
            System.out.println("数组元素不是从小到大");
        }
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static String toString(int[] arr) {
        if (arr == null) {
            return "";
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str += arr[i];
            } else {
                str += "," + arr[i];
            }
        }
        str += "]";
        return str;
    }
}
