package rca.ac.rw.orm;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "messages")
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String message;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private  User sender;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User receiver;


    public Messages(){

    }

    public Messages(int id, String message, Date date, User sender, User receiver) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.sender = sender;
        this.receiver = receiver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
