import java.util.Scanner;

class P27_GradeCalculator {
public static void main (String[]args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your marks: ");
	
	double marks = sc.nextDouble();
	final double TOTAL_MARKS = 500;
	
	   if(marks<0 || marks>500)
	   { System.out.println("\n INVALID RESPONSE \n");
        return;
		//System.exit(0);//Terminate JVM
       }
	double per =(marks/TOTAL_MARKS)*100;
	String grade = "" , remark = "";
	
	if (per >= 90)
	{
		grade = "O";
		remark = "OUTSTANDING";
	}
	else if (per >= 75)
	{
		grade = "A+";
		remark = "FIRST CLASS WITH DISTINCTION";
	}else if (per >= 60)
	{
		grade = "A";
		remark = "FIRST CLASS";
	}else if (per >= 50)
	{
		grade = "B";
		remark = "SECOND CLASS";
	}else if (per >= 35)
	{
		grade = "C";
		remark = "PASS";
	}else {
		grade = "F";
		remark = "FAIL";
	}
	System.out.println("GRADE: " + grade);
	System.out.println("REMARK: " + remark);
	System.out.println("MARKS: " + marks + "/" + TOTAL_MARKS);
	System.out.println("PERCENTAGE: " + per + "%");
  }
 }