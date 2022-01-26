package domain;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class DeliveryMan {

    private String name;
    private Set<Delivery> deliveries = new LinkedHashSet<>();
}
