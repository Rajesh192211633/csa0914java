package huuu;
abstract class Statistics {
    abstract void total();
    abstract void average();

	

	    void mean() {
	        System.out.println("Calculating mean...");
	    }

	    void mode() {
	        System.out.println("Calculating mode...");
	    }

	    void median() {
	        System.out.println("Calculating median...");
	    }
	}

	class DerivedStatistics extends Statistics {
	    @Override
	    void total() {
	        System.out.println("Calculating total...");
	    }

	    @Override
	    void average() {
	        System.out.println("Calculating average...");
	    }
	}

	public class day2q5 {
	    public static void main(String[] args) {
	        DerivedStatistics stats = new DerivedStatistics();
	        stats.total();
	        stats.average();
	        stats.mean();
	        stats.mode();
	        stats.median();
	    }
	}


