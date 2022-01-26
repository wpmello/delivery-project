package domain;

import lombok.Data;

@Data
public class Client {

    private int CLIENT_CODE = 1;

    private String name;
    private int code;

    public Client(String name) {
        this.name = name;
        this.code = this.CLIENT_CODE++;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
