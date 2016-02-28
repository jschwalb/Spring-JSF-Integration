package de.johannesschwalb.evaluation.springjsf.beans;

import de.johannesschwalb.evaluation.springjsf.services.SpringService;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Scope(scopeName = "request")
public class RequestBean {

    @Inject
    private SpringService service;

    private String message;

    @PostConstruct
    public void init() {
        message = service.generateMessage();
    }

    public String getHello() {
        return "Hello from RequestBean!";
    }

    public String getMessage() {
        return message;
    }

}
