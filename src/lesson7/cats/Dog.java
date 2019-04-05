package lesson7.cats;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voice(Cat cat){
        System.out.println(name + " Лает на " + cat.getName());
        cat.fear(this);
    }

    public String getName() {
        return name;
    }
}
