package Number;

import java.util.*;
public class NumberGuess
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
Random rd=new Random();
System.out.println("=================================");
System.out.println("* WELCOME TO GUESS NUMBER  GAME *");
System.out.println("=================================");
int randomno=rd.nextInt(100);
System.out.println("");
System.out.println("You Will Be Asked To Guess A Number To Win The Game" + "\n");
System.out.println("You Have Maximum Only 5 Attempt Limit");
int limit=5;
int i=0;
   while(i<limit)
	{
		    System.out.println("\n" + "Enter a Guess No. between 1 to 100");
		    int GuessNo = obj.nextInt();
		    i++;
		    if(GuessNo > 100)
		    {
		       System.out.println("Please Enter Valid No.");
		    }    
		
		    if(GuessNo == randomno)
		    {
		        System.out.println("OOhhOO!, Congrats.., Your No. is Correct. You Won The Game!");
		
		        break;
		    }
		    else if(GuessNo < randomno)
		    {
		        System.out.println("Ufh!...Your No. is Lower Than Random No. Try Again..");
		    }
		    else 
		    {
		        if(GuessNo > randomno)
		        {
		        System.out.println("Sorry...Your No. is Greater Than Random No. Try Again..");
		        }
		    }
		    if(i==limit && GuessNo != randomno ) {
		    	System.out.println("\n" + "You have Lost the Game..." + "\n" + "Better Luck Next Time...");
		    }
     }
}
}
