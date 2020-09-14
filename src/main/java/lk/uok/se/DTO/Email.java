package lk.uok.se.DTO;

public class Email {
    private String address;
    private String errorMsg;

    public Email() {
    }

    public Email(String address, String errorMsg) {
        this.address = address;
        this.errorMsg = errorMsg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
