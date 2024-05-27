package com.xiao.Study7;

/**
 * ClassName: Execise22
 * Package: com.xiao.Study7
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:36
 * @Version 1.0
 */
public class Execise22 {
    public static void main(String[] args) {
        Account a = new Account("111111",5000);

        try {
            a.withdraw(-5000);
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("取款失败," + e.getMessage());
        }finally {
            System.out.println("尝试取款-5000后，" + a.getBalance() );
        }

        try{
            a.withdraw(1000);
        }catch (Exception e) {
//            e.printStackTrace();
            System.err.println("取款失败," + e.getMessage());
        }finally {
            System.out.println("尝试取款1000后，" + a.getBalance() );
        }

        try{
            a.withdraw(5000);
        }catch (Exception e) {
//            e.printStackTrace();
            System.err.println("取款失败," + e.getMessage());
        }finally {
            System.out.println("尝试取款5000后，" + a.getBalance() );
        }

        try{
            a.save(-5000);
        }catch (Exception e) {
//            e.printStackTrace();
            System.err.println("存款失败," + e.getMessage());
        }finally {
            System.out.println("尝试存款-5000后，" + a.getBalance() );
        }
        try{
            a.save(5000);
        }catch (Exception e) {
//            e.printStackTrace();
            System.err.println("存款失败," + e.getMessage());
        }finally {

            System.out.println("尝试存款5000后，" + a.getBalance() );
        }

    }
}
