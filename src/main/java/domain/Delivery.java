package domain;

import lombok.Data;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class Delivery {
    private int CODE = 1;

    private int code;
    private Client client;
    private String address;
    private LocalTime moment;
    private Set<Product> products = new HashSet<>();

    public Delivery(Client client, String address, LocalTime moment) {
        this.client = client;
        this.address = address;
        this.moment = moment;
        this.code = this.CODE++;
    }

    public double totalProductsPrice() {
        return products.stream()
                .mapToDouble(Product::calculateQuantity)
                .sum();
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "code=" + code +
                ", client=" + client +
                ", address='" + address + '\'' +
                ", moment=" + moment +
                ", products=" + products +
                '}' + "\ntotal do pedido=" + totalProductsPrice();
    }
}
