package aug12.animal;

public class Lion implements Animal{
    @Override
    public void feed() {
        System.out.println("I am a Lion. I eat meat...");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a Lion. I roarrrr...");
    }
}
