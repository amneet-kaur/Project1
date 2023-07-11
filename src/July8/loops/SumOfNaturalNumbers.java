package July8.loops;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 1;
        int counter = 1;
        while (counter <= 10) {
            sum = sum + counter;
            counter++;
        }
        System.out.println("Sum of First 10 Natural Numbers is : " + sum);
    }
}
