package top.wmd001.structural.bridge.store;

import top.wmd001.structural.bridge.pay.PayWay;

public class TbStore extends Store {

    public TbStore(PayWay payWay) {
        super(payWay);
    }

    @Override
    public void pay(int money) {
        System.out.println("淘宝店铺消费：￥" + money);
        payWay.pay(money);
    }
}
