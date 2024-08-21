package huuu;

public class febonic {

	    public static void main(String[] args) {
	        int n = 4;  // Example input
	        int a = 0, b = 1, sum = 0;

	        for (int i = 0; i <= 2 * n; i++) {
	            if (i % 2 == 0) {
	                sum += a;  // Add only even-indexed terms
	            }
	            int next = a + b;
	            a = b;
	            b = next;
	        }

	        System.out.println("Sum of even-indexed Fibonacci numbers: " + sum);
	    }
	}









