//  Check if the year is leap year or not

import java.util.Scanner;

class P8{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a year:");
int year = sc.nextInt();

String op = 
((year%100!=0 || year%400 == 0 ) && (year%4 == 0))?
(year + " is  a leap year"):
(year + " is not a leap year ");
 

System.out.println(op);

}}