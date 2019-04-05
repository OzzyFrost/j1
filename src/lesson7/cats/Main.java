package lesson7.cats;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska");

        Plate plate1 = new Plate(100);
        System.out.println(plate1);
        Plate plate2 = new Plate(100);
        System.out.println(plate2);


        cat1.eat(plate1);
        cat1.eat(plate2);
        System.out.println(plate1);
        System.out.println(plate2);

        Dog dog = new Dog("Tuzik");
        dog.voice(cat1);


    }
}
