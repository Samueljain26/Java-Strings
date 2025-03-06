import java.util.*;

public class ArrayOutBounds {
    public static void generateException(String[] arr) {
        System.out.println(arr[1]);  // to generate the exception in array
}
public static void handleException(String[] arr) {
     // Method to handle ArrayIndexOutOfBoundsException
    try{
        System.out.println(arr[1]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception generated: " + e);
    }
    catch(RuntimeException e){
        System.out.println("General RuntimeException caught: " + e);
    }
}
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    //making array of names
    String[] names =new String[1];
    // User Input
    System.out.println("Enter the name: ");
    names[0]=sc.nextLine();
    //Calling the method that properly handles the exception
    handleException(names);
}
}
/*Enter the name
hello
Exception generated: java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1 */
