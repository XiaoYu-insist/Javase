package com.xiao.Practice3;

/**
 * ClassName: MyInt
 * Package: com.xiao.Practice3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 9:18
 * @Version 1.0
 */
public class MyInt {
    int value;
    public boolean isNatural(){
        if(value < 0){
            return false;
        }
        return true;
    }
    public int approximateNumberCount(){
        int count = 0;
        for(int i = 1; i <= value; i++){
            if(value % i == 0){
                count++;
            }
        }
        return count;
    }
    public boolean isPrimeNumber(){
        return value > 1 &&approximateNumberCount() ==2;
    }
    public int[] getAllApproximateNumber(){
        int[] all = new int[approximateNumberCount()];
        for(int i = 1,j=0; i <value; i++){
            if(value%i == 0){
                all[j++]=i;
            }
        }
        return all;
    }
}
