package top.wmd001.structural.bridge.pay;

public class AliPay implements PayWay{

    @Override
    public void pay(int money) {
        System.out.println("使用支付宝支付成功");
    }
}
