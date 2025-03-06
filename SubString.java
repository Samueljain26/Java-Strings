import java.util.*;

class SubString{
    public static String findSubString(String str,int start,int end){
        //method for substring using charAt
        String result = "";
        for(int i=start; i <= end; i++ ){
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean toCompare(String s1, String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the start index");
        int start = sc.nextInt();
        System.out.println("Enter the end index");
        int end = sc.nextInt();
         //method for substring using .substring
        String result2 = str.substring(start,end+1);
        String result1 = findSubString(str,start,end);
        //output
        System.out.println("SubString using substring method: "+result2);
        System.out.println("SubString using charAt method: "+result1);
        //printing the compare results
        if(toCompare(result1,result2)==true){
            System.out.println("Both the strings are equal");
        }
        else{
            System.out.println("Both the strings are not equal");
}
    }
}

/*  i/o => Enter the string
hello
Enter the start index
1
Enter the end index
3
SubString using substring method: ell
SubString using charAt method: ell
Both the strings are equal
*/