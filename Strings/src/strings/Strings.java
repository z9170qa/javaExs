package strings;

public class Strings {
	public static void main(String[] args) {
		String str = "Guten tag mein fuhrer";
		String boop = "Boopedy boop";
		// Returns length
		str.length();
		// Adds strings together
		str.concat(boop);
		// Returns if string contains text
		str.equals("Guten tag meing fuhrer");
		// Returns string index of number, char, string
		// Returns -1 if invalid
		str.indexOf("Go");
		// Returns character at string index
		str.charAt(0);
		// Converts the string to upper case
		str.toUpperCase();
		// Converts the string to lower case
		str.toLowerCase();
		// Creates a new string from index i onwards
		str.substring(5);
		// Creates a new string from original string's index range
		// Lower bound inclusive, upper bound exclusive
		str.substring(0, 5);
		// Turns the string in to a character Array
		char[] bleh = str.toCharArray();
		// Converts a data type/object to a String
		str.toString();
		// Finds if string begins with the thing
		str.startsWith("boop");
		// Finds if string ends with the thing
		str.endsWith("boop");
		// Escape characters - place \ (backslash) before character you want to escape
		String woop = "\"Woop woop\"";
		// Tests if 2 strings are equal irrespective of character case
		"name".equalsIgnoreCase("NAME");
		// Removes whitespace at either end of the string
		str.trim();
		// Creates array of strings, split by spaces
		String[] scooby = str.split(" ");
		// Replaces all of something in a string with something else
		str.replaceAll(" ", ",");
		// Tests if a string contains input
		str.contains("Are you my mummy?");
		
		
		
//		public String doubleChar(String str) {
//			 String result = "";
//
//			  for ( int i = 0; i < str.length(); i++ )
//			  {
//			    result = result + str.charAt( i ) + str.charAt( i );
//			  }
//
//			  return result;
//			}
	}
}
