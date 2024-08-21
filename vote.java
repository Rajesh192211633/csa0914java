package huuu;
import java.util.Scanner;
public class vote {
	public static void main(String[] args) {
		int validage=18;
		
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter age: ");
		int age=s.nextInt();
		
		if(age>=validage) {
			System.out.println("valid");
		}
		else
		{
			System.out.println("not");
		}
				
				
		
	}

}
