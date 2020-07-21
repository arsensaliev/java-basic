package homework_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculate(42, 13, 85, 73));
        System.out.println(isBetween(14, 20));
        printTypeNumber(4);
        System.out.println(isTypeNumber(-13));
        printHello("Арсен");
    }

    // 2
    public static void variables() {
        byte b;
        short s;
        int integer;
        long l;
        float fl;
        double db;
        char symbol;
        boolean bool;
        String str;
    }

    // 3
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // 4
    public static boolean isBetween(int a, int b) {
        return a >= 10 && a <= 20 && b >= 10 && b <= 20;
    }

    // 5
    public static void printTypeNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительный");
        } else {
            System.out.println("Отрицательный");
        }
    }

    // 6
    public static boolean isTypeNumber(int a) {
        return a >= 0;
    }

    // 7
    public static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
