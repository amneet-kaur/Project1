package aug19.driverrules;

public class DriverRules {
    int age;
    String name;

    public void enterAge(int i) throws AgeLimitException {

        if (age < 18) {
            throw new AgeLimitException("Age is less than 18");
        }
    }
}
