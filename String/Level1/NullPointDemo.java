package string;

public class NullPointDemo {

    public static void generateException() {
        String text = null; 
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Generating Exception ----");
        try {
            generateException(); 
        } catch (Exception e) {
            System.out.println("Program crashed with: " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(); 
    }
}
