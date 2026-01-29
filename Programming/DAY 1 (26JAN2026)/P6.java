//  Check if the character is Upper Case , Lower Case , digit or Special Character


import java.util.Scanner;

class P6{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character:");
char ch = sc.next().charAt(0);

String op = 
((ch>=65 && ch<=90) || (ch>=97 && ch<=122))?
((ch>=65 && ch<=90)? (ch + " is UPPER CASE"):(ch + " is lower case")):
((ch>=48 && ch<=57)?(ch + " is a digit"):(ch + " is a Special Character"));

System.out.println(op);

}}