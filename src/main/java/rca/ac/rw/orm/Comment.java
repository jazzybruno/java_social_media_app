package rca.ac.rw.orm;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String contents;
private Date timeAdded;
@ManyToOne
@JoinColumn(name = "user_id")
private User user;
@ManyToOne
@JoinColumn(name = "post_id")
private Post posts;

     public Comment(){

     }

    public Comment(int id, String contents, Date timeAdded, User user, Post posts) {
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

    public Post getPosts() {
        return posts;
    }

    public void setPosts(Post posts) {
        this.posts = posts;
    }
}
