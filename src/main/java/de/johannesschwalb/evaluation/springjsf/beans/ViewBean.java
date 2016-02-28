package de.johannesschwalb.evaluation.springjsf.beans;

import de.johannesschwalb.evaluation.springjsf.services.SpringService;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@Scope(scopeName = "view")
public class ViewBean implements Serializable {

    @Inject
    private SpringService service;

    private String message;

    @PostConstruct
    public void init() {
        message = service.generateMessage();
    }

    public String getHello() {
        return "Hello from ViewBean!";
    }

    public String getMessage() {
        return message;
    }

}
