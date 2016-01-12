package common.context;
//////////////////////////////////////////////////////////////////////////////
// CLASS            : ClientContext
// PURPOSE          : Stores client identification data
// NOTES            : None
// LAST MODIFIED    :
//  20030519 RCN007 extends ClientObject
//  20030515 JIS009 Serialized
//  20030511 GUM002 Added userID
//  20030306 RCN001 Created
//////////////////////////////////////////////////////////////////////////////
// Copyright 2003 National Informatics Centre, NIC. http://www.nic.in
// All Rights Reserved.
//////////////////////////////////////////////////////////////////////////////
//
// Importing standard java packages/classes
//
import java.util.*;
import java.io.*;
//
// Importing Common java packages/classes
//
import common.*;


/**
 * Stores client identification data
 *
 * @author RCN
 */
public class ClientContext extends ClientObject implements Serializable {
    //////////////////////////////////////////////////////////////////
    // INSTANCE VARIABLES
    //////////////////////////////////////////////////////////////////
    /** Session identifier */
    private long sessionID;

    /** Logged in user name */
    private String userID;

     /** State Code...DIV21072008*/
    private String StateCode;

    /** RTO Code...DIV21072008*/
    private String RtoCode;

    //////////////////////////////////////////////////////////////////
    // CONSTRUCTOR(S)
    //////////////////////////////////////////////////////////////////
    /**
     * Constructor
     */
    //public ClientContext(long sessionID, String userID) {
    public ClientContext(long sessionID, String userID,String StateCode,String RtoCode) {
        this.sessionID = sessionID;
        this.userID = userID;
        this.StateCode = StateCode;
        this.RtoCode = RtoCode;
    }

    //////////////////////////////////////////////////////////////////
    // GETTERS / SETTERS
    //////////////////////////////////////////////////////////////////
    public long getSessionID() {
        return sessionID;
    }

    public String getUserID() {
        return userID;
    }
    /** Added By DIV21072008...Start

    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
    }

    public void setRtoCode(String RtoCode) {
        this.RtoCode = RtoCode;
    }*/

    public String getStateCode() {
        return StateCode;
    }

    public String getRtoCode() {
        return RtoCode;
    }

    /** Added By DIV21072008...End*/

    //SARJIT---------31/05/2010
    //USED BY WEB APPLICATION
     public void setRtoCode(String RtoCode) {
        this.RtoCode = RtoCode;
    }
}