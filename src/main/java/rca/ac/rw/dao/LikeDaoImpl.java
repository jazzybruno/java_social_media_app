package rca.ac.rw.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rca.ac.rw.orm.Like;

import java.util.List;

public class LikeDaoImpl  implements LikeDao{
    Session session;
    Transaction transaction = null;
    public LikeDaoImpl(Session session){
        this.session = session;
    }
    public List<Like> getLikes(int post_id){
        try {
            transaction = session.beginTransaction();
            List<Like> likes = session.createQuery("SELECT * FROM likes WHERE likes.posts = :post_id").setParameter("post_id" , post_id).list();
            transaction.commit();
            session.close();
            return likes;
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }

    public void saveLike(Like like){
      try {
          transaction = session.beginTransaction();
          session.save(like);
          transaction.commit();
          session.close();
      }catch (Exception e){
          if (transaction != null){
              transaction.rollback();
          }
          e.printStackTrace();
      }
    };

    public void updateLike(Like like){
         try {
             transaction = session.beginTransaction();
             session.saveOrUpdate(like);
             transaction.commit();
             session.close();
         }catch (Exception e){
             if (transaction != null){
                 transaction.rollback();
             }
             e.printStackTrace();
         }
    }

    public void deleteLike(int id){
       try {
           transaction = session.beginTransaction();
           Like like = (Like) session.get(Like.class , id);
           if(like != null){
               session.delete(like);
           }
           transaction.commit();
           session.close();
       }catch (Exception e){
           if (transaction != null){
               transaction.rollback();
           }
           e.printStackTrace();
       }
    };

}
