package rca.ac.rw.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rca.ac.rw.orm.Comment;

import java.util.List;

public class CommentDaoImpl {
    private Session session;
    Transaction transaction = null;
    public CommentDaoImpl(Session session){
        this.session = session;
    }

    public void saveComment(Comment comment){
        try {
            transaction = session.beginTransaction();
            session.save(comment);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Comment> getComments(){
        List<Comment> comments;
        try {
             comments = session.createCriteria(Comment.class).list();
            return comments;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public void updateComment(Comment comment){

         try {
             transaction = session.beginTransaction();
             session.update(comment);
             transaction.commit();
         }catch (Exception e){
             if(transaction != null){
                 transaction.rollback();
             }
             e.printStackTrace();
         }
    }

    public void deleteComment(int id){
        try {
            transaction = session.beginTransaction();
            Comment comment  = (Comment) session.get(Comment.class , id);

            if(comment != null){
                session.delete(comment);
            }
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
