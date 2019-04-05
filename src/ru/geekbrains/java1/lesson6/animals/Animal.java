package ru.geekbrains.java1.lesson6.animals;

public class Animal {
    protected String name;
    protected String color;
    protected int age;
    static final int qq = 7;

    public Animal() {

    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void jump() {
        System.out.println(name + " прыгнул");
    }

    public void sleep() {
        System.out.println(name + " уснул...");
    }

    public void eat() {
        System.out.println(name + " кушает");
    }

    public int getAge() {
        return age;
    }

    public void voice(){
        System.out.println("звук какой то....");
    };

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age ;
    }
}
