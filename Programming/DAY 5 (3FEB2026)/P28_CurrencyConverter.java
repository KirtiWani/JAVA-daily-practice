import java.util.Scanner;

class P28_CurrencyConverter{

public static void main (String[]args){
	
	Scanner sc = new Scanner(System.in);
	
	for(; ; ){
	
	System.out.println ("\n*****WELCOME*****\n");
	System.out.println("*****CURRENCY CONVERTER*****\n");
	System.out.println("Enter amount in(INR)\n");
	double amount = sc.nextDouble();
	
	System.out.println("\n1.USD \n2.EUR \n3.GBP \n4.CAD \n4.AUD \n5.ADA \n7.AED \n8.AFN \n9.ALL \n10.AMD");
	System.out.println("\nEnter your response\n");
	String resp = sc.next().toUpperCase();
	boolean assump = true;
	
	double convertedAmount = 0;
	 
	if (resp.equals("USD")){
		convertedAmount = amount/90.21;
	}
	else if (resp.equals("EUR")){
		convertedAmount = amount/106.53;
	}
	else if (resp.equals("GBP")){
		convertedAmount = amount/123.3;
	}
	else if (resp.equals("CAD")){
		convertedAmount = amount/65.90;
	}
	else if (resp.equals("AUD")){
		convertedAmount = amount/63.31;
	}
	else if (resp.equals("ADA")){
		convertedAmount = amount/26.93;
	}
	else if (resp.equals("AED")){
		convertedAmount = amount/24.53;
	}
	else if (resp.equals("AFN")){
		convertedAmount = amount/1.36;
	}
	else if (resp.equals("ALL")){
		convertedAmount = amount/1.10;
	}
	else if (resp.equals("AMD")){
		convertedAmount = amount/0.23;
	}
	else{
		assump = false;
		System.out.println("INVALID RESPONSE");
	}
	if(assump)
		System.out.printf("%n%20.2f INR = %.2f%s%n",amount,convertedAmount,resp);
	}
}

}