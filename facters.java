package huuu;
import java.util.Scanner;
public class facters {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        scanner.close();

	       
	        int factorCount = countFactors(num);
	        System.out.println("Number of factors of " + num + " is: " + factorCount);
	    }

	   
	    public static int countFactors(int num) {
	        int count = 0;

	      
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                count++; 
	            }
	        }

	        return count;
	    }
	}



