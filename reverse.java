package huuu;
import java.util.Scanner;
public class reverse {

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.print("enter the string: ");
	        String n=scanner.nextLine();
	        String n1 = new StringBuilder(n).reverse().toString();  

	        System.out.println(n1); 
	        
	    }
	}



