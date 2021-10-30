package com.springed.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainPrinterImpl {
    
    @Autowired
    @Qualifier("epson")
    private MainPrinter mainPrinter;

    public void execute(){
        mainPrinter.print("Hai, ");
    }
}