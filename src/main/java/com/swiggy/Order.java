package com.swiggy;

public class Order {

    private Food food;
    private int quantity;

    public Order(Food food, int quantity) {
        this.food = food;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return food.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println(food.getName() + " x " + quantity +
                " = ₹" + calculateTotal());
    }
}
