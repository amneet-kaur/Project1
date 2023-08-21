package aug12.birds;

public class Ostrich extends Birds{
    @Override
    public void tweet() {
        System.out.println("Ostrich cannot tweet");
    }

    @Override
    public void fly() {
        System.out.println("Ostrich cannot fly");
    }
}
