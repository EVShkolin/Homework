public class Butterfly extends Insect{
    private String color;

    public Butterfly(String name, int levelOfHappiness){
        super(name, levelOfHappiness);
    }

    public Butterfly(String name, int levelOfHappiness, String color){
        this(name, levelOfHappiness);
        this.color = color;
    }

    public void eat() {
        System.out.println("Butterfly is eating");
    }

    @Override
    public void move() {
        System.out.println("Butterfly flying");
    }
}
