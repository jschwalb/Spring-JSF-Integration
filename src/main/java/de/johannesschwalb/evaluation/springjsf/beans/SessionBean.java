package de.johannesschwalb.evaluation.springjsf.beans;

import de.johannesschwalb.evaluation.springjsf.services.SpringService;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Scope(scopeName = "session")
public class SessionBean {

    @Inject
    private SpringService service;

    public String getHello() {
        return "Hello from SessionBean!";
    }

    private String message;

    @PostConstruct
    public void init() {
        message = service.generateMessage();
    }

    public String getMessage() {
        return message;
    }

}
