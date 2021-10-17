package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

	public int add(String input) {
		int sum=0;
		
		List<Integer> list=new ArrayList<>();
		if(input.isEmpty()) {
		}
		
	       if(input.isEmpty())
	    	    return 0;
	       else {
	    	   if(input.length()==1) 
	    	   		return Integer.parseInt(input);
	    	   else {
	    		   String[] nums = StringCalculator.split(input);
	    		   for (String num : nums) {
	    			   if (Integer.parseInt(num) < 0) {
	    	             //   throw new RuntimeException("negatives not allowed " +num);
	    				 list.add(Integer.parseInt(num));
	    			   }
	    			   
	    			   sum += Integer.parseInt(num);
	    		   }
	    		   return sum ;
	    	   }
	       }
	    }

	private static String[] split(String str) {
		if (str.startsWith("//")) {
			 String delimiter = str.substring(2, 3);
             return str.substring(4).split(delimiter);
		}
		String [] nums = str.split(",|\n") ;
		return nums;
	}
	
}

