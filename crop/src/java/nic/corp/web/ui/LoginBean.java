package nic.corp.web.ui;

import common.ClientException;
import common.ModuleServer;
import common.context.ClientContext;
import common.context.UserAuthenticationException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import nic.crop.web.common.JSFUtils;
import nic.crop.web.common.WebAppCommonUtils;
import nic.crop.web.common.WebAppConstants;
import nic.java.util.CommonUtils;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // UI Components
    String loginId;
    String password;
    String emailId;
    String mobileNo;
    String fullName;
    String random;
    private String randomCopy;

    public void setRandom(String random) {
        this.random = random;
    }

    public String getRandom() {
        return random;
    }

    public String loginAttempt() throws IOException {
        String result = "";
        ClientContext ctx = null;
        UserAuthenticationException uae = null;
        try {
            ctx = ModuleServer.authServer().authenticateUser(loginId, password, randomCopy, null);

        } catch (UserAuthenticationException ce) {
            uae = ce;
        } catch (ClientException ce) {
        }

        if (ctx != null && ctx.getActiveInd()) {
            String sessionId = ((HttpSession) JSFUtils.getSession()).getId();
            ctx.setSessionID(sessionId);
            JSFUtils.storeOnSession(WebAppConstants.INPUT_OBJECT, ctx);
            System.out.println("ctx  " + ctx);
            result = "success";

        } else {
            if (ctx != null && !ctx.getActiveInd()) {
                JSFUtils.addFacesWarningMessage("User is deactivated");
            } else {
                if (uae != null) {
                    JSFUtils.addFacesWarningMessage(uae.getMessage());
                } else {
                    JSFUtils.addFacesWarningMessage("Incorrect Username and Passowrd");
                }
            }
            result = "notmatch";
        }
        return result;
    }

    public String createNewAccount() {
        String result = "newaccount";
        System.out.println("redirecting to " + result);

        return result;

    }

    @PostConstruct
    public void construct() {
        System.out.println("construct " + ((HttpSession) JSFUtils.getSession()).getId());
        random = WebAppCommonUtils.generateRandomNumber();
        randomCopy = random;

    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
