//  Check if the number is even or odd

import java.util.Scanner;

class P11{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int num = sc.nextInt();

String op = 
(num%2 == 0)?
(num + " is even "):
(num + " is odd");
 

System.out.println(op);

}}