import java.util.Scanner;

class P31_SwitchVowelConsonent{
public static void main (String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character: ");
	char ch = sc.next().toLowerCase().charAt(0);
	
	switch (ch){
		case 'a','e','i','o','u': System.out.println(ch +" :Character is a vowel" ) ; break;
		default :System.out.println(ch+" :Character is a consonent");break;
	}
}

}