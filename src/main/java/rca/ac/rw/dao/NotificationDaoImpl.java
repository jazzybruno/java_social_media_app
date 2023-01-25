package rca.ac.rw.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rca.ac.rw.orm.Notification;

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
}
