package com.xiao.lianxi5;

/**
 * 资源类
 */
public class Clerk {
    private int productNum = 0;
    private static final int MAX_PRODUCT=20;
    private static final int MIN_PRODUCT=1;

    public synchronized void addProduct(){
        if(productNum < MAX_PRODUCT){
            productNum++;
            System.out.println(Thread.currentThread().getName()+"生成了第"+productNum+"个产品");
            notifyAll();
        }else{
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void minusProduct(){
        if(productNum >= MIN_PRODUCT){
            System.out.println(Thread.currentThread().getName()+"消费了第"+productNum+"个产品");
            productNum--;
            notifyAll();
        }else{
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
