/*
Program Description:
- Demonstrates the maximum range of primitive data types in Java.
- Shows what happens when values exceed the allowed range (overflow).
*/

public class J19_Range {
    public static void main ( String[]args){

        /* Byte Range:
        - Valid range: -128 to 127
        - 8000 exceeds range, so overflow occurs */
        byte b = (byte)8000;

        /* Short Range:
        - Valid range: -32768 to 32767
        - Maximum value stored correctly */
        short s = (short)32767;

        /* Integer Range:
        - Valid range: -2,147,483,648 to 2,147,483,647 */
        int i = (int)2147483647;

        /* Long Range:
        - Valid range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 */
        long l = (long)9223372036854775807l;

        /* Float Range:
        - Approximate maximum value
        - Uses scientific notation */
        float f = (float)3.4028235E38f;

        /* Double Range:
        - Highest precision floating-point data type
        - Uses scientific notation */
        double d = (double)1.7976931348623157E308;

        /* Output of all variables */
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}

/*
Conclusion:
- Each data type has a fixed range in Java.
- Exceeding the range causes overflow.
- byte overflow gives unexpected values.
- float and double support very large numbers using scientific notation.
*/
