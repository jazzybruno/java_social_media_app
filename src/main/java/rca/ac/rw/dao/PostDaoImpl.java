package rca.ac.rw.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.annotations.Pos;
import rca.ac.rw.orm.Post;

import java.util.List;

public class PostDaoImpl implements PostDao{
    private Session session;
    Transaction transaction = null;
    public PostDaoImpl(Session session){
        this.session = session;
    }

    public List<Post> getPosts(){
        try {
            transaction = session.beginTransaction();
            List<Post> posts = session.createCriteria(Post.class).list();
            transaction.commit();
            session.close();
            return posts;
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }
    public void savePost(Post post){
        try {
            transaction = session.beginTransaction();
            session.save(post);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updatePost(Post post){

        try {
            transaction = session.beginTransaction();
            session.update(post);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletePost(int id){
        try {
            transaction = session.beginTransaction();
            Post posts  = (Post) session.get(Post.class , id);

            if(posts != null){
                session.delete(posts);
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
