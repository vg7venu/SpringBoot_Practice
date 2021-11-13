package com.springed.demopackage.cdi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CDIImpTest {

    @Mock
    CDIDao cdiDao;

    @InjectMocks
    CDIImp cdiImp2;

    @Test
    void testFindGreatest() {
        // int a = cdiImp.findGreatest();
        when(cdiDao.getData()).thenReturn(11);
        int a = cdiImp2.findGreatest();
        assertEquals(a, 11);
    }
}
