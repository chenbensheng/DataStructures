package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Y {

    @Autowired
    Z z;

    public Y() {
        System.out.println("init y");
    }
}
