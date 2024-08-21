package huuu;
import java.util.Scanner;
public class simpleintrest 
{
	public static void main(String[] args)
	{
		int principle;
		int rate;
		int time;
		int simpleintrest;
		 Scanner s= new Scanner(System.in);
		 System.out.print("enter principle amout: ");
		 principle=s.nextInt();
		 System.out.print("enter rate: ");
		 rate=s.nextInt();
		 System.out.print("enter time: ");
		 time=s.nextInt();
		 
		 simpleintrest=(principle*rate*time);
		 System.out.println(simpleintrest);
		 
		 
		 
		 
		 
		
	}

}
