Lab 3
=====

### Due Monday, September 12, 2016 - 5:00pm

The goals of this assignment are to implement several programs that use the following features:

- Iteration
- `String` operations
- File input and output
- The `ArrayList` class

##Requirements
1. **Part 1 (20 points):** Create a class `RockPaperScissors`. The class will contain only the main method that will implement the rock-paper-scissors game where the user plays against the computer. The logic is as follows:
  - The computer chooses a random number between 1 and 3. 1 represents rock, 2 represents paper, 3 represents scissors.
  - The computer prompts the user for a number 1 to 3.
  - The computer prints the winner based on the following:
      * Rock (1) beats scissors (3).
      * Paper (2) beats rock (1).
      * Scissors (3) beat paper (2).
  - The following will generate a random number in Java. See [Randomize.java](https://github.com/CS112-F16/code/blob/master/LabExamples/Randomize.java) for a complete example.
      * At the top of the class `import java.util.Random;`
      * In the main method, instantiate an object of type `Random`: `Random r = new Random();`
      * Invoke the `nextInt` method: `int computerChoice = r.nextInt(3) + 1;` Note that `nextInt` generates a number between 0 (inclusive) and the parameter (exclusive). In this case, it will generate a number from 0 to 2. By adding 1 we will get a number between 1 and 3.
  - Allow the game to continue until the user enters `0` to exit.
  - If the user enters a number other than 0, 1, 2, or 3, print an error message and prompt for a new number.
  - Sample output is as follows:
	
	```
	Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit:
	5
	Invalid input.
	Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit:
	2
	Computer chooses Scissors. Player chooses Paper.
	Computer wins!
	Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit:
	1
	Player chooses Rock. Computer chooses Rock.
	It's a tie!
	Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit:
	4
	Invalid input.
	Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit:
	3
	Player chooses Scissors. Computer chooses Paper.
	Player wins!
	Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit:
	0
	Game over.
	
	```
 
2. **Part 2 (15 points):**
  - Create a class `Word`.
      * `Word` will have one data member of type `String` called `theWord`.
      * Implement a constructor that takes as input a `String` and saves the value in the data member `theWord`.
      * Implement a method `countChars` that takes as input a `char` and returns the number of times the character appears in the data member `theWord`.  You must use a `for` loop in your implementation of this method. Use the [Java API](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) to find out more about methods of the `String` class you may use to access individual characters in a string.
      * Implement a method `matchingChars` that takes as input a `String` and returns the number of characters that appear in the same location in the input string and `theWord`, for example 'cat' and 'cow' have one matching character and 'dog' and 'horse' also have one matching character.  You must use a `while` loop in your implementation of this method.
      * All methods will disregard upper versus lower case letters. Hint: consider converting the word to all lower case letters in the constructor.
  - Download the class 	[`WordDriver`](https://github.com/CS112-F16/labs/blob/master/code/WordDriver.java) and place it in your `lab3` directory. 
      * Compile both `Word.java` and `WordDriver.java` as follows `javac Word.java WordDriver.java`.
      * Fix any compiler errors. Keep in mind that your method signatures must be exactly as described above in order for `WordDriver` to compile.
      * Verify that the output of `WordDriver` is as follows:
      
	```
	lab3 srollins$ java WordDriver
	Word: science
		Occurrences of 'a': 0
		Occurrences of 'i': 1
		Occurrences of 's': 1
		Occurrences of 'c': 2

		Matching characters in 'computer': 1
		Matching characters in 'spin': 2
		Matching characters in 'ample': 0

	Word: Civic
		Occurrences of 'a': 0
		Occurrences of 'i': 2
		Occurrences of 's': 0
		Occurrences of 'c': 2

		Matching characters in 'computer': 1
		Matching characters in 'spin': 0
		Matching characters in 'ample': 0
   ```
3. **Part 3 (15 points):** Implement a program that reads the contents of a text file, stores each word in an `ArrayList`, sorts the list, then prints the contents in order smallest to largest *and* largest to smallest.
  - Create a class `Sorter.java` with only a `main` method.
  - The logic of the main method will be as follows:
      * Create a new `ArrayList` of `String` to store the words in the file.
      * Open a file called `words.txt`. You *must* use this filename.
      * Read in the file a line at a time. Assume that each line contains one word.
      * Store each line in the `ArrayList`.
      * Sort the list. You may use the following to sort the list: `Collections.sort(words);`. This assumes that `words` is the name of your `ArrayList` variable. You will also need to `import java.util.Collections;`.
      * Print the contents of the list, one word on each line, in order from smallest to largest.
      * Print the contents of the list, one word on each line, in order from largest to smallest.
  - Given the following file `words.txt`:
  
   ```
   I
   Love
   Computer
   Science
   ```
     The output of your program will be as follows:
   
   ```
   lab3 srollins$ java Sorter
   Alphabetical A-Z:
   Computer
   I
   Love
   Science
	   
   Alphabetical Z-A:
   Science
   Love
   I
   Computer
   ```

### Submission Requirements

1. For this assignment, you will submit the following files: `RockPaperScissors.java`, `Word.java`, `Sorter.java`. 

2. Make sure your code follows all requirements in the [Style Guidelines](https://github.com/CS112-F16/notes/blob/master/style.md).

3. Follow the instructions in the [SVN Guide](https://github.com/CS112-F16/notes/blob/master/svn_guide.md) for submitting your solution by the deadline.

4. Make sure you have submitted your work in an SVN directory: `https://www.cs.usfca.edu/svn/<username>/cs112/lab3`

