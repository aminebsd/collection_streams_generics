# **HashSet Operations in Java: Intersection and Union**

## Key Concepts
- **HashSet**: A collection in Java that stores unique elements, with no guaranteed order.
- **Intersection**: A set containing elements that exist in both sets.
- **Union**: A set containing all unique elements from both sets.
- **Streams API**: Used to filter and collect elements efficiently.

## Topic Explanation
This Java program demonstrates how to work with **two HashSets** representing two groups of students, `groupA` and `groupB`. The program performs the following operations:

1. **Add elements**: Student names are added to `groupA` and `groupB`.
2. **Intersection**: Finds the students present in **both groups** using the `stream()` and `filter()` methods.
3. **Union**: Combines both sets into one, ensuring **all unique student names** are included.

This example is useful for understanding basic **set operations** in Java and for scenarios where you need to manage unique elements or perform group-based queries.

## Code Example

### 1. Creating the HashSet

```java
HashSet<String> groupA = new HashSet<>();
HashSet<String> groupB = new HashSet<>();
```

### 2. Adding elements to the Set

```java
groupA.add("amine");
groupA.add("rayane");
...

groupB.add("hassane");
groupB.add("rayane");
...

```
### 3. Display the intersection between tow HashSets.
```java

Set<String> intersection = groupA.stream()
                    .filter(groupB::contains)
                    .collect(Collectors.toSet());

System.out.println("Intersection: " + intersection);
```

```terminaloutput
Intersection: [rayane]
```

### 4. Display the Union between tow HashSets.
```java

HashSet<String> union = new HashSet<>();
union.addAll(groupA);
union.addAll(groupB);
System.out.println("Union: " + union);
```

```terminaloutput
Union: [hassane, rayane, amine]
```

