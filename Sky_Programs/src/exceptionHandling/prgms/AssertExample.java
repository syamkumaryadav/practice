package exceptionHandling.prgms;

public class AssertExample {
    public static void main(String[] args) {
        int number = 10;

        // Simple assertion
        assert number > 10;

        // Assertion with message
        assert number < 5 : "Number is not less than 5";

        System.out.println("Program completed.");
    }
}
// current  not working