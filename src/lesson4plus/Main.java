package lesson4plus;

public class Main {
    public static void main(String[] args) {
//        printA(3);
//        draw(10);
//        printNumbers(15, 5);
        task2(6, 33);
    }

    // 1 3 5 7 9 11 13

    private static void task2(int a, int b) {
        a = (a / 2) * 2 + 1;
        for (int i = a; i <= b; i += 2) {
            System.out.print(i + " ");
        }
    }

    //    10 9 8 7 6 5 4 3 2 1
    public static void printNumbers(int begin, int end) {
        for (int i = begin; i >= end; i--) {
            System.out.print(i + " ");
        }
    }


    //    1+2+3+4+ ...+ n
    public static int numbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    public static void printA(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("AAAAAAAA");
        }
    }

    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("0");
            }
            System.out.println();
        }

    }
}
