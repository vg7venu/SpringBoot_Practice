package com.springed.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("epson")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EpsonPrinter implements MainPrinter {
    public void print(String content){
        System.out.println(content+"This content is printed by EpsonPrinter");
    }
}
