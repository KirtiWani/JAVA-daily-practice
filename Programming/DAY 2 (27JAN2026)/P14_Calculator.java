//Calculator

import java.util.Scanner;

class P14_Calculator{
public static void main (String[]args){
    
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Operand 1: ");
	double opr1 = sc.nextDouble();
	
	System.out.print("Enter an Operator: ");
	char opr = sc.next().charAt(0);
	
	System.out.print("Enter Operand 2: ");
	double opr2 = sc.nextDouble();
	
	double op = 
	(opr=='+')?(opr1 + opr2):
	(opr=='-'?(opr1 - opr2):
	(opr=='*'?(opr1*opr2):
	(opr=='/'?(opr1 / opr2):
	(opr=='%'?opr1 % opr2:
	   (Double.MAX_VALUE)))));
	
	if (op!=Double.MAX_VALUE)
	    System.out.println(opr1 + " " + opr + " " + opr2 + "=" + op);
	else System.out.println("Invalid Operator");
	
	
}}