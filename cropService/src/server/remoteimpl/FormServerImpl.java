/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.remoteimpl;

import common.ClientException;
import common.FormData;
import common.InputData;
import common.OperationIds;
import common.ServiceIds;
import common.dobj.crop.HoldingDataDO;
import common.dobj.DO;
import common.remote.FormServer;
import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.RowSet;
import server.db.DBUtils;
import server.db.connection.TransactionManagerLocal;

/**
 *
 * @author ambrish
 */
public class FormServerImpl implements FormServer {

    @Override
    public Object process(FormData data) throws RemoteException, ClientException {
        int serviceId = data.getServiceID();
        int operationId = data.getOperationID();
        switch (serviceId) {
            case ServiceIds.DATA_ENTRY:
                if (operationId == OperationIds.P_HOLDING_DATA) {
                    HoldingDataDO dobj = (HoldingDataDO) data.getDataObject();
                    String tableName = "h_" + dobj.getStateUT() + dobj.getDistCd();
                    boolean validate = chkAndCreateTable(tableName);
                    if(validate){
                    String sqlQuery = "INSERT INTO "+tableName+"(state_ut, dist_cd, tehs_cd, vill_cd, sr_no, area_sown, current_fallow,area_uncultivated, area_irrigated) VALUES (?, ?, ?, ?, ?, ?, ?,?, ?)";
                    TransactionManagerLocal tmgr = null;
                    try{
                    tmgr = new TransactionManagerLocal("Holding Data Entry");
                        PreparedStatement prstmt = tmgr.prepareStatement(sqlQuery);
                        prstmt.setString(1, dobj.getStateUT());
                        prstmt.setString(2, dobj.getDistCd());
                        prstmt.setString(3, dobj.getTehsCd());
                        prstmt.setString(4, dobj.getVillCd());
                        prstmt.setInt(5, dobj.getSrNo());
                        prstmt.setDouble(6, dobj.getAreaSown());
                        prstmt.setDouble(7, dobj.getCurrentFallow());
                        prstmt.setDouble(8, dobj.getAreaUncultivated());
                        prstmt.setDouble(9, dobj.getAreaIrrigated());
                        tmgr.executePreparedDML();
                        tmgr.commit();
                        
                    }   catch (SQLException ex) {
                            Logger.getLogger(FormServerImpl.class.getName()).log(Level.SEVERE, null, ex);
                        }finally{
                    if(tmgr!=null){
                    tmgr.release();
                    }
                    }
                    }
                }
                break;
        }
        return null;
    }

    @Override
    public DO makeDO(InputData data) throws RemoteException, ClientException {
       return null;
    }

    @Override
    public DO[] makeDOArray(InputData data) throws RemoteException, ClientException {
        return  null;
    }

    @Override
    public String ReturnRegnNo(InputData data) throws RemoteException, ClientException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean chkAndCreateTable(String tableName) {
        Boolean valid = Boolean.FALSE;

        String sqlQuery = "SELECT * FROM information_schema.tables WHERE table_name = '"+tableName+"'";
        System.out.println("sqlQuery"+sqlQuery);
        try {
            RowSet rs =  DBUtils.fetchDetachedRowSet(sqlQuery);
            
            if(rs.next()){
                valid = Boolean.TRUE;
                System.out.println(tableName+"  Exist...");
            }else{
                TransactionManagerLocal tmgr = null;
                try {
                    tmgr = new TransactionManagerLocal("chkAndCreateTable");
                    String createTabelQuery = "create table " + tableName + " (state_ut character varying(20) NOT NULL, dist_cd character varying(20) NOT NULL, tehs_cd character varying(20) NOT NULL, vill_cd character varying(20) NOT NULL, sr_no numeric , area_sown numeric(8,2), current_fallow numeric(8,2),area_uncultivated numeric(8,2),area_irrigated numeric(8,2),  constraint "+tableName+"_pkey primary key  (state_ut,dist_cd,tehs_cd,vill_cd,sr_no) )";
                    tmgr.executeDML(createTabelQuery);
                    tmgr.commit();
                    valid = Boolean.TRUE;

                } catch (Exception ex1) {
                    System.out.println("XXXXXXXXXXXXXYYYYYYYYYYYYY");
                    //Logger.getLogger(FormServerImpl.class.getName()).log(Level.SEVERE, null, ex1);
                    System.out.println( ex1.getMessage());
                } finally {
                    if (tmgr != null) {
                        try {
                            tmgr.release();
                        } catch (ClientException ex1) {
                            Logger.getLogger(FormServerImpl.class.getName()).log(Level.SEVERE, null, ex1);
                        }
                    }
                }

            valid = Boolean.TRUE;
            }
            
        } catch (SQLException ex) {
            System.out.println("Ambrish....");
            System.out.println(ex.getMessage());
        }

        return valid;

    }

}
