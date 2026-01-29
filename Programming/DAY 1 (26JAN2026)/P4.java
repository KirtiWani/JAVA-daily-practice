//  Check if the character is Upper Case or Lower Case

import java.util.Scanner;

class P4{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character:");
char ch = sc.next().charAt(0);

String op = 
((ch>=65 && ch<=90) || (ch>=97 && ch<=122))?
((ch>=65 && ch<=90)? (ch + " is UPPER CASE"):(ch + " is lower case")):
(ch + " is not an Alphabet");

System.out.println(op);

}}