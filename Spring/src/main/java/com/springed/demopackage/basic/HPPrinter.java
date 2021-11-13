package com.springed.demopackage.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("hp")
public class HPPrinter implements MainPrinter {
    public void print(String content) {
        System.out.println(content + "This content is printed by HPPrinter");
    }
}
