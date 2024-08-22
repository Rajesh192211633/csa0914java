package huuu;

public class compositeinarray {
	
	    public static void main(String[] args) {
	        int a = 10; // Starting value (inclusive)
	        int b = 30; // Ending value (inclusive)

	        System.out.println("Composite numbers between " + a + " and " + b + ":");

	        // Loop through all numbers between a and b
	        for (int i = a; i <= b; i++) {
	            if (isComposite(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    // Method to check if a number is composite
	    public static boolean isComposite(int num) {
	        // A number is composite if it's greater than 1 and has divisors other than 1 and itself
	        if (num <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return true; // num has a divisor other than 1 and itself
	            }
	        }

	        return false; // num is prime or 1, so it's not composite
	    }
	}



