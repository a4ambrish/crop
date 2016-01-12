
import common.ClientException;
import common.ModuleServer;
import common.context.ClientContext;
import common.security.Encryption;
import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.RowSet;
import server.db.DBUtils;
import server.db.connection.TransactionManagerLocal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ambrish
 */
public class TestMail {
    public static void main(String[] args) throws SQLException, ClientException, RemoteException {
        RowSet rs = DBUtils.fetchDetachedRowSet("select * from state_mas");
        while(rs.next()){
            System.out.println(rs.getString(1) + "   "+rs.getString(2));
        }

        ClientContext ctx =  ModuleServer.authServer().authenticateUser("ambrish","eee8f9345bd912981ccbef1bb3222d7c","lw8uT",null);
      
        System.out.println( ctx.toString());
        
    }
}
