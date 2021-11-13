package com.springed.demopackage.propertiesapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class PropertiesPrint {

    @Value("${dummy.url}")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printTheUrl() {
        System.out.println("This is the url " + url);
    }

}
