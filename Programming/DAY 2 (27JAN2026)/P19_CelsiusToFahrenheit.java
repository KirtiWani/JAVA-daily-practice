/*Write a program that reads in a celsius degree in a double value from the
console then converts it to Fahrenheit and displays the result.

The formula for the conversion is as follows:
      Fahrenheit = (9/5) * celsius + 32

Hint : In java 9/5 is 1 , but 9.0/5 is 1.8

Output : Enter a degree in celcius : 43
         43 celcius is 109.4 Fahrenheit
*/


import java.util.Scanner;

public class P19_CelsiusToFahrenheit {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enter a degree in Celsius: ");
 double celsius = sc.nextDouble();
 
 double fahrenheit = (9.0 / 5) * celsius + 32;
 
 System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit")
 
 }
}
