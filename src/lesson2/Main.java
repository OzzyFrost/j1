package lesson2;

import java.util.Arrays;

public class Main {
    static int x = 80;

    public static void main(String[] args) {

//        int i = 1;
//        while (i<=5) {
//            System.out.println(i);
//            i++;
//        }
//        printWord("Java", 7);
//        int n = 106534;
//        int s = 0;
//        while (n > 0) {
//            s += n % 10;
//            n /= 10;
//        }
//        System.out.println(s);
//        for (int i = 0; i < 9 ; i++) {
//            if (i>2){
//                break;
//            }
//            System.out.print(i+" ");
//        }

//        for (char c = 'а'; c <= 'я'; c++) {
//            System.out.print(c);
//        }
//        int n = 4;
//        switch (n) {
//            case 2:
//                System.out.println("Плохо");
//                break;
//            case 3:
//                System.out.println("Удовл");
//                break;
//            case 4:
//                System.out.println("Хорошо");
//                break;
//            case 5:
//                System.out.println("Отлично");
//                break;
//            default:
//                System.out.println("Нет такой оценки");
//        }

//        switch (n) {
//            case 1:
//                System.out.println("Январь");
//                break;
//            case 2:
//                System.out.println("Февраль");
//                break;
//            case 12:
//                System.out.println("Декабрь");
//                break;
//            default:
//                System.out.println("Не зима");
//        }
//        int[] a = {2, 3, 4};
//        int[] b = {5, 6, 7};
//        b = a;
//        a[0] = 15;
//        b[1] = 25;
//        System.out.println(Arrays.toString(a));

//        System.out.println(x);
        int n = 4;
        int m = 3;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        String[][] names = {
                {"Вася", "Петя"},
                {"Саша", "Костя", "Маша"},
                {"Люба"}
        };

        for (String[] lines : names) {
            for (String word : lines) {
                System.out.print(word + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < names.length; i++) {
////            for (int j = 0; j < names[i].length; j++) {
////                System.out.print(names[i][j] + " ");
////            }
////            System.out.println();
////        }

        int[] mass = {4, 6, 5, 4, 6, 7, 3, 45, 5, 4};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 10 == 5) {
                mass[i] += 100;
            }
        }
        System.out.println(Arrays.toString(mass));

    }

    public static void printWord(String s, int k) {
        for (int j = 0; j < k; j++) {
            System.out.println(s);
        }
        System.out.println(x);
    }

    public static int countNumber(int n) {
        int i = n;
        int k = 0;
        while (i > 0) {
            k++;
            i = i / 10;
        }
        return k;
    }
}
