/*
Program Description:
- This Java program demonstrates the use of the '+' operator with different data types.
- The data types covered include byte, short, int, char, long, float, double, and String.
*/

class J2_Addition {
    public static void main(String[] args) {
/*
Byte Addition:
- When two byte values are added, Java automatically promotes them to int.
- The result of the addition is stored in an int variable.
*/

        {
            byte a = 5;
            byte b = 10;
            int ans = a + b;
            System.out.println(ans);
        }

/*
Short Addition:
- Similar to byte, short values are promoted to int during arithmetic operations.
- This type promotion ensures safe computation and avoids data loss.
*/
        {
            short a = 300;
            short b = 500;
            int ans1 = a + b;
            System.out.println(ans1);
        }

/*
Integer Addition:
- Addition between two int values produces an int result.
- No type promotion occurs in this case.
*/
        {
            int a = 1000;
            int b = 2000;
            int ans2 = a + b;
            System.out.println(ans2);
        }
/*
Character Addition:
- Characters are added using their ASCII values.
- The result is an int representing the sum of the ASCII codes of the characters.
*/
        {
            char a = 'a';
            char b = 'b';
            int ans3 = a + b;
            System.out.println(ans3);
        }
/*
Long Addition:
- Long values are added normally without any type promotion.
- The result of the operation remains of type long.
*/
        {
            long a = 50l;
            long b = 30l;
            long ans4 = a + b;
            System.out.println(ans4);
        }
/*
Float Addition:
- Demonstrates floating-point addition using decimal values.
- The result may show minor precision variations due to floating-point representation.
*/
        {
            float a = 1.1f;
            float b = 2.2f;
            float ans5 = a + b;
            System.out.println(ans5);
        }
/*
Double Addition:
- Double provides higher precision compared to float.
- It is used for more accurate decimal calculations.
*/
        {
            double a = 1.1f;
            double b = 2.2f;
            double ans5 = a + b;
            System.out.println(ans5);
        }
/*
String Concatenation:
- When the '+' operator is used with String values, it performs concatenation.
- Multiple strings are combined into a single output.
*/
        {
            String a = "Qspiders";
            String b = "Deccan";
            String ans6 = a + b;
            System.out.println(ans6);
        }
    }
}

/*
Overall Learning Outcome:
- This program explains Java's type promotion rules in arithmetic operations.
- It demonstrates the dual behavior of the '+' operator for numeric addition and string concatenation.
- The program helps beginners understand how Java handles different data types internally.
*/