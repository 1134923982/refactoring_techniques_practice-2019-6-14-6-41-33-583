package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        double outstanding = calculateOwingAmount(orders);
        print(name,outstanding);
    }

    private double calculateOwingAmount(List<Order> orders) {
        return orders.stream().mapToDouble(Order::getAmount).sum();
    }

    private void print(String name, double outstanding) {
        String format = "*****************************\r\n****** Customer totals ******\r\n*****************************\r\nname: %s\r\namount: %.1f";
        System.out.println(String.format(format,name,outstanding));
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
