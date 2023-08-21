package aug12.animal;

public class Monkey implements Animal, Climbable {
    @Override
    public void feed() {
        System.out.println("I am a Monkey. I eat Bananas...");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a Monkey. I make weird noises...");
    }

    @Override
    public void climb() {
        System.out.println("I am a Monkey. I can climb trees");
    }
}
