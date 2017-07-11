/**
 * 
 */
package co.com.pruebas.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author zymat
 *
 */
public class HibernateUtil {
	/**
	 * Session
	 */
	private static final SessionFactory sessionFactory = buildSessionFactory();

	/**
	 * 
	 * @return
	 */
    private static SessionFactory buildSessionFactory() {
        try {
            // Crea el  SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
    	// Cerrar la conexion.
    	getSessionFactory().close();
    }
}
