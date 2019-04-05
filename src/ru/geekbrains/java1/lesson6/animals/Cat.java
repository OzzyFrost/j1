package ru.geekbrains.java1.lesson6.animals;

public class Cat extends Animal {
    int liveCount;

    public Cat(String name, String color, int age,int liveCount) {
        super(name, color, age);
        this.liveCount = liveCount;

    }

    @Override
    public void voice() {
        System.out.println("MiaW!!!");
    }

    public void findMouse(){
        System.out.println(name + " охотится...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "liveCount=" + liveCount +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
