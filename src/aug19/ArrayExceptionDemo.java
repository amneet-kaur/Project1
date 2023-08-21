package aug19;

public class ArrayExceptionDemo {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
                System.out.println(numbers[6]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally Block Executed");
        }

    }
}
