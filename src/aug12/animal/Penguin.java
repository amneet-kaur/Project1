package aug12.animal;

public class Penguin implements Animal, Swimmable{
    @Override
    public void feed() {
        System.out.println("I am a Penguin. I eat fish...");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a Penguin. I make loud sounds...");
    }

    @Override
    public void swim() {
        System.out.println("I am a Penguin. I can swim");
    }
}
