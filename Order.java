/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuchanh3;

import java.time.LocalDate;

/**
 *
 * @author Tuyet Anh
 */
public class Order {
    private final int orderID;
    private LocalDate orderDate;
    private LineItem[] lineItems;
    private int numItems;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new LineItem[20];
        this.numItems = 0;
    }

    public Order() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addLineItem(Product p, int q) {
        LineItem item = new LineItem(p, q);
        this.lineItems[this.numItems] = item;
        this.numItems++;
    }

    public double calcTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < this.numItems; i++) {
            totalPrice += this.lineItems[i].getSubtotal();
        }
        return totalPrice;
    }

    public double getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class LineItem {
        private Product product;
        private int quantity;

        public LineItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return this.product.getPrice() * this.quantity;
        }
    }
}


 
