import java.util.*;

class ToCompare{
	 static boolean toCompare1(String s1,String s2){
		int counter =0;
		for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)==(s2.charAt(i))){
		counter++;
		}
		}
		return counter==s1.length();
	}
	static boolean toCompare2(String s1,String s2){
		return s1.equals(s2);
	}



	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter String 1: ");
	String s1 =sc.next();
	System.out.print("Enter String 2: ");
        String s2 =sc.next();
	System.out.println("are both string equal ? (using charAt) : "  + toCompare1(s1,s2));
	System.out.print("are both string equal ? (using .equals) : "  + toCompare2(s1,s2));
	if(toCompare1(s1,s2)==toCompare2(s1,s2)){
	System.out.println("\nsame results");
	}
	else{
	System.out.println("\ndifferent results");
	}
}
}

