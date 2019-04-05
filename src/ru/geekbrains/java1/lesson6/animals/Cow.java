package ru.geekbrains.java1.lesson6.animals;

import ru.geekbrains.java1.lesson6.animals.Animal;

public class Cow extends Animal {
    public Cow(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Myy...");
    }
}
