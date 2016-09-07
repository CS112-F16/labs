import java.util.Arrays;

public class ArrayUtilitiesTester {


	public static boolean results(String testName, char[] expected, char[] actual) {
		System.out.println(testName);
		System.out.println("Expected: " + Arrays.toString(expected));
		System.out.println("Actual:   " + Arrays.toString(actual));

		boolean result = Arrays.equals(expected, actual);
		System.out.println((result?"PASS":"FAIL"));
		System.out.println("\n=============");

		return result;

	}

	public static void main(String[] args) {
		int passed = 0;
		int total = 0;

		//test reverse even
		char[] reverseEvenOriginal = {'a', 'b', 'c', 'd'};
		char[] reverseEvenExpected = {'d', 'c', 'b', 'a'};
		char[] reverseEvenActual = ArrayUtilities.reverse(reverseEvenOriginal);
		if(results("Reverse Test Even Number Elements:", reverseEvenExpected, reverseEvenActual)) passed++;
		total++;

		//test reverse odd
		char[] reverseOddOriginal = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		char[] reverseOddExpected = {'g', 'f', 'e', 'd', 'c', 'b', 'a'};
		char[] reverseOddActual = ArrayUtilities.reverse(reverseOddOriginal);
		if(results("Reverse Test Odd Number Elements:", reverseOddExpected, reverseOddActual)) passed++;
		total++;
		
		//test reverse one
		char[] reverseOneOriginal = {'a'};
		char[] reverseOneExpected = {'a'};
		char[] reverseOneActual = ArrayUtilities.reverse(reverseOneOriginal);
		if(results("Reverse Test One Element:", reverseOneExpected, reverseOneActual)) passed++;
		total++;

		//test 2d to 1d
		char[][] oneDOriginal = new char[][] {
			new char[] {'a', 'b', 'c'},
			new char[] {'e', 'd', 'f'},
			new char[] {'i', 'h', 'g'},
		};
		char[] oneDExpected = {'a', 'b', 'c', 'e', 'd', 'f', 'i', 'h', 'g'};
		char[] oneDActual = ArrayUtilities.to1D(oneDOriginal);
		if(results("2D to 1D Test:", oneDExpected, oneDActual)) passed++;
		total++;

		//test largest per row
		char[][] smallestOriginal = new char[][] {
			new char[] {'e', 'c', 'f', 'g', 'c', 'e'},
			new char[] {'b', 'b', 'b', 'b'},
			new char[] {'a', 'd'},
			new char[] {'d', 'c', 'b'},
		};
		char[] smallestExpected = {'c', 'b', 'a', 'b'};
		char[] smallestActual = ArrayUtilities.smallestPerRow(smallestOriginal);
		if(results("Largest Per Row Test:", smallestExpected, smallestActual)) passed++;
		total++;



		System.out.println("=============");
		System.out.printf("Tests Passed: %d of %d\n", passed, total);
		System.out.println("=============");
	}

}