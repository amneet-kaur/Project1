package aug12.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Monkey monkey = new Monkey();
        Penguin penguin = new Penguin();
        lion.feed();
        lion.makeSound();
        monkey.climb();
        monkey.feed();
        monkey.makeSound();
        penguin.swim();
        penguin.feed();
        penguin.makeSound();

    }
}
