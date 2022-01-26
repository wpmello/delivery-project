package domain;

public class Candy extends Product {

    private String brand;

    public Candy(String name, Integer quantity, Double unitPrice, String brand) {
        super(name, quantity, unitPrice);
        this.brand = brand;
    }
}
