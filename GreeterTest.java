public class GreeterTest {
    public static void main(String[] args) {
        Greeter greeting = new Greeter();
        String greet = greeting.greet();
        String greetingWithName = greeting.greet("Eduardo", "Pascal");
        if (greet.equals("Greetings World") || greetingWithName.equals("Greetings Eduardo")) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test Fail");
        }
        System.out.println(greetingWithName);
        System.out.println(greet);
    }
}
