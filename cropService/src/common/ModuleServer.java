/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import common.remote.AuthServer;
import server.remoteimpl.AuthServerImpl;

/**
 *
 * @author ambrish
 */
public class ModuleServer {

    private static AuthServer authServer = null;

    public static AuthServer authServer() {
        if (authServer == null) {
            authServer = new AuthServerImpl();
        }
        return authServer;
    }

}
