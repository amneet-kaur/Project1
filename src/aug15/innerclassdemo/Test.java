package aug15.innerclassdemo;

public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.name = "Mike2";

        //To Access Inner Class -->
        // OuterClassName.InnerClassName obj = outerClassObjectReference.new InnerClass();
        OuterClass.InClass innerClassObject = outerClass.new InClass();
        innerClassObject.insideMethod();
        innerClassObject.x = 10;
        System.out.println(innerClassObject.x);
    }
}
