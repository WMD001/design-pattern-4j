package top.wmd001.behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CustomerStrategy implements PriceStrategy{
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.95).setScale(2, RoundingMode.HALF_UP));
    }
}
