package rca.ac.rw.orm;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "likes")
public class Likes {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@OneToMany
@JoinColumn(name = "post_id")
private Posts posts;
@OneToMany
@JoinColumn(name = "user_id")
private User user;
private Date date;

    public Likes( Posts posts, User user, Date date) {
        this.posts = posts;
        this.user = user;
        this.date = date;
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
