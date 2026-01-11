package org.example;

public class Application {

    public static void main(String[] args) {

        // testing with Integer
        GenericStorage<Integer> intStore = new GenericStorage<>();
        intStore.addElement(10);
        intStore.addElement(20);

        System.out.println("Integer: " + intStore.getElement(0));
        intStore.removeElement(1);
        System.out.println("Size: " + intStore.getSize());

        // testing with Strings
        GenericStorage<String> strStore = new GenericStorage<>();
        strStore.addElement("Java");
        strStore.addElement("Python");

        System.out.println("String: " + strStore.getElement(1));

        // testing with Dounbles
        GenericStorage<Double> dblStore = new GenericStorage<>();
        dblStore.addElement(2.5);
        dblStore.addElement(4.8);

        System.out.println("Double: " + dblStore.getElement(0));
    }
}
