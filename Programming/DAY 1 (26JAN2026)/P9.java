//  Check if the number is positive or negative 

import java.util.Scanner;

class P9{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int num = sc.nextInt();

String op = 
(num<0)?
(num + " is a negative number"):
(num + " is a positive number");
 

System.out.println(op);

}}