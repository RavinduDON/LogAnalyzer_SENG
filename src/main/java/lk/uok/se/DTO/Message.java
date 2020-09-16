package lk.uok.se.DTO;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private SimpleDateFormat datetimeFormatter1 = new SimpleDateFormat("yyyy-MM-dd,hh:mm:ss");
    private Date date;
    private Timestamp timestamp;
    private String type;
    private String detail;

    public Message() {
    }

    public Message(SimpleDateFormat datetimeFormatter1, Date date, Timestamp timestamp, String time, String type, String detail) {
        this.datetimeFormatter1 = datetimeFormatter1;
        this.date = date;
        this.timestamp = timestamp;
        this.type = type;
        this.detail = detail;
    }

    public SimpleDateFormat getDatetimeFormatter1() {
        return datetimeFormatter1;
    }

    public void setDatetimeFormatter1(SimpleDateFormat datetimeFormatter1) {
        this.datetimeFormatter1 = datetimeFormatter1;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
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
