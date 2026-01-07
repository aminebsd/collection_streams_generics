package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagementApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        // Adding product
        products.add(new Product(1,"milk",3.5));
        products.add(new Product(2,"choclate",7.0));
        products.add(new Product(3,"bread",1.5));
        products.add(new Product(4,"chicken",20.0));
        products.add(new Product(5,"potato",3.5));
        products.add(new Product(6,"tomato",5.5));

        // display product list
        System.out.println(" products list : ");
        System.out.println(products);

        // Delete a product by index.
        System.out.println("product list after removing product with index 2 : ");
        products.remove(2);
        System.out.println(products);

        // Modify a product by index.
        System.out.println("product list after modifying product with index 4 : ");
        products.set(4, new Product(7,"water",6.5));
        System.out.println(products);

        // Search for a product whose name is typed by the user.
        System.out.println("Enter Product name " );
        String product_name = input.nextLine();

        boolean ifexist = products.stream()
                .anyMatch(p -> p.getName().equals(product_name.trim().toLowerCase()));
        if (ifexist) {
            System.out.println(product_name + " found ");
        }
        else {
            System.out.println(product_name + " not found ");
        }





    }

}