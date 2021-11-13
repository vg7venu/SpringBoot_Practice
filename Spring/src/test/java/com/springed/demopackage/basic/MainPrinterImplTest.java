package com.springed.demopackage.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.springed.demopackage.BasicDemoApplication;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = BasicDemoApplication.class)
public class MainPrinterImplTest {

    @Autowired
    MainPrinterImpl mainPrinterImpl;

    @Test
    void testExecute() {
        int a = mainPrinterImpl.execute();
        assertEquals(2, a);
    }
}
