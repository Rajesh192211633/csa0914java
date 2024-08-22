package huuu;

public class addmat {

	    public static void main(String[] args) {
	       
	        int[][] a = {{1, 1}, {1, 1}};
	        int[][] b = {{1, 1}, {1, 1}};
	        int[][] c = new int[2][2];
	        
	        int rows = a.length; 
	        int cols = a[0].length;
	        
	     
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                c[i][j] = a[i][j] + b[i][j];
	            }
	        }
	        
	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(c[i][j]+" ");
	            }
	            System.out.println(); 
	        }
	    }
}
	
	
