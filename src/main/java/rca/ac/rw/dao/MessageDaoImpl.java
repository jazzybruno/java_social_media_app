package rca.ac.rw.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rca.ac.rw.orm.Message;
import rca.ac.rw.orm.User;

import java.util.List;

public class MessageDaoImpl implements MessageDao{

    private Session session;

    Transaction transaction = null;

    public MessageDaoImpl(Session session){
        this.session = session;
    }

    public void saveMessage(Message message){
        try {
            transaction = session.beginTransaction();
            session.save(message);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Message> getMessages(){
        List<Message> messages = session.createCriteria(Message.class).list();
        return messages;
    }

    public void updateMessage(Message message){
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(message);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteMessage(int id){
        try {
            transaction = session.beginTransaction();
            Message message = (Message) session.get(Message.class , id);
            if(message != null){
                session.delete(message);
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
