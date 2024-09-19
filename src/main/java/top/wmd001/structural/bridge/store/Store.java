package main.java.top.wmd001.structural.bridge.store;

import main.java.top.wmd001.structural.bridge.pay.PayWay;

public abstract class Store {

    protected PayWay payWay;

    /**
     * 使用组合的方式关联PayWay
     * Store的子类也可以关联PayWay的子类
     * @param payWay PayWay
     */
    public Store(PayWay payWay) {
        this.payWay = payWay;
    }

    public abstract void pay(int money);

}
