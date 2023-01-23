package rca.ac.rw.dao.user;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rca.ac.rw.orm.User;

import java.util.List;

public class UserDaoImpl {
    private Session session;
    Transaction transaction = null;

    public UserDaoImpl(Session session){
        this.session = session;
    }

    public void saveUser(User user){
        try {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<User> getUsers(){
       List<User> users = session.createCriteria(User.class).list();
       return users;
    }

    public void updateUser(User user){
        try {
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteUser(int id){
        try {
            transaction = session.beginTransaction();
            User user = (User) session.get(User.class , id);
            if(user != null){
                session.delete(user);
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
