package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashSet<String> groupA = new HashSet<>();
        HashSet<String> groupB = new HashSet<>();


        // Add student names to each HashSet.
        groupA.add("amine");
        groupA.add("yassine");
        groupA.add("adil");
        groupA.add("rayane");

        groupB.add("hassane");
        groupB.add("karime");
        groupB.add("rayane");
        groupB.add("ismail");

        // Display the intersection of the two HashSets.
        Set<String> intersection = groupA.stream()
                .filter(groupB::contains)
                .collect(Collectors.toSet());

        System.out.println("Intersection: " + intersection);



        // Display the union of the two HashSets.

        HashSet<String> union = new HashSet<>();
        union.addAll(groupA);
        union.addAll(groupB);
        System.out.println("Union: " + union);


    }
}