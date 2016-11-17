Lab 8
=====

### Due Wednesday, November 30, 2016 - 5:00pm

*This lab is optional. If you do not submit this lab your final score for Lab assignments will be the sum of the seven labs completed so far. If you do complete this assignment then your score for all eight labs will count and be weighted equally. This is an opportunity for you to raise your lab score.*

The goal of this assignment is to implement several methods for a `LinkedList` class.

##Requirements 

**Part 1 (50 points)**

1. Implement a class `Node` that holds an `Integer` as its data.
2. Implement a class `LinkedList` with the following methods:
  - `public void addAtHead(Integer data)` - adds a new `Node` at the head of the list
  - `public void addAtTail(Integer data)` - adds a new `Node` at the tail of the list
  - `public String toString()` - returns a string representation of the list
  - `public int sum()` - returns the sum of all `Integer` data in the list
  - `public void set(Integer data, int index)` - takes as input a new data item and an index and sets the data in the `Node` at index `index` to be that value. `set(3, 0)` would change the data in the first `Node` in the list to be the value 3. Note that you cannot access an element by its index so you will need to find the appropriate `Node` using a counter variable.
  - `public void printElementsBackwards()` - prints the list backwards. You are required to make this method **recursive**. Do not modify the signature of this method, however you may use a helper method. 
3. Implement a `Driver` that will create a `LinkedList` object and test all of its methods.
   
	

### Submission Requirements

1. For this assignment, you will submit the following files: `Node.java`, `LinkedList.java`, and `LinkedListDriver.java`. 

2. Make sure your code follows all requirements in the [Style Guidelines](https://github.com/CS112-F16/notes/blob/master/style.md).

3. Follow the instructions in the [SVN Guide](https://github.com/CS112-F16/notes/blob/master/svn_guide.md) for submitting your solution by the deadline.

4. Make sure you have submitted your work in an SVN directory: `https://www.cs.usfca.edu/svn/<username>/cs112/lab8`

