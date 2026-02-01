import java.util.Scanner;

class P25_StonePaperScissor{
	
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	infiniteloop:
	for( ; ;)
		
		{
			System.out.println("***** WELCOME *****");
			
			//USER IMPLEMENTATION
			
			System.out.println("1.STONE \n2.PAPER \n3.SCISSOR");
			System.out.println("Enter Your Response");
			int dgtUser = sc.nextInt();
			String user ="";
			
			if (dgtUser == 1 ) user="STONE";
			else if (dgtUser==2) user="PAPER";
			else if (dgtUser==3) user="SCISSOR";
			else {
				System.out.println("INVALID RESPONSE");
				continue infiniteloop;
			}
			
			//BOT IMPLEMENTATION
			
			int dgtBot = 0;
			for( ; ; ){
				dgtBot = (int)(Math.random()*10);
				if(dgtBot>=1 && dgtBot<=3)
					break;
			}
			
			String bot = "";
			if (dgtBot == 1) bot="STONE";
			else if (dgtBot == 2) bot = "PAPER";
			else bot = "SCISSOR";
			
			System.out.printf("%n%10s %8s" , "BOT" , "USER");
			System.out.printf("%n%10s %8s" , bot,user);
			
			// CALCULATE WINNER

			if (
				(user.equals("STONE") && bot.equals("SCISSOR")) ||
				(user.equals("PAPER") && bot.equals("STONE")) ||
				(user.equals("SCISSOR") && bot.equals("PAPER"))
			) {
				System.out.println("\n *****USER WON***** \n");
			}
			else if (
				(bot.equals("STONE") && user.equals("SCISSOR")) ||
				(bot.equals("PAPER") && user.equals("STONE")) ||
				(bot.equals("SCISSOR") && user.equals("PAPER"))
			) {
				System.out.println("\n *****BOT WON*****\n");
			}
			else {
				System.out.println("\n *****IT'S A DRAW***** \n");
			}

			
		}	
    }

}