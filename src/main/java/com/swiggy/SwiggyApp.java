package com.swiggy;

import java.util.*;

public class SwiggyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Food> menu = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        menu.add(new Food(1, "Chicken Biryani", 250));
        menu.add(new Food(2, "Veg Fried Rice", 150));
        menu.add(new Food(3, "Pizza", 300));
        menu.add(new Food(4, "Burger", 120));

        int choice;

        do {
            System.out.println("\n===== Swiggy Menu =====");
            for (Food food : menu) {
                food.display();
            }

            System.out.println("Enter Food ID (0 to Exit): ");
            choice = sc.nextInt();

            if (choice == 0) break;

            Food selected = null;
            for (Food food : menu) {
                if (food.getId() == choice) {
                    selected = food;
                    break;
                }
            }

            if (selected != null) {
                System.out.println("Enter Quantity: ");
                int qty = sc.nextInt();
                orders.add(new Order(selected, qty));
                System.out.println("Added to Cart!");
            } else {
                System.out.println("Invalid ID!");
            }

        } while (true);

        double total = 0;
        System.out.println("\n===== Order Summary =====");

        for (Order order : orders) {
            order.displayOrder();
            total += order.calculateTotal();
        }

        System.out.println("Total Bill: ₹" + total);
        System.out.println("Thank You!");

        sc.close();
    }
}
