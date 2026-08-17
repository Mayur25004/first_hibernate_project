package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = hibernate_util.getSessionFactory();
        Student s1 = new Student(101,"mayur",90);
        Student s2 = new Student(102,"sohail",80);

        Session session = factory.openSession();
        Transaction txc =session.beginTransaction();

        session.persist(s1);
        session.persist(s2);

        txc.commit();
        session.close();
        factory.close();
    }
}
