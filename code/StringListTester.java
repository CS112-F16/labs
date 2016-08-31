
public class StringListTester {

	private StringList sl;
	
	public StringListTester() {
		this.sl = new StringList(5);
	}
	
	public void addTests() {
		//add some new items
		sl.add("A");
		sl.add("B");
		sl.add("C");
		sl.add("D");
		sl.add("E");
		System.out.println("EXPECTED: {A, B, C, D, E}");
		System.out.println("ACTUAL:" + sl + "\n");
		
		//adding 6th element to make sure resizing happens correctly.
		sl.add("F");
		System.out.println("EXPECTED: {A, B, C, D, E, F}");
		System.out.println("ACTUAL:" + sl + "\n");

		//testing add(index, string); with index too large
		System.out.println("EXPECTED: Error message - index too large");
		try {
			sl.add(7, "G");
		} catch(Exception e) {
			System.out.println(" EXPECTED: IndexOutOfBoundsException");
			System.out.println(e.getClass());			
		}
		System.out.println("EXPECTED: {A, B, C, D, E, F}");
		System.out.println("ACTUAL:" + sl + "\n");

		//testing add to end with add(index, string); 
		sl.add(6, "G");
		System.out.println("EXPECTED: {A, B, C, D, E, F, G}");
		System.out.println("ACTUAL:" + sl + "\n");
		
		//testing add to middle with add(index, string); 
		//H should appear between C and D
		sl.add(3, "H");
		System.out.println("EXPECTED: {A, B, C, H, D, E, F, G}");		
		System.out.println("ACTUAL:" + sl + "\n");
		
		//testing add to beginning with add(index, string); 
		//I should appear before A
		sl.add(0, "I");
		System.out.println("EXPECTED: {I, A, B, C, H, D, E, F, G}");		
		System.out.println("ACTUAL:" + sl + "\n");

	}
	

	public void containsEmptySizeTest1() {
		System.out.println("CURRENT LIST: " + sl.toString());
		//testing result of true from contains
		System.out.println("\tCONTAINS STRING \"A\"? " + sl.contains("A") + " EXPECTED: true");		
		//testing result of false from contains
		System.out.println("\tCONTAINS STRING \"Z\"? " + sl.contains("Z") + " EXPECTED:false");	
		//testing nonempty list
		System.out.println("\tIS EMPTY? " + sl.isEmpty() + " EXPECTED: false");
		//testing size of greater than 0
		System.out.println("\tSIZE: " + sl.size() + " EXPECTED: 9\n");
	}
	
	public void containsEmptySizeTest2() {
		System.out.println("CURRENT LIST: " + sl.toString());
		//testing result of false from contains
		System.out.println("\tCONTAINS STRING \"A\"? " + sl.contains("A") + " EXPECTED: false");		
		System.out.println("\tCONTAINS STRING \"Z\"? " + sl.contains("Z") + " EXPECTED:false");		
		//testing empty list
		System.out.println("\tIS EMPTY? " + sl.isEmpty() + " EXPECTED: true");
		//testing list of size 0
		System.out.println("\tSIZE: " + sl.size() + " EXPECTED: 0\n");
	}
	
	public void indexOfTest() {
		//add a new repeated element
		sl.add(4, "I");
		sl.add("I");
		System.out.println("CURRENT LIST: " + sl.toString());
		//testing item found in middle
		System.out.println("\tINDEX OF B: " + sl.indexOf("B") + " EXPECTED: 2");
		//testing repeated item found at beginnign
		System.out.println("\tINDEX OF I: " + sl.indexOf("I") + " EXPECTED: 0");
		//testing nonexistent item
		System.out.println("\tINDEX OF Z: " + sl.indexOf("Z") + " EXPECTED: -1");
		//testing item found in middle
		System.out.println("\tLAST INDEX OF E: " + sl.lastIndexOf("E") + " EXPECTED: 7");
		//testing repeated item found at end
		System.out.println("\tLAST INDEX OF I: " + sl.lastIndexOf("I") + " EXPECTED: 10");
		//testing nonexistent item
		System.out.println("\tLAST INDEX OF Z: " + sl.lastIndexOf("Z") + " EXPECTED: -1\n");				
	}
	
	public void getSetTest() {
		
		System.out.println("CURRENT LIST: " + sl.toString());
		//testing item found
		System.out.println("\tGET 5: " + sl.get(5) + " EXPECTED: H");
		//testing item not found
		try {
			System.out.print("\tGET 20: ");
			sl.get(20);
		} catch(Exception e) {
			System.out.println(" EXPECTED: IndexOutOfBoundsException");
			System.out.println(e.getClass());
		}
		//testing valid index
		System.out.println("\tSET 5, \"Z\": " + sl.set(5, "Z") + " EXPECTED: H");
		//testing invalid index
		try {
			System.out.print("\tSET 20, \"Z\": ");
			sl.set(20, "Z");
		} catch(Exception e) {
			System.out.println(" EXPECTED: IndexOutOfBoundsException");
			System.out.println(e.getClass());
		}
		System.out.println();
	}
	
	public void removeTests() {
		
		System.out.println("CURRENT LIST: " + sl.toString());
		//testing removal of first item
		System.out.println("\tREMOVE 0: " + sl.remove(0) + " EXPECTED: I");
		//testing invalid index
		try {
			System.out.print("\tREMOVE 20: ");
			sl.remove(20);
		} catch(Exception e) {
			System.out.println(" EXPECTED: IndexOutOfBoundsException");
			System.out.println(e.getClass());
		}
		//testing removal of last item
		System.out.println("\tREMOVE 9: " + sl.remove(9) + " EXPECTED: I");		
		//testing removal of item in middle
		System.out.println("\tREMOVE 1: " + sl.remove(1) + " EXPECTED: B");
		System.out.println("CURRENT LIST: " + sl.toString() + " EXPECTED: {A, C, I, Z, D, E, F, G}");
		//testing removal of item that exists
		System.out.println("\tREMOVE C: " + sl.remove("C") + " EXPECTED: true");
		//testing removal of item not found
		System.out.println("\tREMOVE X: " + sl.remove("X") + " EXPECTED: false");
		
		for(int i = 0; !sl.isEmpty(); i++) {
			sl.remove(0);
		}
		System.out.println("CURRENT LIST: " + sl.toString() + " EXPECTED: {}\n");
		
		
		
	}
	
	public static void main(String[] args) {
		StringListTester slt = new StringListTester();
		slt.addTests();
		slt.containsEmptySizeTest1();
		slt.indexOfTest();
		slt.getSetTest();
		slt.removeTests();
		slt.containsEmptySizeTest2();
	}

}
