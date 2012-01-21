package fr.craftinglabs.dojo.numbertolcd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberToLCD {
	
	public static String convert(int number) {
		List<StringForLineType[]> linesForDigits = linesForDigits(number);
		String[] stringLines = combine(linesForDigits);
		String converted = join(stringLines);
    	
	    return converted;
	}

	private static String join(String[] stringLines) {
		String converted = "";
				
    	for(int i = 0; i < 5; i++) {
	        converted += stringLines[i] + "\n";
    	}
    	
		return converted;
	}

	private static String[] combine(List<StringForLineType[]> linesFor) {
		String[] stringLines = {"", "", "", "", ""};
		
		String space = "";
		
		for(StringForLineType[] stringFor : linesFor) {
			for (int i = 0; i < 5; i ++) {
				stringLines[i] += space + stringFor[i];
			}
			
			space = " ";
		}
		
		return stringLines;
	}

	private static List<StringForLineType[]> linesForDigits(int number) {
		List<StringForLineType[]> linesFor;
		linesFor = new ArrayList<NumberToLCD.StringForLineType[]>();
		
		String stringNumber = Integer.toString(number);
		
		for (int i = 0; i < stringNumber.length(); i++) {
			linesFor.add(linesForDigits.get(Integer.valueOf(String.valueOf(stringNumber.charAt(i)))));
		}
		
		return linesFor;
	}
	
	static StringForLineType[] linesForDigitOne = 
		{StringForLineType.BLANK,
		 StringForLineType.RIGHT,
		 StringForLineType.BLANK, 
		 StringForLineType.RIGHT,
		 StringForLineType.BLANK};
	
	static StringForLineType[] linesForDigitTwo =
		{ StringForLineType.MIDDLE,
		  StringForLineType.RIGHT,
		  StringForLineType.MIDDLE,
		  StringForLineType.LEFT,
		  StringForLineType.MIDDLE };
	
	static StringForLineType[] linesForDigitThree =
		{ StringForLineType.MIDDLE,
		  StringForLineType.RIGHT,
		  StringForLineType.MIDDLE,
		  StringForLineType.RIGHT,
		  StringForLineType.MIDDLE };
	
	static StringForLineType[] linesForDigitFour =
		{ StringForLineType.BLANK,
		  StringForLineType.BOTH,
		  StringForLineType.MIDDLE,
		  StringForLineType.RIGHT,
		  StringForLineType.BLANK };
	
	static StringForLineType[] linesForDigitFive =
		{ StringForLineType.MIDDLE,
		  StringForLineType.LEFT,
		  StringForLineType.MIDDLE,
		  StringForLineType.RIGHT,
		  StringForLineType.MIDDLE };
	
	static StringForLineType[] linesForDigitSix =
		{ StringForLineType.MIDDLE,
		  StringForLineType.LEFT,
		  StringForLineType.MIDDLE,
		  StringForLineType.BOTH,
		  StringForLineType.MIDDLE };
	
	static StringForLineType[] linesForDigitSeven =
		{ StringForLineType.MIDDLE,
		  StringForLineType.RIGHT,
		  StringForLineType.BLANK,
		  StringForLineType.RIGHT,
		  StringForLineType.BLANK };

	static StringForLineType[] linesForDigitEight =
		{ StringForLineType.MIDDLE,
		  StringForLineType.BOTH,
		  StringForLineType.MIDDLE,
		  StringForLineType.BOTH,
		  StringForLineType.MIDDLE };

	static StringForLineType[] linesForDigitNine =
		{ StringForLineType.MIDDLE,
		  StringForLineType.BOTH,
		  StringForLineType.MIDDLE,
		  StringForLineType.RIGHT,
		  StringForLineType.MIDDLE };

	static StringForLineType[] linesForDigitZero =
		{ StringForLineType.MIDDLE,
		  StringForLineType.BOTH,
		  StringForLineType.BLANK,
		  StringForLineType.BOTH,
		  StringForLineType.MIDDLE };

	
	static Map<Integer, StringForLineType[]> linesForDigits = new HashMap<Integer, StringForLineType[]>();
	static {
		linesForDigits.put(1, linesForDigitOne);
		linesForDigits.put(2, linesForDigitTwo);
		linesForDigits.put(3, linesForDigitThree);
		linesForDigits.put(4, linesForDigitFour);
		linesForDigits.put(5, linesForDigitFive);
		linesForDigits.put(6, linesForDigitSix);
		linesForDigits.put(7, linesForDigitSeven);
		linesForDigits.put(8, linesForDigitEight);
		linesForDigits.put(9, linesForDigitNine);
		linesForDigits.put(0, linesForDigitZero);
	}
	
	enum StringForLineType {
		BLANK ("   "),
		LEFT  ("|  "),
		RIGHT ("  |"),
		BOTH  ("| |"),
		MIDDLE(" - ");
		
		private String line = "";
		
		StringForLineType(String line) {
			this.line = line;
		}
		
		public String toString() {
			return this.line;
		}
	}
}