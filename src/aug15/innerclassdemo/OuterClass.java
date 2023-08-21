package aug15.innerclassdemo;

public class OuterClass {

    String name = "Mike";

    public void outerMethod() {
        System.out.println("Outer Class Method");
    }

    class InClass {

        int x = 10;

        public void insideMethod() {
            System.out.println("Inner Class Method");
        }
    }
}
