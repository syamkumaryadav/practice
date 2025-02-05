package exceptionHandling.prgms;

public class CatchAllExampleThrowable {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            System.out.println(arr[3]); // Throws ArrayIndexOutOfBoundsException
        } catch (Throwable t) { // Catches all exceptions and errors
            System.out.println("A throwable occurred: " + t);
        }
    }
}

