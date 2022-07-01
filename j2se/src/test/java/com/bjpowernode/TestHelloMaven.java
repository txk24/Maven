package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testAddNumber1() {
        System.out.println("testAddNumber1");
        HelloMaven h = new HelloMaven();
        int res = h.addNumber(10, 20);
        Assert.assertEquals(30, res);
    }

    @Test
    public void testAddNumber2() {
        System.out.println("testAddNumber2");
        HelloMaven h = new HelloMaven();
        int res = h.addNumber(30, 20);
        Assert.assertEquals(50, res);
    }
}
