package calculator;

class StringCalculator {

	public int add(String input) {
		int sum=0;
	       if(input.isEmpty())
	    	    return 0;
	       else {
	    	   if(input.length()==1) 
	    	   		return Integer.parseInt(input);
	    	   else {
	    		   String[] nums = StringCalculator.split(input);
	    		   for (String num : nums) {
	    			   sum += Integer.parseInt(num);
	    		   }
	    		   return sum ;
	    	   }
	       }
	    }

	private static String[] split(String str) {
		String [] nums = str.split(",") ;
		return nums;
	}
	
}

