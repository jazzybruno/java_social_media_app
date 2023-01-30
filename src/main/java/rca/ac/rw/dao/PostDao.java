package rca.ac.rw.dao;

import rca.ac.rw.orm.Like;
import rca.ac.rw.orm.Post;

import java.util.List;

public interface PostDao {
    public void savePost(Post post);
    public void updatePost(Post post);
    public void deletePost(int id);
    public List<Post> getPosts();
}
