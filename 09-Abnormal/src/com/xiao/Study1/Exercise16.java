package com.xiao.Study1;

/**
 * ClassName: Exercise16
 * Package: com.xiao.Study1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 9:58
 * @Version 1.0
 */
public class Exercise16 {
    public static void main(String[] args) {
        for (int i = 10;i>=1;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }
        System.out.println("新年好");
    }
}
