/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nic.corp.web.ui.client;

import common.ClientException;
import common.FormData;
import common.ModuleServer;
import common.OperationIds;
import common.ServiceIds;
import common.context.ClientContext;
import common.dobj.crop.CropDataDO;
import common.dobj.crop.HoldingDataDO;
import common.remote.FormServer;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import nic.crop.web.common.JSFUtils;
import nic.crop.web.common.MasterDataHandlerBean;

/**
 *
 * @author ambrish
 */
@ManagedBean
@ViewScoped
public class CropDataBean implements Serializable {

    private MasterDataHandlerBean masterDataHandlerBean = null;
    private List<SelectItem> stateList = null;
    private List<SelectItem> districtList = null;
    private List<SelectItem> tehsilList = null;
    private List<SelectItem> villageList = null;
    private List<SelectItem> cropList = null;
    private String stateCd;
    private String districtCd;
    private String tehsilCd;
    private String villageCd;
    private String cropCd;

    private CropDataDO cropData = new CropDataDO();

    public CropDataBean() {

        masterDataHandlerBean = (MasterDataHandlerBean) JSFUtils.getFromApplication("masterDataHandlerBean");
        stateList = masterDataHandlerBean.getStateAsSelectItemList();
        cropList = masterDataHandlerBean.getCropAsSelectItemList();

    }

    public void save() {
        System.out.println("saving start");
        try {
            FormServer formServer = ModuleServer.formServer();
            ClientContext ctx = null;
            int serviceId = ServiceIds.DATA_ENTRY;
            int operaionId = OperationIds.P_CROP_DATA;

            cropData.setStateUT(stateCd);
            cropData.setDistCd(districtCd);
            cropData.setTehsCd(tehsilCd);
            cropData.setVillCd(villageCd);
            cropData.setCropCd(cropCd);

            FormData formData = new FormData(ctx, cropData, serviceId, operaionId);
            Object ret = formServer.process(formData);
            if (ret != null) {
                int returnVal = (int) ret;
                System.out.println("returnVal  --> " + ret);
            } else {
                System.out.println("formprocess retrun null");
            }
            JSFUtils.addFacesInfoMessage("Data Saved Successfully.");
            cropData = new CropDataDO();

        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
        } catch (ClientException ex) {
            System.out.println(ex.getMessage());
            JSFUtils.addFacesWarningMessage(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JSFUtils.addFacesErrorMessage("Technial Problem - " + ex.getMessage());
        }

    }

    public void reset() {
        CropDataDO cropData = new CropDataDO();
        stateCd = "-1";
        districtCd = "-1";
        tehsilCd = "-1";
        villageCd = "-1";
        cropCd = "-1";
        System.out.println("form reset success");
    }

    public List<SelectItem> updateDistrictList() {
        districtList = masterDataHandlerBean.getDistrictAsSelectItemList(stateCd);
        tehsilList = null;
        villageList = null;
        districtCd = "-1";
        tehsilCd = "-1";
        villageCd = "-1";
        return districtList;
    }

    public List<SelectItem> updateTehsilList() {
        tehsilList = masterDataHandlerBean.getTehsilAsSelectItemList(districtCd);
        villageList = null;
        tehsilCd = "-1";
        villageCd = "-1";
        return tehsilList;
    }

    public List<SelectItem> updateVillageList() {

        villageList = masterDataHandlerBean.getVillageAsSelectItemList(tehsilCd);
        villageCd = "-1";
        return villageList;
    }

    /**
     * @return the masterDataHandlerBean
     */
    public MasterDataHandlerBean getMasterDataHandlerBean() {
        return masterDataHandlerBean;
    }

    /**
     * @param masterDataHandlerBean the masterDataHandlerBean to set
     */
    public void setMasterDataHandlerBean(MasterDataHandlerBean masterDataHandlerBean) {
        this.masterDataHandlerBean = masterDataHandlerBean;
    }

    /**
     * @return the stateList
     */
    public List<SelectItem> getStateList() {
        return stateList;
    }

    /**
     * @param stateList the stateList to set
     */
    public void setStateList(List<SelectItem> stateList) {
        this.stateList = stateList;
    }

    /**
     * @return the districtList
     */
    public List<SelectItem> getDistrictList() {
        return districtList;
    }

    /**
     * @param districtList the districtList to set
     */
    public void setDistrictList(List<SelectItem> districtList) {
        this.districtList = districtList;
    }

    /**
     * @return the tehsilList
     */
    public List<SelectItem> getTehsilList() {
        return tehsilList;
    }

    /**
     * @param tehsilList the tehsilList to set
     */
    public void setTehsilList(List<SelectItem> tehsilList) {
        this.tehsilList = tehsilList;
    }

    /**
     * @return the villageList
     */
    public List<SelectItem> getVillageList() {
        return villageList;
    }

    /**
     * @param villageList the villageList to set
     */
    public void setVillageList(List<SelectItem> villageList) {
        this.villageList = villageList;
    }

    /**
     * @return the cropList
     */
    public List<SelectItem> getCropList() {
        return cropList;
    }

    /**
     * @param cropList the cropList to set
     */
    public void setCropList(List<SelectItem> cropList) {
        this.cropList = cropList;
    }

    /**
     * @return the stateCd
     */
    public String getStateCd() {
        return stateCd;
    }

    /**
     * @param stateCd the stateCd to set
     */
    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    /**
     * @return the districtCd
     */
    public String getDistrictCd() {
        return districtCd;
    }

    /**
     * @param districtCd the districtCd to set
     */
    public void setDistrictCd(String districtCd) {
        this.districtCd = districtCd;
    }

    /**
     * @return the tehsilCd
     */
    public String getTehsilCd() {
        return tehsilCd;
    }

    /**
     * @param tehsilCd the tehsilCd to set
     */
    public void setTehsilCd(String tehsilCd) {
        this.tehsilCd = tehsilCd;
    }

    /**
     * @return the villageCd
     */
    public String getVillageCd() {
        return villageCd;
    }

    /**
     * @param villageCd the villageCd to set
     */
    public void setVillageCd(String villageCd) {
        this.villageCd = villageCd;
    }

    /**
     * @return the cropCd
     */
    public String getCropCd() {
        return cropCd;
    }

    /**
     * @param cropCd the cropCd to set
     */
    public void setCropCd(String cropCd) {
        this.cropCd = cropCd;
    }

    /**
     * @return the cropData
     */
    public CropDataDO getCropData() {
        return cropData;
    }

    /**
     * @param cropData the cropData to set
     */
    public void setCropData(CropDataDO cropData) {
        this.cropData = cropData;
    }

}
