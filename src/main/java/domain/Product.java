package domain;

import lombok.Data;

@Data
public abstract class Product {

    protected String name;
    protected Integer quantity;
    protected Double UnitPrice;

    public Product(String name,Integer quantity, Double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.UnitPrice = unitPrice;

    }

    public double calculateQuantity() {
        return this.getQuantity() * this.getUnitPrice();
    }
}
