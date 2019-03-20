package lesson1;

public class MainClass {
    //    CTRL + ALT + L
    public static void main(String[] args) {
//
//        int time = 24;
//        if (((time > 7) && (time < 10)) || ((time > 16)&&(time < 22))) {
//            System.out.println("Годится");
//        } else {
//            System.out.println("Дома не буду");
//        }
        int a = 3;
        int b = 4;
        int c = 3;

        if (a < b + c && b < a + c && c < a + b){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }


    public static double disk(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        return d;
    }

    public static void printHelloWorldTwoTimes() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
}
