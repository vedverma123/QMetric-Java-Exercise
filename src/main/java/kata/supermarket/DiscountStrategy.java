package kata.supermarket;

import java.math.BigDecimal;

/**
 * Default interface for discount strategy.
 */
public interface DiscountStrategy {

    BigDecimal calculateDiscount(Item item);

}
