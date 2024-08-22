package huuu;
import java.util.Scanner;
public class feb {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the number of terms: ");
	        int terms = scanner.nextInt();
	        scanner.close();

	       
	        printFibonacciSeries(terms);
	    }


	    public static void printFibonacciSeries(int terms) {
	        if (terms <= 0) {
	            System.out.println("Please enter a positive integer.");
	            return;
	        }

	      
	        int a = 0, b = 1;
	        
	       
	        System.out.print("Fibonacci Series: " + a);

	        if (terms > 1) {
	         
	            System.out.print(", " + b);

	            
	            for (int i = 2; i < terms; i++) {
	                int nextTerm = a + b;
	                System.out.print(", " + nextTerm);
	                a = b;
	                b = nextTerm;
	            }
	        }

	        System.out.println();
	    }
	}



