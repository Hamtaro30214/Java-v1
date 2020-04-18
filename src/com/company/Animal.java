package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    File pic;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        if (species == "Dog") {
            weight = 10.0;
        } else if (species == "Lion") {
            weight = 180.0;
        } else {
            weight = 1.0;
        }

    }

    void feed() {
        if (weight >= 0) {
            System.out.println("Zbyt mala waga");
        } else {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        }


    }

    void takeForAWake() {
        if (weight <= 0.0) {
            System.out.println("Martwy zwierzak");
        } else if (weight <= 1.0) {
            System.out.println("Zwierzak jest zbyt głodny aby wyjść na spacer");
            weight -= 0.1;
        } else {
            System.out.println("Udany spacer: " + weight);
            weight -= 0.1;
        }
    }

}
