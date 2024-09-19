package huuu;

public class day2q2 {
	class ConstructorExample {
	    int a, b;

	    // Default constructor
	    ConstructorExample() {
	        this.a = 10;
	        this.b = 15;
	        disp();
	    }

	    // Parameterized constructor
	    ConstructorExample(int a, int b) {
	        this.a = a;
	        this.b = b;
	        disp();
	    }

	    void disp() {
	        System.out.println("a = " + a + ", b = " + b);
	    }

	    public static void main(String[] args) {
	        // Calling default constructor
	        ConstructorExample defaultConstructor = new ConstructorExample();
	        
	        // Calling parameterized constructor
	        ConstructorExample paramConstructor = new ConstructorExample(20, 25);
	    }
	}


}
