package top.wmd001.behavioral.strategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        PriceStrategy customerStrategy = new CustomerStrategy();
        PriceStrategy vipStrategy = new VipStrategy();
        SVipStrategy sVipStrategy = new SVipStrategy();

        BigDecimal price = new BigDecimal("100");

        System.out.println("普通顾客：" + customerStrategy.getPrice(price));
        System.out.println("VIP顾客：" + vipStrategy.getPrice(price));
        System.out.println("SVIP顾客：" + sVipStrategy.getPrice(price));

    }

}
