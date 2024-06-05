package com.xiao.lianxi3_1;

/**
 * ClassName: MyThreadone
 * Package: com.xiao.lianxi3_1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 16:08
 * @Version 1.0
 */
public class MyThreadone extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if(i %2==0){
                try{
                    System.out.println(i);
                    join(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
