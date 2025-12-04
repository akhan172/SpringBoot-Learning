package com.abrar.module1.Impl;

import com.abrar.module1.Infc.Syrup;
import org.springframework.stereotype.Component;

@Component
public class ChocoS implements Syrup {
    @Override
    public String getSyrup() {
        return "Chocolate Syrup";
    }
}
