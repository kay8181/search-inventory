package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("Id: %d | %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }

    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        Product p1 = new Product(2222,"Katjes Gummies", 8.99);
        Product p2 = new Product(3333,"iPhone Case", 15.99);
        Product p3 = new Product(4444,"Pink Keyboard",49.99);
        Product p4 = new Product(5555,"Mnemosyne Notebook", 15.99);
        Product p5 = new Product(7777,"Sony Headphones", 150.99);

        inventory.add(p1);
        inventory.add(p2);
        inventory.add(p3);
        inventory.add(p4);
        inventory.add(p5);


        return inventory;
    }

}