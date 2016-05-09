package com.tesco.main;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tesco.main.Main;

public class TestMain {
    @Test
    public void testMain() {

        String outPut = Main.test();
        assertEquals("Passed", "Hello world", "Hello world");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
