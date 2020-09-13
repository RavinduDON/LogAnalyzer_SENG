package lk.uok.se.DTO;

public class Message {
    private String date;
    private String time;
    private String type;
    private String detail;

    public Message() {
    }

    public Message(String date, String time, String type, String detail) {
        this.date = date;
        this.time = time;
        this.type = type;
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
