import java.util.Scanner;

class P29_Bank{
		static String name;
		static String address;
		static long contact;
		static long adhar;
		static String pancard;
		static double balance;
		static int pin;
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			welcomeLoop :
			for ( ; ; ){
				System.out.println("\nWELCOME");
				System.out.println(" ***** LAXMI CHIT FUND ***** ");
				System.out.print("1.CREATE ACCOUNT \n2.LOGIN \n");
				System.out.print("Enter your response : ");
				int resp = sc.nextInt();
				switch(resp)
				{
					case 1:{
						if(name!=null){
							System.out.println("\n ACCOUNT ALREADY EXIST \n");
							continue;
						}
						System.out.println("\n ACCOUNT CREATION PAGE \n");
						System.out.print("Name : ");
						name = new Scanner(System.in).nextLine();
						System.out.print("Address : ");
						address = new Scanner(System.in).nextLine();
						System.out.print("Contact : ");
						contact = new Scanner(System.in).nextLong();
						System.out.print("Aadhar : ");
						adhar = new Scanner(System.in).nextLong();
						System.out.print("Pancard : ");
						pancard = new Scanner(System.in).next();
						System.out.print("Enter an amount : ");
						balance = new Scanner(System.in).nextDouble();
						System.out.print("Pin : ");
						pin = new Scanner(System.in).nextInt();
						System.out.println("\n ACCOUNT CREATED SUCCESSFULLY \n");
						break;
					}
					case 2 :{
						if(name == null){
							System.out.println("\nCREATE YOUR ACCOUNT FIRST\n");
							continue;
						}	
						System.out.println("\n LOGIN MODULE \n");
						System.out.print("Contact :");
						long userContact = new Scanner(System.in).nextLong();
						System.out.print("PIN : ");
						long userPin = new Scanner(System.in).nextLong();
						
						if(contact==userContact && pin==userPin){
							System.out.println("\n LOGIN SUCCESSFUL");
							
							features :
							for ( ; ; )
							{
								System.out.println("\n ***** FEATURES ***** \n");
								System.out.println("1.DEPOSIT \n2.WITHDRAW \n3.CHECK BALANCE \n4.LOGOUT");
								int opt = sc.nextInt();
								switch (opt){
									case 1 :{
										System.out.println("\n DEPOSIT AMOUNT MODULE \n");
										System.out.print("Enter deposit amount: ");
										double deptAmt =  new Scanner(System.in).nextDouble();
										balance += deptAmt;
										System.out.println("\n AMOUNT DEPOSITED SUCCESSFULLY\n");
										break;
									}
									case 2 :{
										System.out.println("\n WITHDRAW AMOUNT MODULE \n");
										System.out.print("Enter an amount: ");
										double wdrwAmt =  new Scanner(System.in).nextDouble();
										System.out.print("Enter your pin : ");
										int pin2 = new Scanner(System.in).nextInt();
										if(pin2 == pin){
											if(wdrwAmt <= balance){
												balance -= wdrwAmt;	
												System.out.println("\n AMOUNT DEBITED SUCCESSFULLY \n");
											}
											else {
												System.out.println("\n INSUFFICIENT FUNDS \n");
											}
										}else{
										    System.out.println("\n INVALID PIN \n ");	
										}
										break;
									}
									case 3 :{
										System.out.println("\n CHECK BALANCE MODULE \n");
										System.out.print("Enter your pin : ");
										int pin2 = new Scanner(System.in).nextInt();
										if (pin2 == pin){
											System.out.println("Your account balance is : " + balance + " rs.");
										} else{
											System.out.println("\n INVALID PIN \n ");
										}
										break;
									}
									case 4 : {
										System.out.println("\n THANK YOU AND VISIT AGAIN \n ");
										continue welcomeLoop;
									}
									default:{
										System.out.println("\n INVALID RESPONSE ");
									}
								}
							}
						}else{
							System.out.println("\n INVALID CREDENTIALS \n ");
						}
						break;
					}
					default:{
						System.out.println("\n INVALID RESPONSE \n ");
					}
				}
			}
		}
}