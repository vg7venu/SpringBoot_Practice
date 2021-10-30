package com.springed.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
public class EpsonPrinter implements MainPrinter {
    public void print(String content){
        System.out.println(content+"This content is printed by EpsonPrinter");
    }
}
