//Check if the character is Special Character or not

import java.util.Scanner;

class P3{
public static void main (String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a Character:");
char ch = sc.next().charAt(0);

String op =
//((ch>=48 && ch<=57)||(ch>=65 && ch<=90)||(ch>=97 && ch<=122)) 
((ch>=0 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96))?
(ch + " is a Special Character"):
(ch + " is not a Special Character");

System.out.println(op);

}}