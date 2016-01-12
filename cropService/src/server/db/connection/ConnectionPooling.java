package server.db.connection;

import java.sql.Connection;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import nic.java.util.Debug;

public class ConnectionPooling {

    private static DataSource dsLocal;
    private static DataSource dsRemote;

    public static Connection getDBConnectionLocal() throws NamingException, Exception {

        Connection con = null;
        try {
            if (dsLocal != null) {
                con = dsLocal.getConnection();
            } else {
                String dsString = "java:/comp/env/jdbc/localdbserver";
                dsLocal = (DataSource) new InitialContext().lookup(dsString);
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
                String dsString = "java:/comp/env/jdbc/remotedbserver";
                dsRemote = (DataSource) new InitialContext().lookup(dsString);
                con = dsRemote.getConnection();
            }

        } catch (Exception e) {
            e.printStackTrace();
            Debug.logexc(e, "ConnectionPooling.getDBConnection()");
        }
        return con;
    }
}
