public class Main {
    public static void main(String[] args) {
        Insect insect = new Insect("Cool Guy", 8);
        Butterfly butterfly = new Butterfly("Isabella", 5);
        Cockroach cockroach = new Cockroach("Bob", 10);

        Insect[] insects = new Insect[]{cockroach, butterfly};

        insect.move();
        insects[0].move();
        insects[1].move();
    }
}
