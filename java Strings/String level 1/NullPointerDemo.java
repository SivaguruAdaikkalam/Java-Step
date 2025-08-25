public class NullPointerDemo {

    // Method that generates a NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println("Text length: " + text.length());
    }

    // Method that handles NullPointerException using try-catch
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Text length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException! The variable 'text' is null.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Generating NullPointerException ===");
        try {
            generateException(); // This will crash if not caught here
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling NullPointerException safely ===");
        handleException();
    }
}
