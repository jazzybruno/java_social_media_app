package rca.ac.rw.starter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rca.ac.rw.orm.User;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        System.out.println("The configuration are being loaded");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println("The configuration files have been loaded");

        User user = new User("Jazzy Bruno" , "0788097878" , "jazzybruno45@gmail.com" , "data:image/png;base64,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");

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
