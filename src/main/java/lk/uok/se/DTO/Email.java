package lk.uok.se.DTO;

public class Email {
    private int id;
    private String address;

    public Email() {
    }

    public Email(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
