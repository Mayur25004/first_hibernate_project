package org.example;
//    Configuration file is a class which is present in org.hibernate.cfg package
//    -it activates the hibernate framework
//    -it reads both configuration file and mapping file
//    - it checks whether the config file is syntactally correct or not
//    -if the config file is not correct then it will throw an exception
//
 //
//  buildSessionFactory() (an interface)
//      Gathering the meta data which is in the config object from configuration object it takes
//      jdbc information and create a jdbc connection
//


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class hibernate_util {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    public static SessionFactory buildSessionFactory() {
        try{
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        catch(Throwable e){
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    public static void main(String[] args) {

    }
}
