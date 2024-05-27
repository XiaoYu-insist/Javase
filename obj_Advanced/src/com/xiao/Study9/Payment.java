package com.xiao.Study9;

/**
 * ClassName: Payment
 * Package: com.xiao.Study9
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 15:53
 * @Version 1.0
 */
public enum Payment implements Payable{
    ALIPAY("支付宝"),WECHAT("微信"),CREDITCARD("信用卡"),DEPOSITCARD("储蓄卡");
    private final String description;

    Payment(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public void pay() {
        switch (this){
            case ALIPAY:
            case WECHAT:
                System.out.println("扫码支付");
                break;
            case CREDITCARD:
            case DEPOSITCARD:
                System.out.println("输入卡号支付");
                break;
        }
    }
}
