public class Insect {
    private String name;
    private int levelOfHappiness;

    public Insect (String name) {
        this.name = name;
    }

    public Insect(String name, int happinessLevel) {
        this(name);
        this.levelOfHappiness = happinessLevel;
    }

    public void move() {
        System.out.println("The insect is moving");
    }

    public void makeSound() {
        System.out.println("The insect makes sound");
    }

    public void beHappy() {
        System.out.println("The insect is happy");
    }
}
