/*Write a program that reads in the radius and length of a cylinder
and computes the area and volume using the following formulae:
      Area = 3.14 * radius * radius
	  Volume = area * height 
	  Sample run : Enter the radius and height of cylinder : 5.512
	               The area is 95.0331
				   The volume is 1140.4
*/


import java.util.Scanner;

public class P18_CylinderAreaVolume {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enter the radius cylinder: ");
 double radius = sc.nextDouble();
 System.out.print("Enter the height cylinder: ");
 double height = sc.nextDouble();
 
 double area = 3.14 * radius * radius;
 double volume = area * height;
 
 System.out.println("The area is " + area);
 System.out.println("The volume is " + volume);
 
 }
}
