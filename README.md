# Homework 4
Due date: 5/6/2022 at 11:59 pm

This Homework is to be completed individually. You may discuss ideas with fellow classmates, but you must credit them (write their name in a comment at the top of your code). You MAY NOT share your code, or look at another students code.

This homework assignment features four parts: Creating two data structures, and solving two problems. These data structures are very useful for solving the given problems.

The data structures you'll be creating are:

1. HashTable
- Your HashTable class has a public internal class called tuple, with private fields. A tuple is just an object that stores two integers.
- Your HashTable should hash tuples of objects, using the sum of the two components as a key and the tuple itself as a value.
- You may need to modify the internal tuple class


2.  Graph
- Your Graph must take in a number of vertices when constructed.
- Your Graph can be implemented in many different ways, but must be able to implement the three functions: addEdge, hasEdge, and hasCycle.


The problems you will be solving are:

1. fourSum(int[] arr, int sum)
- Checks if there is any combination of 4 distinct integers in the array arr that sum up to sum. You must not use a brute force algorithm (which checks all n^4 possible combinations). You must use one of the data structures we created.

2. canGraduate(int num, int[][] prerequisites)
- A university offers *num* different courses. Prerequisites is an array of length 2 arrays, consisting of class pairs of course and its prerequisites. For example, [1, 3] means you must take course 3 before you can take course 1.
- Your goal is to return a boolean saying if it is possible to take all the classes (if 1 is a prereq for 2 and 2 is a prereq for 1, it isnt possible to finish all the classes).









# Specifications
- The Homework4.java, Graph.java, and HashTable.java contains more details on what needs to be implemented. 

# Unit Tests
Use the provided unit tests in the solution skeleton. I would also advise testing some additional edge cases.



# Solution Restrictions
**Important! Violating any restriction here will net you a 0 on the assignment.**
- You may not use any form of HashTable or Graph that you did not write yourself.
- You *may* use some basic data structures from the JCF (stack, queue, set) but they are are not necessary to solve the assignment. If your algorithm benefits greatly from one of these structures, it is acceptable to use one but you must justify its use! (Write a comment).
- Your classes and source files must be named exactly as described above (and in the solution skeleton), and your submission should mimic the solution skeleton's package structure.



