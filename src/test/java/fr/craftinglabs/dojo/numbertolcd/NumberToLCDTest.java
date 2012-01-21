package fr.craftinglabs.dojo.numbertolcd;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToLCDTest {

	@Test
	public void convert1Test() {
		String expected = "   \n"  
				        + "  |\n"
				        + "   \n"
				        + "  |\n"
				        + "   \n";
		
		assertEquals(expected, NumberToLCD.convert(1));
	}

	@Test
	public void convert2Test() {
		String expected = " - \n"  
				        + "  |\n"
				        + " - \n"
				        + "|  \n"
				        + " - \n";
		
		assertEquals(expected, NumberToLCD.convert(2));
	}

	@Test
	public void convert3Test() {
		String expected = " - \n"  
				        + "  |\n"
				        + " - \n"
				        + "  |\n"
				        + " - \n";
		
		assertEquals(expected, NumberToLCD.convert(3));
	}

	@Test
	public void convert4Test() {
		String expected = "   \n"  
				        + "| |\n"
				        + " - \n"
				        + "  |\n"
				        + "   \n";
		
		assertEquals(expected, NumberToLCD.convert(4));
	}

	@Test
	public void convert5Test() {
		String expected = " - \n"  
				        + "|  \n"
				        + " - \n"
				        + "  |\n"
				        + " - \n";
		
		assertEquals(expected, NumberToLCD.convert(5));
	}

	@Test
	public void convert6Test() {
		String expected = " - \n"  
				        + "|  \n"
				        + " - \n"
				        + "| |\n"
				        + " - \n";
		
		assertEquals(expected, NumberToLCD.convert(6));
	}

	@Test
	public void convert7Test() {
		String expected = " - \n"  
				        + "  |\n"
				        + "   \n"
				        + "  |\n"
				        + "   \n";
		
		assertEquals(expected, NumberToLCD.convert(7));
	}

	@Test
	public void convert8Test() {
		String expected = " - \n"  
				        + "| |\n"
				        + " - \n"
				        + "| |\n"
				        + " - \n";
		
		assertEquals(expected, NumberToLCD.convert(8));
	}

	@Test
	public void convert9Test() {
		String expected = " - \n"
				        + "| |\n"
				        + " - \n"
				        + "  |\n"
				        + " - \n";
		
		assertEquals(expected, NumberToLCD.convert(9));
	}

	@Test
	public void convert0Test() {
		String expected = " - \n"
				        + "| |\n"
				        + "   \n"
				        + "| |\n"
				        + " - \n";
		
		assertEquals(expected, NumberToLCD.convert(0));
	}

	
	@Test
	public void convert15Test() {
		String expected = "     - \n"  
				        + "  | |  \n"
				        + "     - \n"
				        + "  |   |\n"
				        + "     - \n";
		
		assertEquals(expected, NumberToLCD.convert(15));
	}
	
}
