Lab 7
=====

### Due Friday, November 11, 2016 - 5:00pm

The goal of this assignment is to implement programs using recursion and the `HashMap` class.

##Requirements
1. **Part 1 (15 points):** 
  - Implement a class `PalindromeTester`. It will be run as follows: `java PalindromeTester <word>`, for example `java PalindromeTester racecar`. 
 - The `main` method will print the word and whether it is or is not a palindrome, for example, `racecar is a palindrome` or `computer is not a palindrome`.
 - The class must have a *recursive* method `public static boolean isPalindrome(String word)`. The method takes as input a word and returns `true` if it is a palindrome and `false` otherwise. The method will be called from `main` and may not use any loops.
 - The method will print *an appropriate* usage message and exit if the parameter is not provided.

2. **Part 2 (20 points):** 
 - Implement a class `FileFinder`. It will be run as follows: `java FileFinder <absolute_path>`, for example `java FileFinder /Users/srollins/teaching/cs112`.
 - The `main` method will call a method `public static HashMap<String, Integer> findFiles(String directory)` and then print the contents of the `HashMap`. The `HashMap` will map `String` objects representing file extensions (e.g., jpg or doc) to a count of the number of files found with that extension.
 - The `findFiles` method takes as input a `String` representing the absolute path to a directory and *recursively* traverses the directory and all directories below it. It returns a `HashMap` that maps file *extensions* to a count of the number of files found with that extension.
 - You will need create a helper method.
 - Remember that if you pass a `HashMap` to a method any changes made by the method will be made to the original map.
 - Consider using the `String` methods `lastIndexOf` and `substring`.

2. **Part 3 (15 points):** 
  - Implement a class `NumberPrinter`. It will be run as follows: `java NumberPrinter <int>`, for example `java NumberPrinter 3`. 
 - The class will print the shape below, where the largest number in the longest row is specified by the input parameter. The following shows the correct output for an input of 3.
 - You may not use *any* loops in this method. It is recommended that you implement at least two methods, one to print a single row and one that is called by main and prints the entire structure.
 - The method will print *an appropriate* usage message and exit if the parameter is not provided.

```
0
01
012
0123
012
01
0
```
	

### Submission Requirements

1. For this assignment, you will submit the following files: `PalindromeTester .java`, `FileFinder.java`, and `NumberPrinter`. 

2. Make sure your code follows all requirements in the [Style Guidelines](https://github.com/CS112-F16/notes/blob/master/style.md).

3. Follow the instructions in the [SVN Guide](https://github.com/CS112-F16/notes/blob/master/svn_guide.md) for submitting your solution by the deadline.

4. Make sure you have submitted your work in an SVN directory: `https://www.cs.usfca.edu/svn/<username>/cs112/lab7`

