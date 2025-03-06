import java.util.*;

class CharArray {
    // Method to convert a string to a character array using charAt()
    public static char[] toCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }
    // Method to compare two character arrays
    public static boolean toCompare(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        // Method for character extraction using toCharArray()
        char[] result2 = str.toCharArray();
        // Method for character extraction using charAt()
        char[] result1 = toCharArray(str);

        // Output
        System.out.println("Characters using toCharArray() method: " + Arrays.toString(result2));
        System.out.println("Characters using charAt() method: " + Arrays.toString(result1));

        // Printing the comparison results
        if (toCompare(result1, result2)) {
            System.out.println("Both the arrays are equal");
        } else {
            System.out.println("Both the arrays are not equal");
        }
    }
}
/*  Enter the string:
hello
Characters using toCharArray() method: [h, e, l, l, o]
Characters using charAt() method: [h, e, l, l, o]
Both the arrays are equal
*/