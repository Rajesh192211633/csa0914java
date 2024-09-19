package huuu;

public class day2q3 {
	class Base {
	    void area(int a, int b) {
	        System.out.println("Area of Square: " + (a * a));
	    }
	}

	class Derived extends Base {
	    @Override
	    void area(int a, int b) {
	        System.out.println("Area of Rectangle: " + (a * b));
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Derived obj = new Derived();
	        obj.area(4, 5);  // Rectangle
	        obj.area(4, 4);  // Square
	    }
	}


}
