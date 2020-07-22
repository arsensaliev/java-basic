package homework_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask(-1);
    }

    // 1
    public static void firstTask() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }


    // 2
    public static void secondTask() {
        int[] numbers = new int[8];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + 3;
        }

        System.out.println(Arrays.toString(numbers));
    }

    // 3
    public static void thirdTask() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
            ;
        }

        System.out.println(Arrays.toString(numbers));
    }

    // 4
    public static void fourthTask() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    // 5
    public static void fifthTask() {
        int[] numbers = {3, 13, 32, 56, 7, 45, 56, -4, -34};

        // 1 вариант
        printMaxMinAndSort(numbers);

        // 2 Вариант
        searchMinMaxNumber(numbers);
    }

    // 5
    public static void printMaxMinAndSort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Минимальное число в массиве: " + arr[0]);
        System.out.println("Максимальное число в массиве: " + arr[arr.length - 1]);
    }

    // 5
    public static void searchMinMaxNumber(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int value : arr) {
            if (min > value) {
                min = value;
            } else {
                max = value;
            }
        }

        System.out.println("Минимальное число массива: " + min);
        System.out.println("Максимальное число массива: " + max);
    }

    // 6
    public static void sixthTask() {
        int[] numbers = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(sumArr(numbers));
    }

    // 6
    public static boolean sumArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                return true;
            }

        }

        return false;
    }

    public static void seventhTask(int n) {
        int[] arr = {3, 5, 7, 10};
        System.out.println("До: " + Arrays.toString(arr));
        if (n > 0) {
            for (int k = 0; k < n; k++) {
                int val = arr[arr.length - 1];

                for (int i = arr.length - 1; i != 0; i--) {
                    arr[i] = arr[i - 1];
                }

                arr[0] = val;
            }
        } else if (n < 0) {
            for (int k = 0; k > n; k--) {
                int val = arr[0];

                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = val;
            }
        } else {
            System.out.println("Без изменении");
        }

        System.out.println("После: " + Arrays.toString(arr));
    }
}
