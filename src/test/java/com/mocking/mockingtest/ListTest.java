package com.mocking.mockingtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ListTest {
    @Mock
    List list;

    @Test
    public void testList() {
        when(list.size()).thenReturn(10);
        assertEquals(list.size(), 10);
    }

    @Test
    public void testMultipleList() {
        when(list.get(1)).thenReturn("Zack Snyder").thenReturn("Harry Potter");
        assertEquals(list.get(1), "Zack Snyder");
        assertEquals(list.get(1), "Harry Potter");
    }
}
