package com.abrar.module1.Impl;

import com.abrar.module1.Infc.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Stb")
public class StrawberryS implements Syrup {
    @Override
    public String getSyrup() {
        return "Strawberry Syrup";
    }
}
