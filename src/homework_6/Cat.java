package homework_6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, 200, 0);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
