package nic.corp.web.ui;

import java.util.List;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.component.inputtext.InputText;

@ManagedBean
public class ImagesView {

    private List<String> images;
    InputText t1 = new InputText();

    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 5; i++) {
            images.add(i + ".jpg");
        }
    }

    public List<String> getImages() {
        return images;
    }
}
