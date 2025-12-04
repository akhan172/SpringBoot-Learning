package com.abrar.module1.Impl;

import com.abrar.module1.Infc.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Stb")
public class StrawberryF implements Frosting {
    @Override
    public String getFrosting() {
        return "Strawberry Frosting";
    }
}
