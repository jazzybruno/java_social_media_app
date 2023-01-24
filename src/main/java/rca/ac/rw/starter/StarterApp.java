package rca.ac.rw.starter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rca.ac.rw.orm.User;

import java.util.logging.Logger;

public class StarterApp {
    public static void main(String args[]){
        System.out.println("The configuration are being loaded");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
//        Logger logger = Logger.getLogger("ClientApplicationLog");
//        logger.info("Logger Test");
        System.out.println("The configuration files have been loaded");
//        ArrayList<Likes> likes
//        ArrayList<Comment> comments
        User user = new User("Jazzy Bruno" , "0788097878" , "jazzybruno45@gmail.com" , "https://github.com/jazzybruno");
        try{
            SessionFactory factory = configuration.buildSessionFactory();
            Session session = factory.openSession();

            System.out.println("Beginning Transactions..........");
            Transaction transaction = session.beginTransaction();

              session.saveOrUpdate(user);

            System.out.println("Committing transaction.............");
            transaction.commit();
            System.out.println("Before Closing the session");
            session.close();
            factory.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
