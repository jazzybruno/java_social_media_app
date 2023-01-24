package rca.ac.rw.starter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rca.ac.rw.dao.UserDaoImpl;
import rca.ac.rw.orm.User;

import java.util.logging.Logger;

public class StarterApp {
    public static void main(String args[]){
        System.out.println("The configuration are being loaded");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println("The configuration files have been loaded");
        // the sessions
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        //the user to be registered
        User user = new User("Jazzy Bruno" , "0788097878" , "jazzybruno45@gmail.com" , "https://github.com/jazzybruno");
        UserDaoImpl userDao = new UserDaoImpl(session);

        userDao.saveUser(user);
    }
}
