package huuu;
import java.util.Scanner
public class composite {
	public static void main(String[] args) {
		int i;
		Scanner s=new Scanner(System.in);
		System.out.print("enter composite numbe: ");
		int n=s.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("composite");
			
				
			}
		}
	
		{
			System.out.println("not");
		}
		

		
		
	}

}
