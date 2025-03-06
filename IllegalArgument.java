import java.util.Scanner;

public class IllegalArgument {
    public static void generateException(String s1, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index."); //throw to generate the exception in substring
        }
        System.out.println("Substring: " + s1.substring(start, end)); 
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String s1, int start, int end) {
        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            System.out.println("Substring: " + s1.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Step 2: Calling the method that properly handles the exception
        handleException(str, start, end);
    }
}
/* Enter a string: hello
Enter start index: 2
Enter end index: 1
Exception generated: java.lang.IllegalArgumentException: Start index cannot be greater than end index. */
