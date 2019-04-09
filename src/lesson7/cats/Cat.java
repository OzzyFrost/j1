package lesson7.cats;

public class Cat {
    private String name;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
        satiety = false;
    }

    public boolean eat(Plate plate) {
        if (plate.decreaseFood(10)){
            System.out.println(name + " eat....");
            satiety = true;
            return true;
        }else{
            System.out.println(name + " NO eat");
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public void fear(Dog dog){
        System.out.println(name + " испугалась " + dog.getName());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
