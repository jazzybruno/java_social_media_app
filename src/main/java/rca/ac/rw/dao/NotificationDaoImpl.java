package rca.ac.rw.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rca.ac.rw.orm.Notification;

import java.util.List;

public class NotificationDaoImpl implements NotificationDao{
    Session session;
    Transaction transaction;
    public NotificationDaoImpl(Session session){
        this.session = session;
    }

    public void saveNotification(Notification notification){
       transaction = null;
       try {
           transaction =  session.beginTransaction();
           session.save(notification);
           transaction.commit();
           session.close();
       }catch (Exception e){
           if (transaction != null){
               transaction.rollback();
           }
           e.printStackTrace();
       }

    }

    public List<Notification> getNotifications(){
        return session.createCriteria(Notification.class).list();
    }

    public void updateNotification(Notification notification){
        transaction = null;
        try {
            transaction =  session.beginTransaction();
            session.saveOrUpdate(notification);
            transaction.commit();
            session.close();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteNotification(int id){
        transaction = null;
        try {
            transaction = session.beginTransaction();
            Notification notification = (Notification) session.get(Notification.class , id);

            if (notification != null){
               session.delete(notification);
            }
            transaction.commit();
            session.close();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
