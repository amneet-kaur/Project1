package July4;

public class HighestNumber {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 14;
        int num3 = 16;

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("num1 is greatest");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is greatest");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println("num3 is greatest");
        }
    }
}
