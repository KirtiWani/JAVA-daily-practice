import java.util.Scanner;

class P30_LoanCalculator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		for (; ; ){
			System.out.println("\n**** WELCOME *****\n");
			System.out.println("Amount");
			double amount = sc.nextDouble();
			if (amount<1000 || amount>100000){
				System.out.println("INVALID Amount");
				continue;
			}
			System.out.println("Rate of Interest");
			double interest = sc.nextDouble();
			if(interest<3 || interest>30){
				System.out.println("INVALID Interest");
				continue;
			}
			System.out.println("Tenure (in Moths)");
			int tenure = sc.nextInt();
			if(tenure<3 || tenure>36){
				System.out.println("INVALID Tenure");
				continue;
			}
			double perMonthInterest = (amount/100)*interest;
			double totalInterestAmount = perMonthInterest*tenure;
			double emi = (amount+totalInterestAmount)/tenure;
			double totalAmount = amount+totalInterestAmount;
			
			System.out.println("\nMonthly EMI: "+emi);
			System.out.println("Principal Amount: "+amount);
			System.out.println("Total Interest: "+totalInterestAmount);
			System.out.println("Tota Amount: "+totalAmount);
			
			

			
		}
	}
}