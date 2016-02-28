package de.johannesschwalb.evaluation.springjsf.services;

import org.springframework.stereotype.Service;

import javax.inject.Named;
import java.util.Random;

/**
 * Created by LG P310 on 27.02.2016.
 */
@Service
public class BaseService {

    public String getRandomNumber() {
        return Long.toString(new Random().nextLong(), 32);
    }

}
