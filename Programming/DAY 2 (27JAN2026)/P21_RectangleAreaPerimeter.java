/*Area and Perimeter of Rectangle
Write a program that displays that displays area and primeter of a rectangle with the width 
of 4.5 and hight of 7.9 using the formula 

area = width * height
primeter =  2 *(width + height)*/


class P21_RectangleAreaPerimeter {
public static void main(String[] args) {

 double width = 4.5;
 double height = 7.9;

double area = width * height;
double perimeter = 2 * (width + height);

 System.out.println("Area of the rectangle is " + area);
 System.out.println("Perimeter of the rectangle is " + perimeter);
 }
}
