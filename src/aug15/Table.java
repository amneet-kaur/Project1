package aug15;

public class Table implements Furniture{
    @Override
    public void sit() {
        System.out.println("You should not sit on the table");
    }

    @Override
    public void stand() {
        System.out.println("You can stand on the table");
    }
}
