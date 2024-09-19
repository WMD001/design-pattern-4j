package main.java.top.wmd001.structural.bridge.store;

import main.java.top.wmd001.structural.bridge.pay.PayWay;

public class JdStore extends Store {

    public JdStore(PayWay payWay) {
        super(payWay);
    }

    @Override
    public void pay(int money) {
        System.out.println("京东店铺消费：￥" + money);
        payWay.pay(money);
    }
}
