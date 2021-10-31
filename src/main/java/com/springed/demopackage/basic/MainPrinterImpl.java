package com.springed.demopackage.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainPrinterImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("epson")
    private MainPrinter mainPrinter;

    public void execute() {
        System.out.println("\n" + mainPrinter);
        mainPrinter.print("Hai, ");
    }

    @PostConstruct
    public void PostConstruct() {
        logger.info("PostConstruct Dey");
    }

    @PreDestroy
    public void PreConstruct() {
        logger.info("Dey PreConstruct");
    }
}
