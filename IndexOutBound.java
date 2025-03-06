public class IndexOutBound {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException() {
        String text = "hello";
        System.out.println(text.charAt(7)); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException() {
        String text = "hello";
        try {
            System.out.println(text.charAt(7)); // Accessing the index using charAt() beyond the length of the String
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        // Calling the method to handle the exception
        handleException();
    }
}

/* Exception caught: java.lang.StringIndexOutOfBoundsException: Index 7 out of bounds for length 5*/

