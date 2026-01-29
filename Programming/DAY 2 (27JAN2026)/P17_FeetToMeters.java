/*Write a program that reads  a number in feet , converts it to meters 
and displays the result.

Sample run : Enter a value for feet : 16.5
             16.5 feet is 5.0325 in meters 

*/


import java.util.Scanner;

public class P17_FeetToMeters {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enter a value for feet: ");
 double feet = sc.nextDouble();
 
 double meters = feet * 0.305;
 
 System.out.println(feet + " feet is " + meters + " meters");

 }
}