import java.util.Scanner;
import java.util.Arrays;
class LotteryTicketGame
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Variables
		int numTickets = 0;
		int numPerTicket = 0;
		int lowest = 0;
		int greatest = 0;
		int errorValidityCheck = 0;
		
		//Asking for details
		do
		{
			System.out.print("How many tickets: ");
			numTickets = in.nextInt();
			System.out.print("How many numbers are on a ticket: ");
			numPerTicket = in.nextInt();
			System.out.print("What is the lowest number: ");
			lowest = in.nextInt();
			System.out.print("What is the highest number: ");
			greatest = in.nextInt();
			//error check for invalid input
			if (numTickets > 0 && numPerTicket > 0 && lowest >= 0 && greatest > numPerTicket && greatest > lowest)
			{
			}
			else
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Sorry invalid combination of digits entered");
				System.out.println("Please try again..");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println();
				errorValidityCheck = 1;
			}
				
		}
		while(errorValidityCheck == 1);
			
		
		//Array for ticket numbers
		int[] numSelected = new int[numPerTicket];
		
		//Getting the numbers
		System.out.println("----------------------------");
		System.out.println("Your Tickets:");
		for(int i = 1; i <= numTickets; i++)
		{
			//Getting random numbers
			for(int j = 0; j < numPerTicket; j++)
			{
				numSelected[j] = (int)(Math.random() * greatest + lowest);
				//error Checking for repeated numbers
				for(int r = 0; r < j; r++)
				{
					if(numSelected[r] == numSelected[j])
					{
						j--;
					}
				}
			}
			//sorting the arrays from least to greatest 
			Arrays.sort(numSelected);
			//printing the numbers
			for(int t = 0; t < numPerTicket; t ++)
			{
				System.out.print(numSelected[t] + "\t"); 
			}
				
			System.out.println();
		}
		
		
		
		
	}
}
