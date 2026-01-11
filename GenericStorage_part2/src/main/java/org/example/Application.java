package org.example;

import org.example.MetierProduitImpl;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Display Products");
            System.out.println("2. Search Product by ID");
            System.out.println("3. Add Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            if(choice == 1) {
                metier.getAll().forEach(System.out::println);
            }

            else if(choice == 2) {
                System.out.print("ID: ");
                long id = sc.nextLong();
                System.out.println(metier.findById(id));
            }

            else if(choice == 3) {
                System.out.print("ID: "); long id = sc.nextLong();
                sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Brand: "); String brand = sc.nextLine();
                System.out.print("Price: "); double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Description: "); String desc = sc.nextLine();
                System.out.print("Stock: "); int stock = sc.nextInt();

                metier.add(new Product(id, name, brand, price, desc, stock));
            }

            else if(choice == 4) {
                System.out.print("ID: ");
                metier.delete(sc.nextLong());
            }

            else if(choice == 5) {
                break;
            }
        }
    }
}
