//  Check if the character is Alphabet, digit or not 


import java.util.Scanner;

class P5{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character:");
char ch = sc.next().charAt(0);

String op = 
((ch>=65 && ch<=90) || (ch>=97 && ch<=122))?
(ch + " is a Alphabet"):
((ch>=48 && ch<=57)?(ch + " is a digit"):(ch + " is neither digit nor alphabet "));

System.out.println(op);

}}