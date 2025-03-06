import java.util.*;

class NullPointer {
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; 
        try {
            System.out.println(text.length()); // Attempt to access length of null string
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        // Calling the method to handle the exception
        handleException();
    }
}

/* Exception caught: java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null*/
