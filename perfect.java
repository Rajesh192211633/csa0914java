package huuu;
import java.util.Scanner;
public class perfect {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        scanner.close();

	        
	        if (isPerfectNumber(num)) {
	            System.out.println(num + " is a perfect number.");
	        } else {
	            System.out.println(num + " is not a perfect number.");
	        }
	    }

	    
	    public static boolean isPerfectNumber(int num) {
	        if (num <= 1) {
	            return false; 
	        }

	        int sum = 0;
	        
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }

	      
	        return sum == num;
	    }
	}



