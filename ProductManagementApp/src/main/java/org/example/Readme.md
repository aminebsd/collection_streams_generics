# **Collections & Streams — Product Management Application**

##  **Topic Overview**

We want to create a simple application to manipulate a list of product-type objects.
1. Create a Product class containing the attributes: id(long), name(String), price(double);
2. Create a class called ProductManagementApp that will contain a main method (main);
3. Inside the main method, create an ArrayList, then:
   • Add products.
   • Delete a product by index.
   • Display the list of products.
   • Modify a product by index.
   • Search for a product whose name is typed by the user.

---

##  **Key Concepts**

- **Collections Framework**
    - `List` interface
    - `ArrayList` implementation
- **Object-Oriented Programming**
    - Classes & objects
    - Encapsulation of product data
- **Streams API**
    - `stream()`
    - `anyMatch()`
- **Basic operations**
    - Add, Remove, Update, Display, Search

---


### Features implemented:
- Add products
- Delete a product by index
- Display all products
- Modify a product by index
- Search for a product by name using Streams

---

##  **Code Explanation**

### 1. Creating the Product List and Procuct class

```java
public class Product {

    long id ;
    String name ;
    double price ;

    public Product(long id, String name, double price) {
        this.id = id ;
        this.name = name;
        this.price = price;
    }
}
```
```java
List<Product> products = new ArrayList<>();
```

An `ArrayList` is used to store multiple `Product` objects.

---

### 2. Adding Products

```java
products.add(new Product(1,"milk",3.5));
products.add(new Product(2,"choclate",7.0));
...
```

Products are added manually to initialize the list.

---

###  3. Displaying Products

```java
System.out.println(products);
```

Prints the entire list of products.

---

### 4. Deleting a Product by Index

```java
products.remove(2);
```

Removes the product located at index **2**.

---

### 5. Modifying a Product by Index

```java
products.set(4, new Product(7,"water",6.5));
```

Replaces the product at index **4** with a new product.

---

### 6. Searching Using Streams

```java
boolean ifexist = products.stream()
    .anyMatch(p -> p.getName().equals(product_name.trim().toLowerCase()));
if (ifexist) {
    System.out.println(product_name + " found ");
}
else {
    System.out.println(product_name + " not found ");
}
```

The **Streams API** checks if any product matches the name entered by the user.

---

##  **Conclusion**

This project illustrates how Java Collections and Streams can be combined to build clean, efficient, and readable applications.  
It also demonstrates real-world list manipulation with minimal code.
