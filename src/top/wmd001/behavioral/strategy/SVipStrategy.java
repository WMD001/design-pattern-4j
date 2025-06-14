package top.wmd001.behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SVipStrategy implements PriceStrategy{
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal("0.7")).setScale(2, RoundingMode.HALF_UP);
    }
}
