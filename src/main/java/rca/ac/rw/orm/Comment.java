package rca.ac.rw.orm;

import javax.xml.crypto.Data;
import java.util.Date;

public class Comment {
private int id;
private String contents;
private Date timeAdded;
private User user;
private Posts posts;

    public Comment(int id, String contents, Date timeAdded, User user, Posts posts) {
        this.id = id;
        this.contents = contents;
        this.timeAdded = timeAdded;
        this.user = user;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Date timeAdded) {
        this.timeAdded = timeAdded;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }
}
