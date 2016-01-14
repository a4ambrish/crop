package nic.crop.web.common;

import common.context.ClientContext;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.lifecycle.ClientWindow;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Utils for webpages.
 *
 */
public class JSFUtils {

    private static final String NO_RESOURCE_FOUND = "Missing resource: ";

    private static Map<String, SelectItem> selectItems = new HashMap<String, SelectItem>();

    public static void storeOnSession(String key, Object object) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.put(key, object);
    }

    public static Object getFromSession(String key) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        return sessionState.get(key);
    }

    public static void removeFromSession(String key) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.remove(key);
    }

    public static boolean isSessionLive() {
        ClientContext inputObject = (ClientContext) getFromSession(WebAppConstants.INPUT_OBJECT);
        if (inputObject != null && inputObject.getUserID() != null) {
            return true;
        } else {
            return false;
        }

    }

    public static Object getFromApplication(String key) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getApplicationMap();
        return sessionState.get(key);
    }

    public static Object removeFromApplication(String key) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getApplicationMap();
        return sessionState.remove(key);
    }

    public static Object getFromFlashScope(String key) {
        return FacesContext.getCurrentInstance().getExternalContext().getFlash().get(key);
    }

    public static void storeOnFlashScope(String key, Object object) {
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put(key, object);
    }

    public static Object getSession() {
        return FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    public static Object getFromRequest(String key) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map reqMap = ctx.getExternalContext().getRequestMap();
        return reqMap.get(key);
    }

    public static void addFacesErrorMessage(String msg) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, "");
        ctx.addMessage(getRootViewComponentId(), fm);
    }

    public static void addFacesWarningMessage(String msg) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, msg, "");
        ctx.addMessage(getRootViewComponentId(), fm);
    }

    public static void addFacesInfoMessage(String msg) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, "");
        ctx.addMessage(getRootViewComponentId(), fm);
    }

    public static void addFacesErrorMessage(String attrName, String msg) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, attrName, msg);
        ctx.addMessage(getRootViewComponentId(), fm);
    }

    public static String getRootViewId() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        return ctx.getViewRoot().getViewId();
    }

    public static String getRootViewComponentId() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        return ctx.getViewRoot().getId();
    }

    private static ResourceBundle bundle;

    public static ResourceBundle getErrorMessageBundle() {
        if (bundle == null) {
            FacesContext context = FacesContext.getCurrentInstance();
            bundle = context.getApplication().getResourceBundle(context, "labels");
        }
        return bundle;
    }

    public static String getResourceValue(String key) {

        String result = null;
        try {
            result = getErrorMessageBundle().getString(key);
        } catch (MissingResourceException e) {
            result = "???" + key + "??? not found";
        }
        return result;
    }

    public static SelectItem getSelectItem(String value) {
        SelectItem item = selectItems.get(value);
        if (item == null) {
            item = createNewSelectItem(value, value);
            selectItems.put(value, item);
        }
        return item;
    }

    public static SelectItem createNewSelectItem(String label, String value) {
        return new SelectItem(value, label);
    }

    public static HttpServletResponse getResponse() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse) ctx.getExternalContext().getResponse();
        return response;

    }

    public static Object getFromRequestParameterMap(String key) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        return ctx.getExternalContext().getRequestParameterMap().get(key);

    }

    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

    public static void postMessageToFacesContext(FacesMessage.Severity severity, String summary, String detail) {
        postMessage(null, severity, summary, detail);
    }

    public static void postMessage(String componentId, FacesMessage.Severity severity, String summary, String detail) {
        getFacesContext().addMessage(componentId, new FacesMessage(severity, summary, detail));
    }

    public static String generateOTP(int n) {
        String str1 = "123456789";
        StringBuilder sb = new StringBuilder(5);
        java.util.Random r = new java.util.Random();
        for (int j = 0; j < n; j++) {
            sb.append(str1.charAt(r.nextInt(str1.length())));
        }
        String rand = sb.toString();
        return rand;
    }

//	public static void  callOTP(MyOtp myotp) {
//		if (JSFUtils.isSessionLive()) {
//			
//			StackTraceElement[] ste = Thread.currentThread().getStackTrace();
//
//			System.out.println(ste[0].getClassName());
//			System.out.println(ste[0].getFileName());
//			System.out.println(ste[0].getMethodName());
//
//			// if (ste[0].getClassName().compareTo("CaseFilingBean")!=0 &&
//			// ste[0].getMethodName())
//			HashMap<String, String> hmotp = EFilingToolHandler.getMessageService().generateOTP(WebAppConstants.OtpConstants.OTP_LENGTH);
//			Map.Entry mapEntry = (Map.Entry) hmotp.entrySet().iterator().next();
//			String otpid = (String) mapEntry.getKey();
//			String otp = (String) mapEntry.getValue();
//			System.out.println("otp session = " + otp);
//			// message may be loaded from properties
//			String message = "Your One Time password  is " + otp + " for the reference number " + myotp.getRefNumber() + ". OTP-ID "
//					+ otpid + "  This is valid for only 15 mins";
//			if (otp != null && !otp.isEmpty())
//				myotp.setSecretotp(otp);
//			else
//				myotp.setSecretotp("()$@##!");
//
//			myotp.setOtpFailureCount(0);
//			
//			// Please comment the below line for development when testing. Uncomment
//			// for production
//			//EFilingToolHandler.getMessageService().sendOTP( myotp.getMobileNo(), message);
//
//	
//			//String otpId = JSFUtils.sendOTP(myotp.getRefNumber(), myotp.getMobileNo());
//			myotp.setOtpId(otpid);
//			
//			JSFUtils.storeOnFlashScope("OTPFlash", myotp);
//			
//		}
//	}
    public static String getIpPath() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String contextPath = request.getContextPath();
        StringBuffer requestURL = request.getRequestURL();
        String ipPath = requestURL.substring(0, requestURL.indexOf(contextPath)) + contextPath;
        return ipPath;
    }

    public static String getClientWindowID() {
        String id = null;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        ClientWindow clientWindow = externalContext.getClientWindow();
        if (clientWindow != null) {
            id = clientWindow.getId();
        } else {
            System.out.println("Client Window Can not be Determined!!!!");
        }
        return id;
    }

}
