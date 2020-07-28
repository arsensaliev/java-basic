package homework_3;

import java.util.Random;
import java.util.Scanner;

// ДЗ №1
public class Main1 {
    public static void main(String[] args) {
        startGameRandomPassword();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void startGameRandomPassword() {
        int max = 9;
        int pass = generateRandomPass(max);
        System.out.println("Игра угадай пароль!");

        boolean isWin = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте пароль от 0 до " + max);
            int userPass = scanner.nextInt();

            if (userPass < pass) {
                System.out.println("Число больше!");
            } else if (userPass > pass) {
                System.out.println("Число меньше!");
            } else {
                System.out.println("Вы угадали!");
                isWin = true;
                break;
            }
        }

        if (!isWin) {
            System.out.println("===== Вы проиграли! =====");
        } else {
            System.out.println("===== Вы выйграли! =====");
        }

        againGame();
    }

    public static void againGame() {
        while (true) {
            System.out.println("Повторить игру еще раз? 1-повторить, 0 - нет");

            int again = scanner.nextInt();

            if (again > 1 || again < 0) {
                continue;
            }

            if (again == 1) {
                startGameRandomPassword();
            }

            break;
        }
    }

    public static int generateRandomPass(int max) {
        Random random = new Random();
        return random.nextInt(max + 1);
    }
}
