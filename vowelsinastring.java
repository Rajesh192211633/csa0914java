package huuu;
import java.util.Scanner;
public class vowelsinastring {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a statement: ");
	        String statement = scanner.nextLine();
	        scanner.close();

	      
	        int vowelCount = countVowels(statement);
	        System.out.println("Number of vowels in the statement: " + vowelCount);
	    }

	   
	    public static int countVowels(String statement) {
	        int count = 0;
	      
	        statement = statement.toLowerCase();

	        
	        for (int i = 0; i < statement.length(); i++) {
	            char ch = statement.charAt(i);
	          
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }

	        return count;
	    }
	}

	


