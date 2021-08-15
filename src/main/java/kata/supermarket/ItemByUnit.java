package kata.supermarket;

import java.math.BigDecimal;

public class ItemByUnit implements Item {

    private final Product product;
    private final DiscountStrategy discountStrategy;

    ItemByUnit(final Product product, final DiscountStrategy discountStrategy) {
        this.product = product;
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal price() {
        return product.pricePerUnit();
    }

    @Override
    public BigDecimal discount() {
        if(discountStrategy != null){
            return discountStrategy.calculateDiscount(this);
        }
        return BigDecimal.ZERO;
    }

    public Product getProduct() {
        return product;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }
}
