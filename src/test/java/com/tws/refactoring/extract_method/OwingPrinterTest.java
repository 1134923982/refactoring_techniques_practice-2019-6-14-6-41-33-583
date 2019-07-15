package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {

        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
//        System.out.print("hello");
//        assertEquals("hello", outContent.toString());
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(10));
        orders.add(new Order(20));
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printOwing("apple",orders);
        //System.out.print("hello");
        assertEquals("*****************************\r\n" +
                "****** Customer totals ******\r\n" +
                "*****************************\r\n" +
                "name: apple\r\n" +
                "amount: 30.0\r\n", outContent.toString());

    }
}