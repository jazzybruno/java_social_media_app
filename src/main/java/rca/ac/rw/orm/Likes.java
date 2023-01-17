package rca.ac.rw.orm;

import java.util.Date;

public class Likes {
private int id;
private Posts posts;
private User user;
private Date date;

    public Likes(int id, Posts posts, User user, Date date) {
        this.id = id;
        this.posts = posts;
        this.user = user;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
