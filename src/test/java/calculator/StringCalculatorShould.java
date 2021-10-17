package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	StringCalculator calculator= new StringCalculator();
	
    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    public void addTwoNumberIsSumOfNumbers() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }
    
    @Test
    public void add_Unknown_Number_Is_Sum_Of_Numbers() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(19, calculator.add("1,2,7,9,"));
    }
    
    @Test  //5
	public void string_with_new_line_as_delimeter() throws Exception
	{
		assertEquals(6, calculator.add("1\n2,3"));
	}
    
    @Test  //6
    public void string_with_different_delimiter() {
    	
    	assertEquals(3, calculator.add("//;\n1;2"));
   }
    
    @Test  //7
    public void string_with_negative_number() {
   	 try {
			 calculator.add("//;\\n1;-2;5");
		} catch (RuntimeException e) {
			//assertEquals("Negatives not allowed [-7]", e.getMessage());
			e.getMessage();
		}
   }
    
	@Test //8
	public void multiple_Negative_Numbers() throws Exception {
		try {
			calculator.add("-1,-2,3");
		}
		catch(Exception e){
			assertEquals("negatives not allowed [-1, -2]", e.getMessage());
		}
	}
}
