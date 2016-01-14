/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nic.crop.web.common;

import common.ClientException;
import common.dobj.crop.CropMasterDO;
import common.dobj.crop.DistrictMasterDO;
import common.dobj.crop.StateMasterDO;
import common.dobj.crop.TehsilMasterDO;
import common.dobj.crop.VillageMasterDO;
import common.remote.TableServer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import server.remoteimpl.TableServerImpl;

/**
 *
 * @author ambrish
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class MasterDataHandlerBean implements Serializable {

    ArrayList<StateMasterDO> stateList = new ArrayList<StateMasterDO>();
    ArrayList<DistrictMasterDO> districtList = new ArrayList<DistrictMasterDO>();
    ArrayList<TehsilMasterDO> tehsilList = new ArrayList<TehsilMasterDO>();
    ArrayList<VillageMasterDO> villageList = new ArrayList<VillageMasterDO>();
    ArrayList<CropMasterDO> cropList = new ArrayList<CropMasterDO>();

    private TableServer tblServer = new TableServerImpl();

    public MasterDataHandlerBean() {
        try {
            stateList = tblServer.loadStateMasterList();
            districtList = tblServer.loadDistrictMasterList();
            tehsilList = tblServer.loadTehsilMasterList();
            villageList = tblServer.loadVillageMasterList();
            cropList = tblServer.loadCropMasterList();
            System.out.println("--stateList--" + stateList);
        } catch (ClientException ex) {
            Logger.getLogger(MasterDataHandlerBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SelectItem> getStateAsSelectItemList() {
        ArrayList<SelectItem> dataList = new ArrayList<SelectItem>();
        SelectItem item = new SelectItem();
        item.setValue("-1");
        item.setLabel("--Select--");
        dataList.add(item);
        for (int i = 0; i < stateList.size(); i++) {
            SelectItem selectItem = new SelectItem();
            StateMasterDO dobj = stateList.get(i);
            selectItem.setValue(dobj.getStateUT());
            selectItem.setLabel(dobj.getStateName());
            dataList.add(selectItem);
        }
        ///////////

        return dataList;

    }

    public List<SelectItem> getDistrictAsSelectItemList(String stateCd) {
        ArrayList<SelectItem> dataList = new ArrayList<SelectItem>();
        SelectItem item = new SelectItem();
        item.setValue("-1");
        item.setLabel("--Select--");
        dataList.add(item);
        for (int i = 0; i < districtList.size(); i++) {
            SelectItem selectItem = new SelectItem();
            DistrictMasterDO dobj = districtList.get(i);

            if (dobj.getStateUT().equals(stateCd)) {
                selectItem.setValue(dobj.getDistCd());
                selectItem.setLabel(dobj.getDistName());
                dataList.add(selectItem);
            }
        }
        ///////////

        return dataList;

    }

    public List<SelectItem> getTehsilAsSelectItemList(String districtCd) {
        ArrayList<SelectItem> dataList = new ArrayList<SelectItem>();
        SelectItem item = new SelectItem();
        item.setValue("-1");
        item.setLabel("--Select--");
        dataList.add(item);
        for (int i = 0; i < tehsilList.size(); i++) {
            SelectItem selectItem = new SelectItem();
            TehsilMasterDO dobj = tehsilList.get(i);
            if (dobj.getDistCd().equals(districtCd)) {
                selectItem.setValue(dobj.getTehsCd());
                selectItem.setLabel(dobj.getTehsName());
                dataList.add(selectItem);
            }
        }
        return dataList;

    }

    public List<SelectItem> getVillageAsSelectItemList(String tehsilCd) {
        ArrayList<SelectItem> dataList = new ArrayList<SelectItem>();
        SelectItem item = new SelectItem();
        item.setValue("-1");
        item.setLabel("--Select--");
        dataList.add(item);
        for (int i = 0; i < villageList.size(); i++) {
            SelectItem selectItem = new SelectItem();
            VillageMasterDO dobj = villageList.get(i);
            if (dobj.getTehsCd().equals(tehsilCd)) {
                selectItem.setValue(dobj.getVillageCd());
                selectItem.setLabel(dobj.getVillageName());
                dataList.add(selectItem);
            }
        }
        return dataList;

    }

    public List<SelectItem> getCropAsSelectItemList() {
        ArrayList<SelectItem> dataList = new ArrayList<SelectItem>();
        SelectItem item = new SelectItem();
        item.setValue("-1");
        item.setLabel("--Select--");
        dataList.add(item);
        for (int i = 0; i < cropList.size(); i++) {
            SelectItem selectItem = new SelectItem();
            CropMasterDO dobj = cropList.get(i);

            selectItem.setValue(dobj.getCropCd());
            selectItem.setLabel(dobj.getCropName());
            dataList.add(selectItem);

        }
        return dataList;

    }

}
