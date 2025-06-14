package top.wmd001.behavioral.strategy;

import java.math.BigDecimal;

public interface PriceStrategy {

    BigDecimal getPrice(BigDecimal price);

}
