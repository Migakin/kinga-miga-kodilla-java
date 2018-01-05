package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void bigmacTest(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("regular")
                .sauce("standard")
                .burgers(2)
                .ingrediends("onion")
                .ingrediends("pickle")
                .ingrediends("lettuce")
                .build();
        System.out.println(bigmac);
    }
}
