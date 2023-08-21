package aug15;

public class TreeDemo {
    public static void main(String[] args) {
        Furniture chair = new Chair();
        chair.sit();
        chair.stand();

        Furniture table = new Table();
        table.sit();
        table.stand();
    }
}
