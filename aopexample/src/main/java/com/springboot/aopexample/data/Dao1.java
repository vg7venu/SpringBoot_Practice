package com.springboot.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    public String retrieveSomething() {
        return "From Dao1";
    }
}
