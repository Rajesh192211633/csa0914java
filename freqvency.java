package huuu;
import java.util.HashMap;
import java.util.Map;
public class freqvency {
	

	
	    public static void main(String[] args) {
	       
	        int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};

	        
	        printFrequency(array);
	    }

	   
	    public static void printFrequency(int[] array) {
	        
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        
	        for (int num : array) {
	            if (frequencyMap.containsKey(num)) {
	                frequencyMap.put(num, frequencyMap.get(num) + 1);
	            } else {
	                frequencyMap.put(num, 1);
	            }
	        }

	      
	        System.out.println("Element | Frequency");
	        System.out.println("--------------------------");

	      
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.printf("%-8d | %-9d%n", entry.getKey(), entry.getValue());
	        }
	    }
	}



