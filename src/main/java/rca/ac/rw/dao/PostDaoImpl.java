package rca.ac.rw.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rca.ac.rw.orm.Posts;

public class PostDaoImpl {
    private Session session;
    Transaction transaction = null;
    public PostDaoImpl(Session session){
        this.session = session;
    }

    public void savePost(Posts posts){
        try {
            transaction = session.beginTransaction();
            session.save(posts);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updatePost(Posts posts){

        try {
            transaction = session.beginTransaction();
            session.update(posts);
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
            Posts posts  = (Posts) session.get(Posts.class , id);

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
