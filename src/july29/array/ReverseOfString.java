package july29.array;

public class ReverseOfString {
    public static void main(String[] args) {
        String string = "Pragra";
        char[] charArray = string.toCharArray();
        for (int i = charArray.length - 1 ; i >= 0 ; i--) {
            System.out.print(charArray[i]);

        }
    }
}
