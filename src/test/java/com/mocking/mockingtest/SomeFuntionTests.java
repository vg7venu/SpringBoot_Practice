package com.mocking.mockingtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeFuntionTests {

    @Mock
    DataService mockDataService;

    @InjectMocks
    SomeFuntion someFuntion;

    @Test
    void testFindGreatest() {
        // DataService mockDataService = mock(DataService.class);
        // when(mockDataService.retrieveAllData()).thenReturn(new int[] { 1, 7, 3 });
        // SomeFuntion someFuntion = new SomeFuntion(mockDataService);
        // int result = someFuntion.findGreatest();

        when(mockDataService.smalldata()).thenReturn(new int[] { 5, 7, 1, 3, 5 });
        int res = someFuntion.findSmallest();
        // SomeFuntion someFuntion = new SomeFuntion(new DataServiceStub());
        // int result = someFuntion.findGreatest();
        assertEquals(res, 1);
    }
}

// import com.mocking.mockingtest.DataService;

// class DataServiceStub implements DataService {

// @Override
// public int[] retrieveAllData() {
// // TODO Auto-generated method stub
// return new int[] { 1, 7, 5, 6 };
// }

// }