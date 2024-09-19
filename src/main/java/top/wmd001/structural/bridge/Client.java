package main.java.top.wmd001.structural.bridge;

import main.java.top.wmd001.structural.bridge.pay.AliPay;
import main.java.top.wmd001.structural.bridge.pay.WeChatPay;
import main.java.top.wmd001.structural.bridge.store.JdStore;
import main.java.top.wmd001.structural.bridge.store.Store;
import main.java.top.wmd001.structural.bridge.store.TbStore;

public class Client {


    public static void main(String[] args) {
        Store jdStore = new JdStore(new WeChatPay());
        jdStore.pay(1000);

        Store tbStore = new TbStore(new AliPay());
        tbStore.pay(1000);


    }

}