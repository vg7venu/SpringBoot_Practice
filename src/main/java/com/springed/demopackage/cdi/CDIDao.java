package com.springed.demopackage.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CDIDao {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public CDIDao() {
        logger.info("\n\n\n Bean has been created" + "{}", this.getClass());
    }

    public void checking() {
        System.out.println("\n\nChecking funtion \n\n");
    }
}
