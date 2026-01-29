//Check if the character is Alphabet or not

import java.util.Scanner;
class P1 {
public static void main (String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character:");
	char ch = sc.next().charAt(0);
	
	String op = 
	//lowercase           //UPPERCASE
	((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))? // operand 1 (boolean)
	(ch+ " is an Alphabet"):                    // operand 2 ---> true
	(ch+ " is not an Alphabet");                // operand 3 ---> false
	
System.out.println(op);
}
}

