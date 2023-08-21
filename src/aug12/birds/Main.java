package aug12.birds;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.talk();
        Ostrich ostrich = new Ostrich();
        ostrich.fly();
        ostrich.tweet();
    }
}
