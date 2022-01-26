package domain;

public class Drink extends Product{

    private String model;

    public Drink(String name, Integer quantity, Double unitPrice, String model) {
        super(name, quantity, unitPrice);
        this.model = model;
    }
}
