package chengzhi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrator on 2017/7/18/018.
 */
public class BaseDao {
    public static SessionFactory sessionFactory;
    public static Session getCurrentSession(){
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        return session;
    }
}
