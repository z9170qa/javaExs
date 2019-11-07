package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		int inputLength = input.length();
		char ch;
		StringBuilder multCharString = new StringBuilder(inputLength * 3);
		for (int i = 0; i < inputLength; i++) {
			ch = input.charAt(i);
			multCharString.append(ch);
			multCharString.append(ch);
			multCharString.append(ch);
		}
		return multCharString.toString();
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		int bertFirst = input.indexOf("bert");
		int bertLast = input.lastIndexOf("bert");
		if (bertFirst != -1 && bertLast != -1 && bertFirst != bertLast) {
			String inBert = input.substring(bertFirst + 4, bertLast);
			StringBuilder rev = new StringBuilder(inBert.length()); 
		return rev.reverse().toString();}
		else {
			return null;
		}
	}
	

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		int len = input.length();
		int len_2 = len/2;
		String first = input.substring(0, len_2 - a);
		String last = input.substring(len - a, len);
		return first + last;
		
			
			
		}
		
		

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		
		
		String inputCase = input.toLowerCase();
		int len = inputCase.length();
		if (len>=3)
			return (inputCase.substring(inputCase.length()-3).equals("dev"));
		return false;
	}
		
//		if ((inputCase.charAt(len - 1) == 'v') && (inputCase.charAt(len - 2) == 'e') && (inputCase.charAt(len - 3) == 'd'));
//		return true;
		


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		
		int len = input.length();
		int block = 1;
		int blockMax = 0;
		char ch;
		char chCurrent;
		if (len == 0)
			return 0;
		ch = input.charAt(0);
		for (int i=0; i<len; i++) {
			chCurrent = input.charAt(i);
			if (ch == chCurrent) 
				block++;
			else {
				if (block > blockMax)
						blockMax = block;
					block = 1;
					ch = chCurrent;
				}
		}
		if (block > blockMax)
			blockMax = block;
		return blockMax;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String str) {

		String strLowCase = str.toLowerCase();
		int len = strLowCase.length() - 1;
		int count = 0;
		for (int i = 0; i < len; i++) {
			String sLC = strLowCase.substring(i, i+2);
			if ((sLC.equals("am") && sLC.charAt(i+2) == ' ' && sLC.charAt(i-1) == ' '))count++; 
			if (strLowCase.startsWith("am ")) count++;
			if (strLowCase.endsWith(" am")) count++;
		}
		
		return count;
	}

	// if (strLowCase.charAt(i) == 'a' && strLowCase.charAt(i + 1) == 'm') {
	// if (strLowCase.charAt(i - 1) == ' ' && strLowCase.charAt(i + 2) == ' ') {
	// count++;

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int num) {
		String str = null;
		if (num % 3 == 0 && num % 5 == 0) {
			str = "fizzbuzz";
		} else if (num % 5 == 0) {
			str = "buzz";
		} else if (num % 3 == 0) {
			str = "fizz";
		}
		return str;
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		  int sum = 0;
		 	int lim = arg1.length();
		  char ch;
		  for(int i = 0; i < lim; i++) {
		  	ch = arg1.charAt(i);
				if(Character.isDigit(ch)) {
					//wanted something to say then split each digit and add the individual numbers
				}
			}
			return sum;
		}

}
	

