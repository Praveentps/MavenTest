package com.tesco.main;

import static org.junit.Assert.*;

import com.tesco.util.SendMessage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tesco.main.Main;

public class TestMain {
    @Test
    public void testMain() {

        String outPut = SendMessage.test();
        assertEquals("Passed", "Hello world", outPut);
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
