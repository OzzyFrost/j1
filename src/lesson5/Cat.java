package lesson5;

public class Cat {
    //    private default(package) protected public
    private String name;
    private String color;
    private int age;

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
        color = "White";
        age = 0;
    }

    public void info() {
        System.out.println("Cat name: " + name + " color: " + color + " age " + age);
    }

    public void jump() {
        System.out.println("Кот " + name + " прыгнул!");
    }

    public void sleep() {
        System.out.println("Кот " + name + " уснул...");
    }

    public void eat() {
        System.out.println("Кот кушает ");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не моежт быть отрицательным!");
        } else {
            this.age = age;
        }
    }
}
