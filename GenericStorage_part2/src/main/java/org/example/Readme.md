# II. Generics Part 2 — Product Management Using Generic Interface

---

##  Topic

The objective of this task is to apply **Java Generics** in a real-world scenario by building a simple **Product Management System**.

The system allows the user to manage a collection of products using:
- A generic interface for business operations
- A concrete implementation for products
- A menu-driven console application

The user can:
1. Display all products
2. Search for a product by ID
3. Add a new product
4. Delete a product
5. Exit the program

---

## Key Concepts

- **Generics**: Enable writing flexible and reusable code that works with different data types.
- **Generic Interface (`IMetier<T>`)**: Defines operations independently from the object type.
- **Encapsulation**: Product attributes are protected using private fields and public methods.
- **Collections Framework**: Uses `List` and `ArrayList` to store and manage objects.
- **CRUD Operations**: Create, Read, Delete management of products.
- **Menu-driven Application**: Allows continuous interaction with the user.

---

##  Code Explanation

### 1. Product Class

The `Product` class represents the data model.  
It contains the following attributes:

- `id`
- `name`
- `brand`
- `price`
- `description`
- `stock`

```java
package org.example;

public class Product {

    private long id;
    private String name;
    private String brand;
    private double price;
    private String description;
    private int stock;

    public Product(long id, String name, String brand, double price, String description, int stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    public long getId() { return id; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + brand + " | " + price + " | " + stock;
    }
}


```

This class stores product information and provides access through methods.

---

### 2. IMetier Interface

`IMetier<T>` is a **generic interface** that defines management operations:

- `add(T o)` → add an object
- `getAll()` → return all objects
- `findById(long id)` → find object by ID
- `delete(long id)` → remove object by ID

```java
package org.example;

import java.util.List;

public interface IMetier<T>{

    public void add(T o);
    public List<T> getAll();
    public T findById(long id);
    public void delete(long id);
}

```

The use of generics makes the interface reusable for any entity type.

---

### 3. MetierProduitImpl Class

This class implements `IMetier<Product>` and provides the concrete logic for managing products using an `ArrayList`.

It handles:
- Adding products
- Searching by ID
- Deleting products
- Displaying all products

```java
package org.example;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Product> {

    private List<Product> products = new ArrayList<>();


    public void add(Product p) {
        products.add(p);
    }


    public List<Product> getAll() {
        return products;
    }

    public Product findById(long id) {
        for(Product p : products)
            if(p.getId() == id)
                return p;
        return null;
    }

    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }
}

```

---

### 4.  Application Class

The `Application` class contains the `main` method and displays a menu inside a `while` loop.

The user interacts with the program through numeric choices, allowing full management of the product list.

```java
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

```
### OUTPUT :
##### menu :
```terminaloutput
1. Display Products
2. Search Product by ID
3. Add Product
4. Delete Product
5. Exit
```

##### case 3 : Adding product
```terminaloutput
ID: 101
Name: thinkpad
Brand: lenuvo
Price: 7500
Description: laptop
Stock: 15
---
ID: 102
Name: elitbook
Brand: hp
Price: 8000
Description: laptop
Stock: 20
...
```

##### case 1 : Display all product

```terminaloutput
101 | thinkpad | lenuvo | 7500.0 | 15
102 | elitbook | hp | 8000.0 | 20
```
##### case 2 : searching by ID
````terminaloutput
ID: 101
101 | thinkpad | lenuvo | 7500.0 | 15
---
ID: 101
101 | thinkpad | lenuvo | 7500.0 | 15

````

case 4 : Deleting product
```terminaloutput
// deleting product id=101
4
ID: 101

1. Display Products
2. Search Product by ID
3. Add Product
4. Delete Product
5. Exit

// displaying product list

1
102 | elitbook | hp | 8000.0 | 20
```
---

