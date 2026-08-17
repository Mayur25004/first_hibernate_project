import com.mysql.cj.xdevapi.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import jakarta.transaction.Transaction;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = hibernate_util.getSessionFactory();
        Student s1 = new Student(101,"mayur",90);
        Student s2 = new Student(102,"sohail",80);

        Session session = factory.openSession();
        Transaction txc =session.beginTansaction();

        session.save(s1);
        session.save(s2);

        txc.commit();
        session.close();
        factory.close();
    }
}
