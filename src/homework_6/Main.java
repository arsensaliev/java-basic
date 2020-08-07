package homework_6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Лайка");
        Cat cat = new Cat("Барсик");
        cat.swim(500);
        cat.run(300);
        dog.swim(30);
        dog.run(700);
    }
}
