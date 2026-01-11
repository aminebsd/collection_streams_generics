# II. Generics Part1  : GenericStorage Implementation in Java

---

##  Key Concepts

- **Generics**: Allow classes and methods to operate on different data types while providing type safety.
- **Generic Class**: A class that works with a placeholder type `<T>`.
- **Collections Framework**: Uses `List` and `ArrayList` to store elements dynamically.
- **Type Safety**: Ensures that the same type is used consistently at compile time.

---

## Topic Explanation

This project demonstrates the creation of a **generic class** called `GenericStorage` that can store elements of any type using Java Generics.

The class contains:
- An attribute `elements` of type `List<T>` that stores the elements.
- Several methods that allow adding, removing, retrieving elements, and checking the size of the list.

An `Application` class is used to test the generic class with different data types such as:
- `Integer`
- `String`
- `Double`

The program performs:
- **Addition**
- **Retrieval**
- **Deletion**
- **Verification of list size**

---

##  Code Explanation

### GenericStorage Class

The `GenericStorage<T>` class defines a container that can hold any data type.  
The type `<T>` is specified when creating an object of the class.

| Method | Description |
|------|------------|
`addElement(T o)` | Adds an element to the list |
`removeElement(int index)` | Removes the element at the given index |
`getElement(int index)` | Retrieves the element at the given index |
`getSize()` | Returns the number of stored elements |

The internal list uses `ArrayList` for dynamic storage.

---

### Application Class

The `Application` class tests the `GenericStorage` using three different data types:
- `Integer`
- `String`
- `Double`

For each type, the program:
1. Adds elements.
2. Retrieves elements.
3. Removes elements.
4. Displays the size of the list.

This demonstrates how the same generic class works with multiple data types safely and efficiently.

---

## Code Implementation

### GenericStorage.java

```java
package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {

    private List<T> elements = new ArrayList<>();

    public void addElement(T o) {
        elements.add(o);
    }

    public void removeElement(int index) {
        if(index >= 0 && index < elements.size()) {
            elements.remove(index);
        }
    }

    public T getElement(int index) {
        if(index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }

    public int getSize() {
        return elements.size();
    }
}
```

### Application.java

```java
package org.example;

public class Application {

    public static void main(String[] args) {

        // Testing with Integer
        GenericStorage<Integer> intStore = new GenericStorage<>();
        intStore.addElement(10);
        intStore.addElement(20);

        System.out.println("Integer: " + intStore.getElement(0));
        intStore.removeElement(1);
        System.out.println("Size: " + intStore.getSize());

        // Testing with String
        GenericStorage<String> strStore = new GenericStorage<>();
        strStore.addElement("Java");
        strStore.addElement("Python");

        System.out.println("String: " + strStore.getElement(1));

        // Testing with Double
        GenericStorage<Double> dblStore = new GenericStorage<>();
        dblStore.addElement(2.5);
        dblStore.addElement(4.8);

        System.out.println("Double: " + dblStore.getElement(0));
    }
}

```
### Output
```terminaloutput
Integer: 10
Size: 1
String: Python
Double: 2.5

```
