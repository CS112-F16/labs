Lab 2
=====

### Due Friday, September 2, 2016 - 5:00pm

The goal of this assignment is to practice implementing programs that use the following elements:

- Classes
- Command line input and output
- Mathematical operations
- Conditional operations


##Requirements
1. **Part 1 (15 points)**: 
  - Create a class `Pokemon`. 
      * A `Pokemon` has the following data members:
          * `species` - a `String` denoting the species of the pokemon, e.g., Zubat
          * `experience` - an `int` denoting the pokemon's base experience points, e.g., 137
          * `favorite` - a `boolean` denoting whether the pokemon has been starred as a favorite
      * Implement two constructors:
          * A constructor that takes as input `name`, `experience`, and `favorite`.
          * A constructor that takes as input `name` and `experience` and sets `favorite` to be a default value.
      * Implement get and set methods for every data member. 
      * Implement a `toString` method that prints a nicely formatted string describing the pokemon, e.g., "Zubat with Experience 137 - Starred" or "Oddish with Experience 220 - Not Starred".
  - Create a class `PokemonDriver`. 
      * Instantiate **three** different `Pokemon`, each with a different name and base experience. At least one should be favorited and at least one should not be favorited. 
      * Use the `toString` method to print the information about each object.
2. **Part 2 (10 points)**: Create a class `AppleOrange`. The class will contain only a main method that will implement the following logic as efficiently as possible:
  - Prompt the user for a number between 1 and 100.
  - If the number is divisible by 3 print *apple*.
  - If the number is divisible by 7 print *orange*.
  - If the number is divisible by 3 and 7 print *appleorange*.
  - If the number is out of range print *banana*.
  - In all other cases simply print the number.
3. **Part 3 (15 points)**: Create a class `RockPaperScissors`. The class will contain only the main method that will implement the rock-paper-scissors game where the user plays against the computer. The logic is as follows:
  - The computer chooses a random number between 1 and 3. 1 represents rock, 2 represents paper, 3 represents scissors.
  - The computer prompts the user for a number 1 to 3.
  - The computer prints the winner based on the following:
      * Rock (1) beats scissors (3).
      * Paper (2) beats rock (1).
      * Scissors (3) beat paper (2).
  - If the user chooses a number other than 1, 2, or 3, print an error and indicate the game is over.
  - The following will generate a random number in Java. See [Randomize.java](https://github.com/CS112-F16/code/blob/master/LabExamples/Randomize.java) for a complete example.
      * At the top of the class `import java.util.Random;`
      * In the main method, instantiate an object of type `Random`: `Random r = new Random();`
      * Invoke the `nextInt` method: `int computerChoice = r.nextInt(3) + 1;` Note that `nextInt` generates a number between 0 (inclusive) and the parameter (exclusive). In this case, it will generate a number from 0 to 2. By adding 1 we will get a number between 1 and 3.
  - Sample output of your program should look as follows:
  
	```
  	Enter 1 (Rock), 2 (Paper), or 3 (Scissors):
	4
	Invalid choice! Game over.
	```
	or
	
	```
	Enter 1 (Rock), 2 (Paper), or 3 (Scissors):
	1
	Player chooses Rock. Computer chooses Scissors.
 	```
 	or
 	
 	```
 	Enter 1 (Rock), 2 (Paper), or 3 (Scissors):
	1
	It's a tie!
	```
4. **Part 4 (10 points)**: Create a class `CooksHelper` that will convert tablespoons to cups. The class will contain only a main method that will implement the following logic:
  - Prompt the user for the number of tablespoons.
  - Convert tablespoons to cups.
      * One cup is equal to 16 tablespoons.
  - Sample output will look as follows:

		```
		Enter number of Tablespoons: 
		18
		18 tablespoons is equal to 1.125 cups.
		``` 

		```
		Enter number of Tablespoons: 
		4
		4 tablespoons is equal to 0.25 cups.
		```
 
 
### Submission Requirements

1. For this assignment, you will submit the following files: `Pokemon.java`, `PokemonDriver.java`, `AppleOrange.java`, `RockPaperScissors.java`, and `CooksHelper.java`.

2. Make sure your code follows all requirements in the [Style Guidelines](https://github.com/CS112-F16/notes/blob/master/style.md).

3. Follow the instructions in the [SVN Guide](https://github.com/CS112-F16/notes/blob/master/svn_guide.md) for submitting your solution by the deadline.

4. Make sure you have submitted your work in an SVN directory: ```https://www.cs.usfca.edu/svn/<username>/cs112/lab2```

