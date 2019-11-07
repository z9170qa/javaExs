package morseBoi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Morseee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		     String morseTranslator(String input) {
		        Map<String, String> morseMap = new HashMap<>();
		        morseMap.put(".-", "a");
		        morseMap.put("-...", "b");
		        morseMap.put("-.-.", "c");
		        morseMap.put("-..", "d");
		        morseMap.put(".", "e");
		        morseMap.put("..-.", "f");
		        morseMap.put("--.", "g");
		        morseMap.put("....", "h");
		        morseMap.put("..", "i");
		        morseMap.put(".---", "j");
		        morseMap.put("-.-", "k");
		        morseMap.put(".-..", "l");
		        morseMap.put("--", "m");
		        morseMap.put("-.", "n");
		        morseMap.put("---", "o");
		        morseMap.put(".--.", "p");
		        morseMap.put("--.-", "q");
		        morseMap.put(".-.", "r");
		        morseMap.put("...", "s");
		        morseMap.put("-", "t");
		        morseMap.put("..-", "u");
		        morseMap.put("...-", "v");
		        morseMap.put(".--", "w");
		        morseMap.put("-..-", "x");
		        morseMap.put("-.--", "y");
		        morseMap.put("--..", "z");

		        morseMap.put("-----", "0");
		        morseMap.put(".----", "1");
		        morseMap.put("..---", "2");
		        morseMap.put("...--", "3");
		        morseMap.put("....-", "4");
		        morseMap.put(".....", "5");
		        morseMap.put("-....", "6");
		        morseMap.put("--...", "7");
		        morseMap.put("---..", "8");
		        morseMap.put("----.", "9");

		        morseMap.put("/", " ");

		        String morseArray = Arrays.stream(input.split(" "))
		        .map(n->morseMap.get(n).toUpperCase())
		        .collect(Collectors.joining(""));

		        return morseArray;
		        
		    }
		

			



	}

}
