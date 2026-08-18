package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeApp {
    public static void main(String[] args) {
        SessionFactory factory = (SessionFactory) hibernate_util.getSessionFactory();
        Session session = factory.openSession();
        Transaction tcx = session.beginTransaction();

        //address object
        Address a1 =new Address(1,"malleshwaram","bangalore","karnataka", 560001);
        Employee e1 = new Employee(101,"mayur",90000.0,a1);
        session.persist(e1);
        tcx.commit();
        Employee e = session.find(Employee.class, "E101");

        System.out.println(e);

        session.close();
        factory.close();


    }
}
