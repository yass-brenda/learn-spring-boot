package com.example.demo;

import com.example.demo.paquetito.HolaMundo;
import org.junit.jupiter.api.Test;

import org.junit.Assert;


public class HolaMundoTest {
    @Test
    public void StringHello(){
        HolaMundo holaMundo = new HolaMundo();
        Assert.assertEquals("Hello", holaMundo.Hello());
    }
}
