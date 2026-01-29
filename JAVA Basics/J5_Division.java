/*
Program Description:
- Demonstrates the use of the '%' (modulus) operator with different data types in Java.
*/

class J6_Modulus
{
    public static void main (String[]args){

        /* Byte Modulus:
           - byte values are promoted to int during modulus operation. */
        {
            byte a = 15;
            byte b = 10;
            int ans = a % b;
            System.out.println(ans);
        }

        /* Short Modulus:
           - short values are promoted to int. */
        {
            short a = 800;
            short b = 500;
            int ans1 = a % b;
            System.out.println(ans1);
        }

        /* Integer Modulus:
           - returns the remainder after division. */
        {
            int a = 3000;
            int b = 2000;
            int ans2 = a % b;
            System.out.println(ans2);
        }

        /* Character Modulus:
           - characters are converted to ASCII values before operation. */
        {
            char a = 'b';
            char b = 'a';
            int ans3 = a % b;
            System.out.println(ans3);
        }

        /* Long Modulus:
           - modulus operation on long values. */
        {
            long a = 50L;
            long b = 30L;
            long ans4 = a % b;
            System.out.println(ans4);
        }

        /* Float Modulus:
           - modulus works with floating-point values. */
        {
            float a = 3.2f;
            float b = 2.2f;
            float ans5 = a % b;
            System.out.println(ans5);
        }

        /* Double Modulus:
           - provides higher precision remainder. */
        {
            double a = 3.2;
            double b = 2.2;
            double ans6 = a % b;
            System.out.println(ans6);
        }

        /* Boolean Modulus:
        - Modulus operator is not supported for boolean data types.
        - The following code is commented to avoid compile-time error. */
        // {
        //     boolean a = true;
        //     boolean b = false;
        //     boolean ans7 = a % b;
        //     System.out.println(ans7);
        // }

        /* String Modulus:
        - '%' operator cannot be applied to String data type.
        - Strings do not support modulus operations. */
        // {
        //     String a = "Qspiders";
        //     String b = "Deccan";
        //     String ans8 = a % b;
        //     System.out.println(ans8);
        // }
    }
}

/*
Conclusion:
- The '%' operator works only with numeric data types.
- byte and short are promoted to int during modulus operation.
- int modulus returns the remainder.
- char uses ASCII values for calculation.
- float and double support decimal remainders.
- boolean and String do not support modulus.
*/
