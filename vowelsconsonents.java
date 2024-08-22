package huuu;
import java.util.Scanner;
public class vowelsconsonents {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter a word: ");
	        String word = scanner.nextLine();
	        scanner.close();

	      
	        separateVowelsAndConsonants(word);
	    }

	  
	    public static void separateVowelsAndConsonants(String word) {
	        StringBuilder vowels = new StringBuilder();
	        StringBuilder consonants = new StringBuilder();

	        
	        word = word.toLowerCase();

	    
	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);

	            
	            if (Character.isLetter(ch)) {
	               
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels.append(ch).append(" ");
	                } else {
	                    consonants.append(ch).append(" ");
	                }
	            }
	        }

	     
	        System.out.println("Vowels: " + vowels.toString().trim());
	        System.out.println("Consonants: " + consonants.toString().trim());
	    }
	}



