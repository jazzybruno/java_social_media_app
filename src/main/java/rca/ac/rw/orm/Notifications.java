package rca.ac.rw.orm;

import javax.xml.crypto.Data;
import java.util.Date;

public class Notifications {
    private int id;
    private String content;
    private boolean isRead;
    private Date date;

    public Notifications(int id, String content, boolean isRead, Date date) {
        this.id = id;
        this.content = content;
        this.isRead = isRead;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
