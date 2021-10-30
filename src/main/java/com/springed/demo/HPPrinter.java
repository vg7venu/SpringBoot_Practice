package com.springed.demo;

import org.springframework.stereotype.Component;

@Component
public class HPPrinter implements MainPrinter {
    public void print(String content){
        System.out.println(content+"This content is printed by HPPrinter");
    }
}
