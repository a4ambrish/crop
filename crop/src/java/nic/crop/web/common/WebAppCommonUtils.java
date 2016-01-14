package nic.crop.web.common;

import common.context.ClientContext;
import java.io.File;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletContext;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class WebAppCommonUtils {

    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32
            // chars.
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String generateRandomNumber() {
        String str1 = "thequickbrownfoxjumpsoverthelazydog" + "0123456789THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG";
        StringBuilder sb = new StringBuilder(5);
        java.util.Random r = new java.util.Random();
        for (int j = 0; j < 5; j++) {
            sb.append(str1.charAt(r.nextInt(str1.length())));
        }
        String rand = sb.toString();
        return rand;
    }

    public static String randomString(int n) {
        String str1 = "0123456789";
        StringBuilder sb = new StringBuilder(n);
        java.util.Random r = new java.util.Random();
        for (int j = 0; j < n; j++) {
            sb.append(str1.charAt(r.nextInt(str1.length())));
        }
        String rand = sb.toString();
        return rand;
    }

    public static void disableAll(List<UIComponent> components, boolean disable) {

        for (UIComponent component : components) {

            if (component instanceof HtmlInputText) {
                ((HtmlInputText) component).setReadonly(disable);
            }

            if (component instanceof HtmlSelectOneMenu) {
                ((HtmlSelectOneMenu) component).setReadonly(disable);
                ((HtmlSelectOneMenu) component).setDisabled(disable);
            }

            if (component instanceof HtmlSelectBooleanCheckbox) {
                ((HtmlSelectBooleanCheckbox) component).setReadonly(disable);
                ((HtmlSelectBooleanCheckbox) component).setDisabled(disable);
            }
            if (component instanceof HtmlInputTextarea) {
                ((HtmlInputTextarea) component).setReadonly(disable);
            }

            disableAll(component.getChildren(), disable);
        }
    }

    public static String getUserId() {
        Object obj = JSFUtils.getFromSession(WebAppConstants.INPUT_OBJECT);
        if (obj != null) {

            return ((ClientContext) obj).getUserID();

        }
        return null;
    }

    public static HashMap<String, String> getBankDataInMap(String encdata) {

        HashMap<String, String> map = new HashMap<String, String>();

        String[] data = encdata.split("\\|");
        for (int i = 0; i < data.length; i++) {
            String[] keyValuePair = data[i].split("=");
            map.put(keyValuePair[0], keyValuePair[1]);
        }
        return map;

    }

    public static void downloadPaymentRcpt(HashMap<String, Object> hm) {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext()
                .getContext();
        InputStream inputStream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/jrxml" + File.separator + "payment_rcpt.jrxml");
        byte[] pdfByteArray = null;
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hm, new JREmptyDataSource());
            pdfByteArray = JasperExportManager.exportReportToPdf(jasperPrint);
            System.out.println(pdfByteArray.length);
            FacesContext fc = FacesContext.getCurrentInstance();
            ExternalContext ec = fc.getExternalContext();
            ec.responseReset();
            ec.setResponseContentType("application/pdf");
            ec.setResponseContentLength(pdfByteArray.length);
            ec.setResponseHeader("Content-Disposition", "attachment; filename=PayRcpt" + hm.get("CASE_REF_NO") + ".pdf");
            ec.getResponseOutputStream().write(pdfByteArray, 0, pdfByteArray.length);
            fc.responseComplete();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
