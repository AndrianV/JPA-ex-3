/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import interfaces.DiscountType;
import java.io.Serializable;
import javax.persistence.*;


@Entity
public class DiscountQuantity implements Serializable,DiscountType {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    int quantityForDiscount = 3;
    double discount = 0.2; //20% on all if quantity is 3 or more

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return quantity >= quantityForDiscount ? priceItem * quantity * discount : 0;
    }

}
