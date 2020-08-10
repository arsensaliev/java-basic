package homework_7;

import java.util.Random;

public class Main {
    private static Random random;

    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 105);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat(plate);
//        plate.info();
//        cat.info();
        int sum = 50;
        Cat[] cats = addCat(sum);
        Plate[] plates = addPlate(sum);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plates[i]);
            cats[i].info();
        }
    }

    public static Cat[] addCat(int sum) {
        Cat[] cats = new Cat[sum];
        for (int i = 0; i < cats.length; i++) {
            String name;
            int number = (int) Math.floor(Math.random() * 3);
            int appetite = (int) Math.floor(Math.random() * 100);
            if (number == 0) {
                name = "Барсик";
            } else if (number == 1) {
                name = "Мурзик";
            } else {
                name = "Тимон";
            }

            cats[i] = new Cat(name, appetite);
        }
        return cats;
    }

    public static Plate[] addPlate(int sum) {
        Plate[] plates = new Plate[sum];

        for (int i = 0; i < plates.length; i++) {
            int value = (int) Math.floor(Math.random() * 100);
            plates[i] = new Plate(value);
        }

        return plates;
    }
}
