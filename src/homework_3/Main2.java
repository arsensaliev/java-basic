package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// ДЗ №2
public class Main2 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        startGameRandomWords();
    }

    public static void startGameRandomWords() {
        System.out.println("Игра угадай слово!\n");
        String[] arr = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Угадайте одно слово из списка перечисленных:\n" + Arrays.toString(arr));

        String word = getRandomWord(arr);

        System.out.println("(Рандомное слово): " + word);

        while (true) {
            System.out.print("Слово: ");
            String value = scanner.nextLine().toLowerCase();

            if (word.equals(value)) {
                System.out.println("Вы угадали слово");
                break;
            } else{
                helpWord(word, value);
                System.out.println("\nПопробуй ёщё раз");
            }
        }
    }

    public static void helpWord(String word, String value) {
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            char b = value.charAt(value.length() - 1 - i < 0 ? 0 : i);
            if (a == b) {
                System.out.print(a);
            } else{
                System.out.print("#");
            }
        }
        for (int i = 0; i < 15; i++) {
            System.out.print("#");
        }
    }

    public static String getRandomWord(String[] arr) {
        return arr[random.nextInt(arr.length)];
    }
}
