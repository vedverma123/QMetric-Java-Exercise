package kata.supermarket;

import java.math.BigDecimal;

/**
 * This class implements the buy one get one discount strategy.
 */
public class BOGODiscountStrategy implements DiscountStrategy{

    @Override
    public BigDecimal calculateDiscount(final Item item) {
        return BigDecimal.ZERO;
    }

}
