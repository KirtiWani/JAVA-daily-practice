//  Check if the number is prime or not (0-110)

import java.util.Scanner;

class P13{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int num = sc.nextInt();

String op =
(num < 1 || num > 110)
? "Number is not in range"
:
(
    (num > 1 &&
     (
        (num == 2 || num == 3 || num == 5 || num == 7) ||
        (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
     )
    )
    ? "Prime number"
    : "Not a prime number"
);

System.out.println(op);

}}