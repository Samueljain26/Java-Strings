import java.util.*;

public class UpperCase {
    //method to update string to uppercase using ascii value
    public static String usingAscii(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                result += (char) (s.charAt(i) - 32);   //-32 converts lowercase to uppercase 
                } else {
                    result += s.charAt(i);
                    }
                    }
                    return result;
}
//method to compare both the results
    public static boolean toCompare(String s1, String s2) {
        return s1.equals(s2) ;
        
    }
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        //output
        System.out.println("Using ASCII value: " + usingAscii(s));
        String str ="";
        str = s.toUpperCase();
        System.out.println("Using toUpperCase() method: " + str);
        String result1 = usingAscii(s);
        if(toCompare(str, result1)==true){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
}
/*Enter a string: 
helloA
Using ASCII value: HELLOA
Using toUpperCase() method: HELLOA
Both strings are equal */