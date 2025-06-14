package top.wmd001.behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VipStrategy implements PriceStrategy{
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal("0.8")).setScale(2, RoundingMode.HALF_UP);
    }
}
