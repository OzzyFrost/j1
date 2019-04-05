package ru.geekbrains.java1.lesson6.animals;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Gav Gav!");
    }
    public void voice(int power ) {
        System.out.println("Gav Gav! power "+ power);
    }

}
