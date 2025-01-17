public class Cockroach extends Insect{
    private int speed;

    public Cockroach(String name, int levelOfHappiness) {
        super(name, levelOfHappiness);
    }

    public Cockroach(String name, int levelOfHappiness, int speed) {
        this(name, levelOfHappiness);
        this.speed = speed;
    }

    public void fly() {
        System.out.println("And the hell breaks loose");
    }

    @Override
    public void move() {
        System.out.println("Cockroach is running");
    }

}
