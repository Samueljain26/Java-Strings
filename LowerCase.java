import java.util.*;

public class LowerCase {
    //method to update string to Lower case using ascii value
    public static String usingAscii(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 96) {
                result += (char) (s.charAt(i) + 32);   //+32 converts uppercase to lower case 
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
        str = s.toLowerCase();
        System.out.println("Using tolowerCase() method: " + str);
        String result1 = usingAscii(s);
        if(toCompare(str, result1)==true){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
}
/* Enter a string: 
HelloWorlD
Using ASCII value: helloworld
Using tolowerCase() method: helloworld
Both strings are equal */