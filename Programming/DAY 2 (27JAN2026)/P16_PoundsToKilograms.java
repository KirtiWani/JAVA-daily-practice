/*Write a program that converts pound into kilograms.The program prompts the 
user to enter a number in pounds,converts it to kilograms, and displays the 
result. One pound is 0.454 kilograms.
Sample run : Enter a number in pounds : 55.5
             55.5 pounds is 25.197 kilograms */
			 
			 
import java.util.Scanner;

public class P16_PoundsToKilograms {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enter a number in pounds: ");
 double pounds = sc.nextDouble();
 
 double kilograms = pounds * 0.454;
 
 System.out.println(pounds + " pounds is " + kilograms + " kilograms");
 
 }
}
