/*(Area and Perimeter of Circle)
Write a program that displays the area and perimeter of a circle 
that has a radius of 5.5 cm using the following formula

perimeter = 2*PI(3.14)*radius
area = PI(3.14)*(radius)*(radius)*/

import java.util.Scanner;

class P15_Circle {
public static void main ( String [] args ){

Scanner sc = new Scanner(System.in);
System.out.println( "Enter radius of circle (cm):");

double radius = sc.nextDouble();

final double PI = 22/7.0;
final double AREA = PI * (radius * radius);
final double PERIMETER = 2 * PI * radius ;

System.out.println("Radius of circle: " + radius + "cm");
System.out.printf("Area of Circle : %.3f cm^2 \n"  ,AREA);
System.out.printf("Perimeter of Circle : %.3f cm",PERIMETER);

}}