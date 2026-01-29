/*
Program Description:
- Demonstrates the use of the '*' operator with different data types in Java.
*/

class J4_Multiplication
{
    public static void main (String[]args){

        /* Byte Multiplication:
           - byte values are promoted to int during multiplication. */
        {
            byte a = 15;
            byte b = 10;
            int ans = a * b;
            System.out.println(ans);
        }

        /* Short Multiplication:
           - short values are promoted to int. */
        {
            short a = 800;
            short b = 500;
            int ans1 = a * b;
            System.out.println(ans1);
        }

        /* Integer Multiplication:
           - int multiplication produces an int result. */
        {
            int a = 3000;
            int b = 2000;
            int ans2 = a * b;
            System.out.println(ans2);
        }

        /* Character Multiplication:
           - characters are multiplied using ASCII values. */
        {
            char a = 'b';
            char b = 'a';
            int ans3 = a * b;
            System.out.println(ans3);
        }

        /* Long Multiplication:
           - long multiplication results in a long output. */
        {
            long a = 50L;
            long b = 30L;
            long ans4 = a * b;
            System.out.println(ans4);
        }

        /* Float Multiplication:
           - demonstrates floating-point multiplication. */
        {
            float a = 3.2f;
            float b = 2.2f;
            float ans5 = a * b;
            System.out.println(ans5);
        }

        /* Double Multiplication:
           - double provides higher precision than float. */
        {
            double a = 3.2;
            double b = 2.2;
            double ans6 = a * b;
            System.out.println(ans6);
        }

        /* Boolean Multiplication:
        - Arithmetic operators are not supported for boolean values.
        - The following code is commented to avoid compile-time error. 
        {
            boolean a = true;
            boolean b = false;
             boolean ans7 = a * b;
            System.out.println(ans7);
        }*/

        /* String Multiplication:
        - The '*' operator cannot be used with String data type.
        - Strings support only '+' for concatenation.
        {
            String a = "Qspiders";
            String b = "Deccan";
             String ans8 = a * b;
            System.out.println(ans8);
         } */
    }
}

/*
Conclusion:
- The '*' operator works only with numeric data types.
- byte and short are promoted to int.
- char operations use ASCII values.
- float and double show decimal precision.
- boolean and String do not support multiplication.
*/
