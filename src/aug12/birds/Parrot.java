package aug12.birds;

public class Parrot extends Birds{
    @Override
    public void tweet() {
        System.out.println("Parrot can tweet");
    }

    @Override
    public void fly() {
        System.out.println("Parrot can Fly");
    }

    public void talk(){
        System.out.println("Hello, I am a parrot. I can Talk");
    }
}
