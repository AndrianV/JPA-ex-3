package entity;

import interfaces.DiscountType;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DiscountFixed implements Serializable,DiscountType  {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    double discount = 0.1;  //10% on all

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
  @Override
  public double calcDiscount(double priceItem, int quantity) {
    return priceItem * discount *quantity;
  }

    
}
