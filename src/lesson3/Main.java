package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
////        int b = sc.nextInt();
//        System.out.println("a= " + a+" b= " + b );
//        double d = sc.nextDouble();
//        System.out.println(Math.pow(d,2));
//        System.out.println("Как тебя зовут?");
//        String name = sc.nextLine();
//        System.out.printf("Привет %s!!!",name);
//        System.out.printf("%s какой твой любимый цвет?", name);
//        String color = sc.nextLine();
//        System.out.printf("%s, твой любимый цвет %s", name, color);

//        String password = "q123";
//        String userPass = "";
//        do {
//            System.out.println("Введите пароль: ");
//            userPass = sc.nextLine();
//        } while (!userPass.equals(password));
//
//
//        System.out.println("Все хорошо, пароль верный!");
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(rand.nextInt(100) - 50);
//        }
//        int a = 23456;
//        System.out.printf("число %d напечатано" , a);
//        double d= Math.PI ;
//        System.out.println(d);
//        System.out.printf("Число Пи = %+20.02f" , d);

//        int[] arr = new int[10];
//        fillArr(arr);
//        printArr(arr);
//        System.out.println(countDivArr(arr,5));

//        System.out.println(summ(3, 6));
//        System.out.println(summ(4, 8, 9));
//        System.out.println(summ(4, 55, 6, 5, 3, 2, 5, 4, 3, 1, 6));
//        System.out.println(summ());

//        int number = sc.nextInt();
//        printDivider(number);
//        System.out.println(isPrime(number) ? "Простое число" : "Составное число");
//        System.out.println("Последняя цифра числа = "+ lastNum(number));
//        System.out.println(isDiv3(number) ? "Делится" :"Не делится" );
//        System.out.println(isThreeDigitNumber(number) ? "3-x зн" : " не 3-х значное");

//        System.out.println(fourth(-5,-7));

        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        printStringSplitSpace(word);
//        printEqualsChars(word1, word2);

        printRotateString(word1);
    }

    //    •	Метод печатает хелло юзер, хелло ( имя) несколько раз печатает хелло имя.
    public static void printHello() {
        System.out.println("Hello user");
    }

    public static void printHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void printHello(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + name);
        }
    }

    //    •	Вывод перевёрнутой строки (массива)
    public static void printRotateString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(s.length() - 1 - i));
        }
    }

    //    •	Сравнение 2 строк на совпадение их символов(
//    сколько совпадений, вывести совпадающие, если не совпадает то вывести *)
    public static void printEqualsChars(String s1, String s2) {
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                System.out.print(s1.charAt(i));
            } else {
                System.out.print("*");
            }
        }
    }

    public static void printStringSplitSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + ",");
        }
    }

    //•	Простое ли число.
    public static boolean isPrime(int n) {
        return countDivider(n) == 2;
    }

    public static int countDivider(int n) {
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k++;
            }
        }
        return k;
    }

    //    •	Вывести делители числа.
    public static void printDivider(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //    •	Вводятся координаты точки вывести в какой четверти оно находится.
    public static int fourth(double x, double y) {
        if (x > 0 && y > 0) return 1;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        if (x > 0 && y < 0) return 4;
        return 0;
    }

    //    •	Положительное и четное ли число.
    public static boolean ispositiveAndEvenNumber(int n) {
        return n > 0 && n % 2 == 0;
    }

    //•	3-хзначное ли число.(отрицательные тоже )
    public static boolean isThreeDigitNumber(int n) {
        return (n >= 100 && n <= 999) || (n >= -999 && n <= -100);
    }

    //	Вывести делится ли число на 3.
    public static boolean isDiv3(int n) {
        return n % 3 == 0;
    }

    //•	Вводится число, вывести его последнюю цифру.
    public static int lastNum(int n) {
        return Math.abs(n % 10);
    }

    public static int summ(int... massiv) {
        int s = 0;
        for (int i = 0; i < massiv.length; i++) {
            s += massiv[i];
        }
        return s;
    }

    public static int summ(int a, int b, int c) {
        return a + b + c;
    }

//    public static int summ(int a, int b) {
//        return a + b;
//    }

    public static void fillArr(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = rand.nextInt(100);
        }
    }

    public static int countDivArr(int[] massiv, int r) {
        int k = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % r == 0) {
                k++;
            }
        }
        return k;
    }

    public static void printArr(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
    }

    public static void printSqrArr(int[][] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
