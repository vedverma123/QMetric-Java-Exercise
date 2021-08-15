package kata.supermarket;

import java.math.BigDecimal;

/**
 * This class implements "weighted product for fixed price" discount strategy.
 */
public class WeightedProductDiscountStrategy implements DiscountStrategy{
    @Override
    public BigDecimal calculateDiscount(final Item item) {
        if(item instanceof ItemByWeight){
            ItemByWeight weightedItem = (ItemByWeight) item;
            final BigDecimal weightInKilos = weightedItem.getWeightInKilos();

            //we can change the below logic as required, depends on the discount strategy.
            if(weightInKilos.doubleValue() >= BigDecimal.ONE.doubleValue()){
                return new BigDecimal(weightedItem.price().divide(BigDecimal.valueOf(2)).doubleValue());
            }
        }
        return BigDecimal.ZERO;
    }
}
