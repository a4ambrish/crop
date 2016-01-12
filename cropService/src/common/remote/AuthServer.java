package common.remote;
//////////////////////////////////////////////////////////////////////////////
// CLASS            : AuthServer
// PURPOSE          : User authentication specific services
// NOTES            : None
// LAST MODIFIED    :
//  20040223 AKT025 Auditing - Removed 'Superfluous Content'
//  20030919 GUM019 Corrected javadoc
//  20030723 GUM011 Added invalidateSession()
//  20030715 AKS008 Auditing - Removed 'Superfluous Content'
//  20030509 GUM002 Changed authenticateUser() to return ClientContext
//  20030502 RCN004 Created
//////////////////////////////////////////////////////////////////////////////
// Copyright 2003 National Informatics Centre, NIC. http://www.nic.in
// All Rights Reserved.
//////////////////////////////////////////////////////////////////////////////
//
// Importing standard java packages/classes
//
import java.rmi.*;
import java.util.*;
//
// Importing Common java packages/classes
//
import common.*;
import common.context.*;


/**
 * User authentication specific methods.
 */
public interface AuthServer extends Remote {
    /**
     * Validates a user's id and password.
     * throws exception when userid or password is not matching or when the user is disabled
     *
     * @param userid User ID
     * @param password password of the user
     *
     * @return ClientContext object
     *
     * @throws RemoteException
     * @throws ClientException
     * @throws UserAuthenticationException 
     */
    ClientContext authenticateUser(String userid, String password) throws RemoteException, ClientException, UserAuthenticationException;
    
    ClientContext authenticateUser(String userid, String password,String stateName, String rtoName) throws RemoteException, ClientException, UserAuthenticationException;

    /**
     * Invalidate the given session.
     *
     * @param sessionID User Session ID
     *
     * @return true if UserSession *removed* from the user session list else false
     */
    boolean invalidateSession(long sessionID) throws RemoteException;
    
    /**
     * Creates UserServices object which contains a list of all the services for a user.
     * Also contains a list of all the access available to the user
     *
     * @param userid User ID
     *
     * @return UserServices UserServices object containing list of rights
     *
     * @throws RemoteException
     * @throws ClientException
     */
    UserServices getUserServices(String userid) throws RemoteException, ClientException;

    /**
     * Warapper method to check whether a user has the permission to access
     * a particular service and do the selected operation on it.
     *
     * @param userid User ID
     * @param serviceID service identifier integer.
     * @param operationID operation identifier
     *
     * @return boolean true if the user can access the service and do the 
     * operation.
     *
     * @throws RemoteException
     * @throws ClientException
     */
    boolean isAllowed(String userid, int serviceID, int operationID)
            throws RemoteException, ClientException;
    //DIV21july2008 --start
    /**
     * Method to set RTO and StateCode
     *
     * @param  stateName State's Name
     * @param rtoName RTO's Name
     *
     * @throws RemoteException
     * @throws ClientException
     */
    void setStateRtoCode(String stateName, String rtoName)
            throws RemoteException, ClientException;
    //DIV21july2008 --End
}