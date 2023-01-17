package rca.ac.rw.orm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int post_id;
    public String description;
    public ArrayList<String> postPhotos = new ArrayList<String>();
    @OneToMany
    @JoinColumn(name = "user_id")
    public User user;
    public int likes;
    public int comments;

    public Date addedDate;

    public Posts( String description, ArrayList<String> postPhotos, User user, int likes, int comments ) {
        this.description = description;
        this.postPhotos = postPhotos;
        this.user = user;
        this.likes = likes;
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getPostPhotos() {
        return postPhotos;
    }

    public void setPostPhotos(ArrayList<String> postPhotos) {
        this.postPhotos = postPhotos;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
}
