//Check if the given character is digit or not 

import java.util.Scanner;
class P2{
public static void main (String[]args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a character:");
char ch = sc.next().charAt(0);

String op = 
(ch>=47 && ch<=55)?
(ch + " is a digit"):
(ch + " is not a digit");

System.out.println(op);

}}