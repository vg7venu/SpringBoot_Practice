package com.springed.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("epson")
public class EpsonPrinter implements MainPrinter {
    public void print(String content){
        System.out.println(content+"This content is printed by EpsonPrinter");
    }
}
