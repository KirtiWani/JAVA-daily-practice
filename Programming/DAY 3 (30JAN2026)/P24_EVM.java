//Write a code which showcases EVM machine functionality

import java.util.Scanner;

class P24_EVM
{
   static int bjp , aap , cong , mns , nota;
   public static void main (String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the population of area: ");
   int population = sc.nextInt();

for(int i = 1; i <= population ; i++ )
{
   System.out.println("\n****** WELCOME ******");
   System.out.println("APKA EK VOTE DESH BADAL NAHI SAKTA HAI \n");
   System.out.println("1.BJP \n2.AAP \n3.CONG \n4.MNS \n5.NOTA");
   String resp = sc.next().toUpperCase();
   
   if (resp.equals("BJP")){
	   bjp++;
	   System.out.println("YOU HAVE VOTED FOR BJP");
	   System.out.println("ACCHE DIN AAYENGE \n");
   }
   else if (resp.equals("AAP")){
	   aap++;
	   System.out.println("YOU HAVE VOTED FOR AAP ");
	   System.out.println("JHAADU CHALAAO, BEIMAAN BHAGAO \n");
   }
   else if (resp.equals("CONG")){
	   aap++;
	   System.out.println("YOU HAVE VOTED FOR CONG");
	   System.out.println("BHARAT JODO \n");
   }
   else if (resp.equals("MNS")){
	   aap++;
	   System.out.println("YOU HAVE VOTED FOR MNS");
	   System.out.println("JAI MAHARASHTRA \n");
   }
   else if (resp.equals("NOTA")){
	   aap++;
	   System.out.println("YOU HAVE VOTED FOR NOTA");
	   System.out.println("OHHHH! U R EDUCATED \n");
   }
   else{
	   System.out.println("INVALID RESPONSE");
	   i--;
   }
   }
   System.out.println("bjp " +bjp );
   System.out.println("cong " + cong);
   System.out.println("aap " + aap);
   System.out.println("mns " + mns);
   System.out.println("nota " + nota);
  }
}