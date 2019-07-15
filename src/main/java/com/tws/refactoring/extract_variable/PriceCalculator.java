package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    double getPrice(int quantity, int itemPrice) {
        int discountNumber = 500;
        double discount = 0.05;
        double shippingCostOver100 = 100.0;
        double shippingUnitPriceProportion = 0.1;
        return calculateBasePrice(quantity, itemPrice) - calculateDiscountPrice(quantity, itemPrice, discount, discountNumber) +
                calculateShippingCost(quantity, itemPrice, shippingUnitPriceProportion, shippingCostOver100);
    }

    int calculateBasePrice(int quantity, int itemPrice) {
        return quantity * itemPrice;
    }

    double calculateDiscountPrice(int quantity, int itemPrice, double discount, int discountNumber) {
        return Math.max(0, quantity - discountNumber) * itemPrice * discount;
    }

    double calculateShippingCost(int quantity, int itemPrice, double shippingUnitPriceProportion, double shippingCostOver100) {
        return Math.min(quantity * itemPrice * shippingUnitPriceProportion, shippingCostOver100);
    }
}
