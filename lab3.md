Lab 3
=====

### Due Friday, September 9, 2016 - 5:00pm

The goals of this assignment are to implement several programs that use the following features:

- Iteration
- `String` operations
- The `ArrayList` class

##Requirements
1. **Part 1 (20 points):** Modify the class `RockPaperScissors` from [Lab 2](https://github.com/CS112-F16/labs/blob/master/lab2.md) in the following ways:
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
	Player chooses Rock. Computer chooses Scissors.
	Player wins!
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
 
2. **Part 2 (20 points):**
  - Create a class `Word`.
      * `Word` will have one data member of type `String` called `theWord`.
      * Implement a constructor that takes as input a `String` and saves the value in the data member `theWord`.
      * Implement a method `countChar` that takes as input a `char` and returns the number of times the character appears in the data member `theWord`.  You must use a `for` loop in your implementation of this method. Use the [Java API](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) to find out more about methods of the `String` class you may use to access individual characters in a string.
      * Implement a method `matchingChars` that takes as input a `String` and returns the number of characters that appear in the same location in the input string and `theWord`, for example 'cat' and 'cow' have one matching character and 'dog' and 'horse' also have one matching character.  You must use a `while` loop in your implementation of this method.
      * Implement a method `isPalindrome` that will take no input and will return true if theWord is the same forward and backward, and false otherwise.  
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
			Is science a palindrome?: false
		
		Word: Civic
			Occurrences of 'a': 0
			Occurrences of 'i': 2
			Occurrences of 's': 0
			Occurrences of 'c': 2

			Matching characters in 'computer': 1
			Matching characters in 'spin': 0
			Matching characters in 'ample': 0
			Is Civic a palindrome?: true
      ```
3. **Part 3 (10 points):** Implement a program that provides search-and-replace functionality. Create a class `SearchAndReplace`. The logic of your program will be as follows:
  - Prompt the user for a one-word search term and save the response in a variable.
  - Prompt the user for a one-word replace term and save the response in a variable.
  - Prompt the user for a file name and save the response in a variable.
  - Open the input file with the name specified by the user.
  - Open a second, new file called `output.txt`.
  - For each line of the input file:
      * Read in the line.
      * Replace all instances of the search term with the replace term.
      * Write the line to the output file.
  


### Submission Requirements

1. For this assignment, you will submit NNN files: `RockPaperScissors.java`, `Word.java`, 

2. Make sure your code follows all requirements in the [Style Guidelines](https://github.com/CS112-F16/notes/blob/master/style.md).

3. Follow the instructions in the [SVN Guide](https://github.com/CS112-F16/notes/blob/master/svn_guide.md) for submitting your solution by the deadline.

4. Make sure you have submitted your work in an SVN directory: `https://www.cs.usfca.edu/svn/<username>/cs112/lab3`

