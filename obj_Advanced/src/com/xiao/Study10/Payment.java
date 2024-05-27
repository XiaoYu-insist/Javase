package com.xiao.Study10;

/**
 * ClassName: Payment
 * Package: com.xiao.Study10
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 16:00
 * @Version 1.0
 */
public enum Payment implements Payable {
    ALIPAY {
        @Override
        public void pay() {
            System.out.println("扫码支付");
        }
    },
    WECHAT {
        @Override
        public void pay() {
            System.out.println("扫码支付");
        }
    }, CREDIT_CARD,DEPOSIT_CARD;

    @Override
    public void pay() {
        System.out.println("输入卡号支付");
    }

    }
