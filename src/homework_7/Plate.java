package homework_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {
            System.out.println("Кот не может съесть больше еды чем в миске");
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int food) {
        this.food += food;
    }
}