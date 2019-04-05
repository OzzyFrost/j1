package lesson7.dogs;

public class MainClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tuzik");
        Dog dog2 = new Dog("Bobik");

        Ball ball = new Ball("Red");
        Ball ball2 = new Ball("Green");

        dog1.play(ball);
        dog1.stop();
        dog2.play(ball);
        dog2.play(ball2);
    }
}
