package lesson7.cats;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska");

        Plate plate1 = new Plate(25);
        System.out.println(plate1);
        Plate plate2 = new Plate(100);
        System.out.println(plate2);
//
//        cat1.eat(plate1);
//        System.out.println(cat1);
//        cat1.eat(plate2);
//        System.out.println(cat1);
//        System.out.println(plate1);
//        System.out.println(plate2);

        Cat[] cats = {new Cat("Vaska"),
                new Cat("Murka"),
                new Cat("Svetlic") };

        for (Cat c :cats) {
            if(!c.eat(plate1)){
                plate1.addFood(40);
                System.out.println(plate1);
                c.eat(plate1);
            }
        }
        System.out.println(plate1);
        plate1.addFood(40);
        System.out.println(plate1);
    }
}
