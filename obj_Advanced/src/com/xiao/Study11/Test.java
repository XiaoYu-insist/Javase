package com.xiao.Study11;

import static com.xiao.Study11.Data.EQUIPMENTS;

/**
 * ClassName: Test
 * Package: com.xiao.Study11
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 16:16
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Equipment[] arr = new Equipment[EQUIPMENTS.length];
        for (int i=0;i<arr.length;i++){
            int id = Integer.parseInt(EQUIPMENTS[i][0]);
            String factory = EQUIPMENTS[i][1];
            double price = Double.parseDouble(EQUIPMENTS[i][2]);
            String name = EQUIPMENTS[i][3];
            int value = Integer.parseInt(EQUIPMENTS[i][4]);
            Status status = Status.getByValue(value);
            arr[i]=new Equipment(id,factory,price,name,status);
            System.out.println(arr[i]);
        }
    }
}
