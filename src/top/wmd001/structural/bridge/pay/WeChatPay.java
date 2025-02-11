package top.wmd001.structural.bridge.pay;

public class WeChatPay implements PayWay{
    @Override
    public void pay(int money) {
        System.out.println("使用微信支付成功！");
    }
}
