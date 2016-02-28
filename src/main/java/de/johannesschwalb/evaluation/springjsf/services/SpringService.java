package de.johannesschwalb.evaluation.springjsf.services;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by LG P310 on 27.02.2016.
 */
@Named
public class SpringService {

    @Inject
    private BaseService baseService;

    public String generateMessage() {
        return "This is a Message... " + baseService.getRandomNumber();
    }

}
