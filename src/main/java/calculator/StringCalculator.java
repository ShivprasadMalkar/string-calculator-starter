package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCalculator {
	static int count = 0 ;
	List<Integer> list=new ArrayList<>();
	public int add(String input) {
		count++ ;
		int sum=0;
		
		if(input.startsWith("//")) {
    		String regex = "//(.*)\n(.*)";
    		Matcher m = Pattern.compile(regex).matcher(input);
    
    		if(!m.matches()) {
    			return -1;
    		}
    	
    		String delim =  m.group(1);
    		String s = m.group(2);
    		StringTokenizer token = new StringTokenizer(s, delim);
    		while(token.hasMoreElements()) {
    			String t = token.nextToken();
    			sum  = sum + convertToInt(t);
    		}	
    		return sum;
    	}
		
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
	    			   if (Integer.parseInt(num) > 1000) {
	    				   num="0";
	    				   sum+=Integer.parseInt(num);
	    			   }
	    			   sum += Integer.parseInt(num);
	    		   }
	    		   
	    		   return sum ;
	    	   }
	       }
	    }
	private int convertToInt(String input) {
    	int i = Integer.parseInt(input);
    	if(i < 0) {
    		list.add(i);
    		return 0;
    	}else if(i > 1000) {
    		
    		return 0;
    	}
    		return i;
    }
	
	private static String[] split(String str) {
		if (str.startsWith("//")) {
			 String delimiter = str.substring(2, 3);
             return str.substring(4).split(delimiter);
		}
		String [] nums = str.split(",|\n") ;
		return nums;
	}
	
	public int getCallCount() {
		return count;
	}
	
}

