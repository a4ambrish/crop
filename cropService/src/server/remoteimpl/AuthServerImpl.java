/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.remoteimpl;

import common.ClientException;
import common.context.ClientContext;
import common.context.UserAuthenticationException;
import common.remote.AuthServer;
import common.security.Encryption;
import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.common.CommonMethods;
import server.db.connection.TransactionManagerLocal;

/**
 *
 * @author ambrish
 */
public class AuthServerImpl implements AuthServer {

    @Override
    public ClientContext authenticateUser(String userid, String saltedPassword, String saltKey, String poolName) throws RemoteException, ClientException, UserAuthenticationException {
        ClientContext clientContext = null;
        try {
            System.out.println("saltedPassword  "+saltedPassword);
            System.out.println("saltKey  "+saltKey);
            String sqlQuery = "select user_id,user_password,user_name,email,mobile,active_ind,remarks from user_detail where user_id=?";
            TransactionManagerLocal tmgr = new TransactionManagerLocal("AuthServerImpl:authenticateUser");
            PreparedStatement prstmt = tmgr.prepareStatement(sqlQuery);
            prstmt.setString(1, userid);
            ResultSet rs = tmgr.fetchDetachedRowSetFromPreparedStatement();
            if (rs.next()) {
                String userPassword = rs.getString("user_password");
                String userName = rs.getString("user_name");
                String mobile = rs.getString("mobile");
                Boolean activeInd = rs.getBoolean("active_ind");
                String remarks = rs.getString("remarks");

                String saltedDBPassword = Encryption.md5(userPassword + saltKey);
                System.out.println("saltedDBPassword   "+saltedDBPassword);
                if (saltedPassword.equalsIgnoreCase(saltedDBPassword)) {

                    clientContext = new ClientContext(userid, userName, mobile, activeInd, remarks);

                } else {
                    throw new UserAuthenticationException("Invalid password");
                }

            } else {
                throw new UserAuthenticationException("Invalid User id");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AuthServerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientContext;

    }

}
