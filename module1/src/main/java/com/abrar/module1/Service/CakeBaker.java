package com.abrar.module1.Service;

import com.abrar.module1.Infc.Frosting;
import com.abrar.module1.Infc.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
    private Frosting frosting;
    private Syrup syrup;

    public CakeBaker(@Qualifier("Choco") Frosting frosting,@Qualifier("Stb") Syrup syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }
    public void bakeCake(){

        System.out.println("Your cake is baked with "+frosting.getFrosting()+" and "+syrup.getSyrup());
    }
}
