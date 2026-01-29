//  Check if the number is positive , negative or zero

import java.util.Scanner;

class P10{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int num = sc.nextInt();

String op = 
(num  == 0)?
(num + " is a zero"):
((num < 0)? (num + " is negative") : (num + " is positive"));
 

System.out.println(op);

}}
