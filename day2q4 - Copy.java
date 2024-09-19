package huuu;

public class day2q4 {
	class Sum {
	    // Method 1: Two int parameters
	    int sum(int a, int b) {
	        return a + b;
	    }

	    // Method 2: Three int parameters
	    int sum(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method 3: Two double parameters
	    double sum(double a, double b) {
	        return a + b;
	    }

	    // Method 4: Interchanging parameters
	    int sum(int b, float a) {
	        return (int) (a + b);
	    }

	    public static void main(String[] args) {
	        Sum obj = new Sum();
	        System.out.println("Sum of 2 ints: " + obj.sum(2, 3));
	        System.out.println("Sum of 3 ints: " + obj.sum(2, 3, 4));
	        System.out.println("Sum of 2 doubles: " + obj.sum(2.5, 3.5));
	        System.out.println("Sum of int and float: " + obj.sum(5, 4.5f));
	    }
	}

}
