import java.util.*;

public class NumberFormatDemo {
    
public static void generateException(String s1) {
            int number =Integer.parseInt(s1);
            System.out.println("Number: " + number); // This will throw NumberFormatException
        }
    
        // Method to handle NumberFormatException
        public static void handleException(String s1) {
            try {
                int number =Integer.parseInt(s1);
            System.out.println("Number: " + number);//   Integer.parseInt() to get exception
            } catch (NumberFormatException e) {
                System.out.println("Exception caught: " + e);
            }
            catch (RuntimeException e) {
                System.out.println("General RuntimeException caught: " + e);
            }
        }
    
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter String: ");
            String str = sc.nextLine();
            // Calling the method to handle the exception
            handleException(str);
        }
    }
/* Enter String: 
hello
Exception caught: java.lang.NumberFormatException: For input string: "hello"*/