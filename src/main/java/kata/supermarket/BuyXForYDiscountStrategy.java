package kata.supermarket;

import java.math.BigDecimal;

/**
 * This class implements the "buy x amount of a product for price of y" discount strategy.
 */

public class BuyXForYDiscountStrategy implements DiscountStrategy{
    @Override
    public BigDecimal calculateDiscount(final Item item) {
        return BigDecimal.ZERO;
    }
}
