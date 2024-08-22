package huuu;

public class specialchar {
	    public static void main(String[] args) {
	        
	        String input = "Hello, World! @2024 #Java$";

	        
	        StringBuilder specialChars = new StringBuilder();
	        int specialCharCount = 0;

	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            
	           
	            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
	                specialChars.append(ch);
	                specialCharCount++;
	            }
	        }

	       
	        System.out.println("Special characters: " + specialChars.toString());

	        
	        System.out.println("Number of special characters: " + specialCharCount);
	    }
	}



