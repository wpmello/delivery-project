package domain;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Magazine("Veja", 1, 15.0,"Abril");
        Product product2 = new Candy("Tubes", 5, 5.0, "Fini");
        Product product3 = new Drink("Skol", 15, 2.0, "Garrafa");
        Product product4 = new Drink("Coca-Cola", 10, 5.0,"Lata");
        Product product5 = new Drink("Água", 20, 2.0, "Garrafa");

        Client client = new Client("João Mario");

        Delivery delivery = new Delivery(client, "R: Estrada das Peiras", LocalTime.now());
        delivery.getProducts().add(product1);
        delivery.getProducts().add(product2);
        delivery.getProducts().add(product3);
        delivery.getProducts().add(product4);
        delivery.getProducts().add(product5);

        System.out.println(delivery);
        System.out.println(delivery.totalProductsPrice());

        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setName("João");
        deliveryMan.getDeliveries().add(delivery);

        System.out.println(deliveryMan);
    }
}
