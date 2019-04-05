package ru.geekbrains.java1.lesson6;

import ru.geekbrains.java1.lesson6.animals.*;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "white", 2, 9);
        cat.jump();
        cat.sleep();
        cat.eat();
        cat.voice();
        cat.findMouse();
        Dog dog = new Dog("Tuzik", "white", 5);
        dog.jump();
        dog.sleep();
        dog.eat();
        dog.voice();
        dog.voice(7);
        Cow cow = new Cow("Zorka", "red", 5);
        cow.voice();

        Animal animal = new Cat("Murzik", "white", 2, 9);
        animal.jump();
        ((Cat) animal).findMouse();
        animal.voice();

        Animal[] animals = {new Cat("Murka", "white", 2, 9),
                new Dog("Vulkan", "white", 5),
                new Cow("Zorka", "red", 5),
                new Dog("Tuzik", "white", 5)
        };
//        for (int i = 0; i <animals.length ; i++) {
//            animals[i].voice();
//        }
        for (Animal a:animals) {
            a.voice();
        }

////        Cat cat2 = new Animal();
//        Cat cat3 = new Cat("Murka", "white", 2, 9);
////        (Dog)cat3.voice();
//        System.out.println(cat3 instanceof Animal);

        Object animal1 = new Cat("Murzik", "white", 2, 9);
        ((Animal)animal1).jump();
        ((Cat) animal1).findMouse();
        ((Animal)animal1).voice();
        System.out.println(animal1);

    }

}
