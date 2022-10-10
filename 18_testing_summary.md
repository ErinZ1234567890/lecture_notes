----------------------
Testing
----------------------

## Types of testing

There are lots of different types of testing that are done on computer systems and programs, depending on the size and complexity of the project at hand. Below are some:

1. Unit Testing
	- testing that a unit of code functions properly
2. Functional Testing
	- testing to verify that the code functions as specified
	- usually refering to tests involving multiple different units of code interacting with one another
3. Integration Testing
	- testing that the various pieces of code function togher when they are integrated together.
	- As a software engineer, your team may be working on some project that needs to integrate with another team's project.
	- The effort to get these two different projects accross multiple teams communicating is the crux of integration testing.
4. Regression Testing
	- testing to verify that the latest code updates do not break the existing code base
5. Performance Testing
	- testing to verify that the code is able to perform under various conditions
	- speed, stability, reliability, resources utilization
6. System Testing
	- testing that the entire system performs correctly in the intended environment
7. Verification Testing
	- ensuring the code does what the requirements specify
8. Validation Testing
	- ensuring the code does what we want it to do.

And many more from there.

## Software Development

If you take a class in software engineering, you will become familiar with the entire software development process.
Below is some of it:

1. Requirements Development
	- High level requirements
	- Performance requirements
	- Detailed requirements
	- Testing requirements

2. Software Design
	 - High level design
	 - Detailed design
	 - Requirements mapping
	 - Software development

3. Software Verification
	- Develop tests for verification of requirements
	- Develop test data

## JUnit Testing

JUnit is a simple framework to write repeatable tests.

- [JUnit4](https://junit.org/junit4) is the previous version.

- [JUnit5](https://junit.org/junit5) is the current version.
	- Junit5 is integrated into eclipse
	- JUnit5 tests can also be compiled and run from the command line (this is a bit more involved)

JUnit uses **assertions** to ***verify*** that an ***actual*** result is what it is ***expected*** to be.

There arre various assertion methods available to verify:

- An array matches an expected result array
- A String matches the expected String result
- An object is not null
- Two objects are not the same
- An object is null
- A list contains certain items
- And many more.

The general idea is that once we have implemented a class, we create a JUnit test to verify that the class is functioning properly.

We are going to create a significant number of JUnit tests in lab06, to help test program assignment 04.

--------------------------------------------------
Junit Testing Summary - Programming Assignment 4
------------------------------------------------

Testing Goal: We want to develop a JUnit test for most of the functionality of program assignment 04

- Two constructors
- getNumberOfVertices()
- getNumberOfEdges()
- addVertex()
- addEdge()
- isDirected()
- toString()
- isConnected()
- Exceptions

## Tests

1. Two constructors
	- Test via checking if isDirected() is correct, three tests
2. getNumberOfVertices()
	- one test, add a bunch of vertices

3. getNumberOfEdges()
	- one test, add a bunch of edges
	
4. addVertex()
	- one test, add a bunch of vertices, with duplicates
	
5. addEdge()
	- one test, add a bunch of edges, with duplicates	
	
6. isDirected()
	- Covered by constructor tests
	
7. toString()
	- one test, add vertices and edges to be printed
	
8. isConnected()
	- four tests, two per directed / undirected
	- one of each regarding the following cases:
		- connected graph
		- not connected graph
		
9. Exception
	- four tests, one for each exception type, and one for non-exception case


---------------------------
Intro to Interfaces
---------------------------


