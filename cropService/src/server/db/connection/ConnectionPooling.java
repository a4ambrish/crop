package server.db.connection;

import java.sql.Connection;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import nic.java.util.Debug;
import org.apache.tomcat.jdbc.pool.DataSource;

public class ConnectionPooling {

    private static DataSource dsLocal;
    private static DataSource dsRemote;

    public static Connection getDBConnectionLocal() throws NamingException, Exception {

        Connection con = null;
        try {
            if (dsLocal != null) {
                con = dsLocal.getConnection();
            } else {
                dsLocal = new DataSource();
                dsLocal.setDriverClassName("org.postgresql.Driver");
                dsLocal.setUrl("jdbc:postgresql://localhost:5432/crop");
                dsLocal.setUsername("postgres");
                dsLocal.setPassword("postgres");
                dsLocal.setInitialSize(10);
                dsLocal.setMaxActive(20);
                dsLocal.setMaxIdle(5);
                dsLocal.setMinIdle(2);
                con = dsLocal.getConnection();
            }

        } catch (Exception e) {
            e.printStackTrace();
            Debug.logexc(e, "ConnectionPooling.getDBConnection()");
        }
        return con;
    }

    public static Connection getDBConnectionRemoteServer() throws NamingException, Exception {

        Connection con = null;
        try {
            if (dsRemote != null) {
                con = dsRemote.getConnection();
            } else {
                dsRemote = new DataSource();
                dsRemote.setDriverClassName("org.postgresql.Driver");
                // change as per remote DB Server.
                dsRemote.setUrl("jdbc:postgresql://localhost:5432/crop");
                dsRemote.setUsername("postgres");
                dsRemote.setPassword("postgres");
                dsRemote.setInitialSize(10);
                dsRemote.setMaxActive(20);
                dsRemote.setMaxIdle(5);
                dsRemote.setMinIdle(2);
                con = dsRemote.getConnection();
            }

        } catch (Exception e) {
            e.printStackTrace();
            Debug.logexc(e, "ConnectionPooling.getDBConnection()");
        }
        return con;
    }
}
