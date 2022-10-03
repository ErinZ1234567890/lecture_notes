--------------------------------------------------
Junit Testing Summary - Programming Assignment 4
------------------------------------------------

Testing Goal: We want to develop a JUnit test for most of the functionality of program 4

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
	- four tests, two per directed / undirect
	- one of each regarding the following cases:
		- conntected graph
		- not connected graph
		
9. Exception
	- four tests, one for each exception type, and one for non-exception case
