package homework_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = false;
    }
    public void eat(Plate p) {
        this.isHungry = p.decreaseFood(appetite);
    }

    public void info() {
        System.out.println("===============");
        System.out.println("Имя: " + name + "\nАппетит: " + appetite + "\nСытность: " + isHungry);
        System.out.println("===============");
    }
}
