package com.springboot.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    public String retrieveSomething() {
        return "From Dao2";
    }
}
