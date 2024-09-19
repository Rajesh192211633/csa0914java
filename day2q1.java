package huuu;


	class Parent {
	    void even() {
	        System.out.println("Parent Class - Even Numbers (1 to 20):");
	        for (int i = 1; i <= 20; i++) {
	            if (i % 2 == 0) System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    void odd() {
	        System.out.println("Parent Class - Odd Numbers (1 to 20):");
	        for (int i = 1; i <= 20; i++) {
	            if (i % 2 != 0) System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    void prime() {
	        System.out.println("Parent Class - Prime Numbers (1 to 20):");
	        for (int i = 2; i <= 20; i++) {
	            if (isPrime(i)) System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    boolean isPrime(int num) {
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	}

	class Child extends Parent {
	    @Override
	    void even() {
	        System.out.println("Child Class - Even Numbers (1 to 30):");
	        for (int i = 1; i <= 30; i++) {
	            if (i % 2 == 0) System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    @Override
	    void odd() {
	        System.out.println("Child Class - Odd Numbers (1 to 30):");
	        for (int i = 1; i <= 30; i++) {
	            if (i % 2 != 0) System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    @Override
	    void prime() {
	        System.out.println("Child Class - Prime Numbers (1 to 30):");
	        for (int i = 2; i <= 30; i++) {
	            if (isPrime(i)) System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}

	public class day2q1 {
	    public static void main(String[] args) {
	        Child child = new Child();
	        child.even();
	        child.odd();
	        child.prime();
	    }
	}



