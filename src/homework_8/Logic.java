package homework_8;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Logic {
    public static void go() {
        isFinished = true;
        if (checkWin(DOT_X)) {
            Dialog dialog = new Dialog("Победил человек");
            dialog.setVisible(true);
            return;
        }
        if (isMapFull()) {
            Dialog dialog = new Dialog("Ничья");
            dialog.setVisible(true);
            return;
        }
        aiTurn();
        if (checkWin(DOT_O)) {
            Dialog dialog = new Dialog("Победил Искуственный Интеллект");
            return;
        }
        if (isMapFull()) {
            Dialog dialog = new Dialog("Ничья");
        }

        isFinished = false;
    }


    // instances class
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    // map
    public static char[][] map;
    public static int SIZE;

    // symbols
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static boolean isFinished;

    public static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void humanTurn(int x, int y) {

        if (isCellValid(x, y)) {
            map[y][x] = DOT_X;
            go();
        }

    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean checkWin(char symbol) {
        return checkLanes(symbol) || checkDiagonal(symbol);
    }


    public static boolean checkLanes(char symbol) {
        boolean cols, rows;
        for (int col = 0; col < SIZE; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < SIZE; row++) {
                cols &= (map[col][row] == symbol);
                rows &= (map[row][col] == symbol);
            }

            if (cols || rows) {
                return true;
            }
        }

        return false;
    }

    public static boolean checkDiagonal(char symbol) {
        boolean toright = true,
                toleft = true;

        for (int i = 0; i < SIZE; i++) {
            toright &= (map[i][i] == symbol);
            toleft &= (map[SIZE - i - 1][i] == symbol);
        }

        return toright || toleft;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }
}
