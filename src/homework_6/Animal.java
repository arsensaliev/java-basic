package homework_6;

public class Animal {
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void swim(int distance) {
        if (maxSwim < distance) {
            System.out.println(name + " Не может пропылыть " + distance + "м");
        } else {
            System.out.println(name + " проплыл " + distance + "м");
        }
    }

    public void run(int distance) {
        if (maxRun < distance) {
            System.out.println(name + " Не может пробежать " + distance + "м");
        } else {
            System.out.println(name + " пробежал " + distance + "м");
        }
    }
}
