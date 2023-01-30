package rca.ac.rw.dao;

import rca.ac.rw.orm.Comment;

import java.util.List;

public interface CommentDao {
    public void saveComment(Comment comment);
    public void updateComment(Comment comment);
    public void deleteComment(int id);
    public List<Comment> getComments();

}
