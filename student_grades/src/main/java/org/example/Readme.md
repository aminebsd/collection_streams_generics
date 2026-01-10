# **HashMap — Student Grades Management**

##  **Topic Overview**

This project demonstrates the use of the **Java HashMap** collection to store and manipulate student grades.  
Each student’s name is used as a **key** and the corresponding grade is stored as a **value**.  
The application performs multiple operations on the map and uses **Streams** and **Lambda expressions** for data processing.

---

##  **Key Concepts**

- **Java Collections Framework**
    - `HashMap`
    - `List`
- **Streams API**
    - `stream()`
    - `map()`
    - `max()`, `min()`, `anyMatch()`
- **Lambda Expressions**
    - `forEach((k, v) -> {...})`
- **Basic Data Operations**
    - Insert, Update, Delete, Search, Statistics

---

##  **Application Description**

The application manages a collection of student grades using a `HashMap<String, Double>`.

### Features Implemented
- Insert student grades
- Increase a student's grade
- Delete a student's grade
- Display the size of the map
- Calculate **average**, **maximum**, and **minimum** grades
- Check if any student has a grade equal to **20**
- Display all entries using **forEach + Lambda expression**

---

##  **Code Explanation**

### 1. Creating the HashMap

```java
HashMap<String, Double> student_grades = new HashMap<>();
```

Creates a map where each student's name is associated with a grade.

---

### 2. Inserting Student Grades

```java
student_grades.put("amine", 16.0);
student_grades.put("ismail", 15.0);
student_grades.put("yassine", 14.0);
```

Adds students and their grades to the map.

---

### 3. Increasing a Student's Grade

```java
student_grades.put("amine", 17.0);
```

Updates the grade of the student **amine**.

---

### 4. Deleting a Student's Grade

```java
student_grades.remove("ismail");
```

Removes the student **ismail** from the map.

---

### 5. Displaying the Size of the Map

```java
student_grades.size();
```

Returns the number of students stored.

---

### 6. Calculating Average, Max, and Min Grades

```java
List<Double> grades = student_grades.entrySet().stream()
    .map(e -> e.getValue())
    .toList();

double somme = 0.0;
for (Double grade : grades) {
somme += grade;
}
System.out.println("average");
System.out.println(somme/grades.size());
System.out.println("max value");
System.out.println(grades.stream().max(Double::compareTo).get());
System.out.println("min value");
System.out.println(grades.stream().min(Double::compareTo).get());
```

Grades are extracted using **Streams**, then statistical values are computed.

---

### 7. Checking if a Grade Equals 20

```java
boolean ifequal20 = student_grades.values().stream()
    .anyMatch(g -> g == 20.0);
if(ifequal20){
    System.out.println("there is a grade equal to 20");
}
else {
    System.out.println("no grade equal to 20");
}
```

Checks whether any student obtained the maximum grade.

---

### 8. Displaying All Students with Lambda

```java
student_grades.forEach((name, grade) ->
    System.out.println(name + " : " + grade)
);
```

Displays all students and their grades using a **Lambda expression**.

---

## **Conclusion**

This project showcases practical usage of `HashMap`, `Streams`, and `Lambda expressions` to manage and analyze data efficiently.  
It highlights how Java collections simplify complex data manipulation in real applications.
