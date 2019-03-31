package lesson5;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
//        Cat[] cats = {
//                new Cat("Murka","white",7),
//                new Cat("Снежок","Белый",3),
//                new Cat("Рыжик","Рыжий",5)
//        };

//        String[] names = {"Рыжик","Барсик","Васька","Снежок"};
//        String[] colors = {"Белый","Рыжий","Черный","Серый","трехцветный"};
//
//        Random rand = new Random();
//        Cat[] cats = new Cat[10];
//        for (int i = 0; i < 10; i++) {
//            cats[i] = new Cat(names[rand.nextInt(names.length)],
//                    colors[rand.nextInt(colors.length)],
//                    rand.nextInt(20) );
//            cats[i].info();
//        }


//        cats[0] = new Cat("Murka","white",7);
//        cats[1] = new Cat("Снежок","Белый",3);
//        cats[2] = new Cat("Рыжик","Рыжий",5);

//        for (int i = 0; i < cats.length; i++) {
//            if (cats[i].getAge()>4){
//                System.out.println(cats[i].getName());
//            }
//        }


//        MainClass mainClass = new MainClass();
//        mainClass.printHello();
        Cat cat1 = new Cat("Barsik", "Red", 4);
        Cat cat2 = new Cat("Murzik","black",2);

        cat1 = cat2;
        cat1.info();
        cat2.info();

//
//        Cat.age = 20;
//
//        cat1.info();
//        cat2.info();
//
//        cat1.jump();
//        cat1.sleep();
//        cat2.jump();
//        cat2.sleep();


    }

    public void printHello(){
        System.out.println("Hello");
    }
}
