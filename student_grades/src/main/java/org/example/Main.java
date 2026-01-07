package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap<String,Double> student_grades = new HashMap<>();

        // Insert student grades.
        System.out.println(" student grades ");
        student_grades.put("amine" , 16.0);
        student_grades.put("ismail" , 15.0);
        student_grades.put("yassine " , 14.0);

        System.out.println(student_grades);

        // Increase a student's grade.
        System.out.println("");
        System.out.println(" student grades after increasing");
        student_grades.put("amine", 17.0);
        System.out.println(student_grades);

        // Delete a student's grade.
        System.out.println("");
        System.out.println(" student grades after deleting");
        student_grades.remove("ismail");
        System.out.println(student_grades);

        // Display the size of the map.
        System.out.println("");
        System.out.println("map size ");
        System.out.println(student_grades.size());

        // Display the average, maximum, and minimum grades.
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


        // Check if there is a grade equal to 20.

        student_grades.put("amine", 20.0);

        boolean ifequal20 = student_grades.values().stream()
                .anyMatch(g -> g ==20.0);

        if(ifequal20){
            System.out.println("there is a grade equal to 20");
        }
        else {
            System.out.println("no grade equal to 20");
        }


        // display the list using the forEach loop with the lambda expression.
        student_grades.forEach((name, grade) ->
                System.out.println(name + " : " + grade)
        );




    }
}