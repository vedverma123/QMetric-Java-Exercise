package kata.supermarket;

import java.math.BigDecimal;

public class ItemByWeight implements Item {

    private final WeighedProduct product;
    private final BigDecimal weightInKilos;
    private final DiscountStrategy discountStrategy;

    ItemByWeight(final WeighedProduct product, final BigDecimal weightInKilos, final DiscountStrategy discountStrategy) {
        this.product = product;
        this.weightInKilos = weightInKilos;
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal price() {
        return product.pricePerKilo().multiply(weightInKilos).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal discount() {
        if(discountStrategy != null){
            return discountStrategy.calculateDiscount();
        }
        return null;
    }
}
