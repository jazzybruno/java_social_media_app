package rca.ac.rw.orm;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "likes")
public class Like {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@ManyToOne
@JoinColumn(name = "post_id")
private Post posts;
@ManyToOne
@JoinColumn(name = "user_id")
private User user;
private Date date;

    public Like(Post posts, User user, Date date) {
        this.posts = posts;
        this.user = user;
        this.date = date;
    }

    public Post getPosts() {
        return posts;
    }

    public void setPosts(Post posts) {
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
