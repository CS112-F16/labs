/**
	A program to test the Word class for lab assignment 3.

	@author Sami Rollins	
 **/
public class WordDriver {

	/**
		Takes as input a String, creates an object of type Word, and 
		invokes the methods of the Word object.
	 **/
	public static void testWord(String wordStr) {		
		Word word = new Word(wordStr);

		System.out.println("Word: " + wordStr);

		System.out.println("\tOccurrences of \'a\': " + word.countChars('a'));
		System.out.println("\tOccurrences of \'i\': " + word.countChars('i'));
		System.out.println("\tOccurrences of \'s\': " + word.countChars('s'));
		System.out.println("\tOccurrences of \'c\': " + word.countChars('c'));

		System.out.println(); //print a blank line

		String toMatch = "computer";
		System.out.println("\tMatching characters in \'" + toMatch + "\': " + word.matchingChars(toMatch));		
		
		toMatch = "spin";
		System.out.println("\tMatching characters in \'" + toMatch + "\': " + word.matchingChars(toMatch));		

		toMatch = "ample";
		System.out.println("\tMatching characters in \'" + toMatch + "\': " + word.matchingChars(toMatch));		

	}

	/**
		Main logic of the test program.
	**/
	public static void main(String[] args) {
		testWord("science");
		System.out.println(); //print a blank line
		testWord("Civic");
	}

}