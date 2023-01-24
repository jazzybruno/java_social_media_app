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
private Post post;
@OneToOne
@JoinColumn(name = "comment_id")
private Comment childComment;

    public Comment(){

     }

    public Comment(int id, String contents, Date timeAdded, User user, Post posts) {
        this.id = id;
        this.contents = contents;
        this.timeAdded = timeAdded;
        this.user = user;
        this.post = posts;
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
        return post;
    }

    public void setPosts(Post posts) {
        this.post = posts;
    }

    public Comment getChildComment() {
        return childComment;
    }

    public void setChildComment(Comment childComment) {
        this.childComment = childComment;
    }
}
