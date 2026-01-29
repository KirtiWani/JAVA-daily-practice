//  Check if the character is vowel or consonent


import java.util.Scanner;

class P7{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character:");
char ch = sc.next().charAt(0);

String op = 
 ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ?
 ((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')? (ch + " is a Vowel"): (ch + " is a Consonant")): 
 (ch + " is not an Alphabet");

System.out.println(op);

}}