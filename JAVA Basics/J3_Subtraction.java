/*
Program Description:
- This Java program demonstrates the use of the '-' (subtraction) operator
with different data types.
- The program performs subtraction on byte, short, int, char, long, float,
and double data types.
- It also explains why subtraction is not supported for boolean and String
data types in Java.
*/

class J3_Subtraction
{
    public static void main (String[]args){

        /*
        Byte Subtraction:
        - When two byte values are subtracted, Java automatically promotes them to int.
        - The result of the subtraction is stored in an int variable.
        */
        {
            byte a = 15;
            byte b = 10;
            int ans = a - b;
            System.out.println(ans);
        }

        /*
        Short Subtraction:
        - Short values are promoted to int during subtraction operations.
        - This ensures accurate computation and prevents data loss.
        */
        {
            short a = 800;
            short b = 500;
            int ans1 = a - b;
            System.out.println(ans1);
        }

        /*
        Integer Subtraction:
        - Subtraction between two int values produces an int result.
        - No type promotion occurs in this case.
        */
        {
            int a = 3000;
            int b = 2000;
            int ans2 = a - b;
            System.out.println(ans2);
        }

        /*
        Character Subtraction:
        - Characters are internally represented using ASCII values.
        - Subtraction is performed on their ASCII values and the result is an int.
        */
        {
            char a = 'b';
            char b = 'a';
            int ans3 = a - b;
            System.out.println(ans3);
        }

        /*
        Long Subtraction:
        - Subtracting long values results in a long output.
        - No type promotion occurs as long has a larger range.
        */
        {
            long a = 50L;
            long b = 30L;
            long ans4 = a - b;
            System.out.println(ans4);
        }

        /*
        Float Subtraction:
        - Demonstrates subtraction of floating-point values using float.
        - The result may show minor precision differences due to floating-point representation.
        */
        {
            float a = 3.2f;
            float b = 2.2f;
            float ans5 = a - b;
            System.out.println(ans5);
        }

        /*
        Double Subtraction:
        - Double provides higher precision than float for subtraction operations.
        - It is preferred when more accurate decimal results are required.
        */
        {
            double a = 3.2;
            double b = 2.2;
            double ans6 = a - b;
            System.out.println(ans6);
        }

        /*
        Boolean Subtraction (Not Allowed):
        - Java does not support arithmetic operations on boolean data types.
        - Subtracting boolean values results in a compilation error.

        Example (Invalid Code):
            boolean a = true;
            boolean b = false;
            boolean ans = a - b;
        */

        /*
        String Subtraction (Not Allowed):
        - The '-' operator cannot be used with String data types.
        - Strings support concatenation using '+' but not subtraction.

        Example (Invalid Code):
            String a = "Qspiders";
            String b = "Deccan";
            String ans = a - b;
        */
    }
}

/*
Conclusion / Learning Outcome:
- This program explains how the '-' operator behaves with different numeric data types.
- It demonstrates Java’s automatic type promotion for byte and short during subtraction.
- It shows that character subtraction is based on ASCII values.
- The program highlights floating-point precision in float and double operations.
- It also clarifies that boolean and String data types do not support subtraction.
- Overall, the program strengthens understanding of Java’s arithmetic rules and type system.
*/
