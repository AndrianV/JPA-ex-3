package interfaces;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Inheritance(strategy = InheritanceType.JOINED)
public interface DiscountType {
    
    public double calcDiscount(double priceItem, int quantity);
}
