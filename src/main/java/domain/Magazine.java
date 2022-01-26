package domain;

public class Magazine extends Product{

    private String publishingCompany;

    public Magazine(String name, Integer quantity, Double unitPrice, String publishingCompany) {
        super(name, quantity, unitPrice);
        this.publishingCompany = publishingCompany;
    }
}
