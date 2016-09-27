Lab 6
=====

### Due Friday, October 21, 2016 - 5:00pm

The goal of this assignment is to implement programs using interfaces and inheritance.

##Requirements
1. **Part 1 (25 points):** 
 - Implement a class `PlayingCard`. A `PlayingCard` will have, at minimum, the following properties: `value`, `suit`, and `color` and it will implement a `toString` method that will return a `String` containing all of its properties. `PlayingCard` will also implement the `Comparable` interface. To compare two `PlayingCard` objects you will compare the `value`. If the values are the same then the cards will be sorted according to `suit` where the order is spades, hearts, diamonds, and clubs. The five of diamonds will be higher than the three of diamonds and the three of hearts will be higher than the three of spades.
 - Implement a class `PlayingCardDriver`. The class will contain a `main` method that will: (1) create an `ArrayList` of at least five `PlayingCard` objects; (2) use `Collections.sort` to sort the cards; and (3) print the result to standard output.

2. **Part 2 (25 points):** 
 - Implement an *abstract base* class `Publication`. `Publication` has at least two properties: `title` and`numOfPages`. A `Publication` is `Comparable` and two `Publication` objects are compared by comparing their `numOfPages` properties.
 - Implement a derived class `Book`. A `Book` has a `boolean` property to indicate whether it is a hard or soft cover book. It also implements a `toString` method that returns a `String` containing all of its properties.
 - Implement a derived class `Magazine`. A `Magazine` has a property to indicate the number of subscribers. It also implements a `toString` method that returns a `String` containing all of its properties.
 - Implement a class `LibraryDriver`. The class will contain a `main` method that will: (1) create an `ArrayList` of at least five `Publication` objects, some `Book` and some `Magazine`; (2) use `Collections.sort` to sort the publications; and (3) print the result to standard output.


### Submission Requirements

1. For this assignment, you will submit the following files: `PlayingCard.java`, `PlayingCardDriver.java`, `Publication.java`, `Book.java`, `Magazine.java` and `LibraryDriver.java`. 

2. Make sure your code follows all requirements in the [Style Guidelines](https://github.com/CS112-F16/notes/blob/master/style.md).

3. Follow the instructions in the [SVN Guide](https://github.com/CS112-F16/notes/blob/master/svn_guide.md) for submitting your solution by the deadline.

4. Make sure you have submitted your work in an SVN directory: `https://www.cs.usfca.edu/svn/<username>/cs112/lab6`

