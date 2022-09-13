# Lecture Notes

Lecture Notes for the Fall 2022 semester.

## Table of Contents

I will periodically update this as the semester continues.

### [Lab Expectations](lab_expectations.md)

- Minimum Course Expectations

### [0. Useful Course Software](00_useful_course_software.md)

- BrightSpace
- Installing Java
- Git Bash
- Atom (or your favorite text editor)
- Github

### [1. Primitive Data Types](01_primitive_data_types.md)

- Java Primitives
  - `btye` / `short` / `int` / `long` / `float` / `double` / `boolean` / `char`
- common usage
- integer values can be initialized with different bases
    - decimal (base 10) / hexadecimal (base 16) / octal (base 8) / binary (base 2)
- improved readability for large numeric literals
    - e.g. long x = 10_000_100;
- Wrapper classes
    - `Btye` / `Short` / `Integer` / `Long` / `Float` / `Double` / `Boolean` / `Character`
    - each wrapper class has various methods to operate on the wrapped primitive type
    - wrappers are immutable
- Integer wrapper class's methods
    - Integer.parseInt(String)
    - Integer.valueOf(int)
    - Integer.valueOf(String)
    - toString()
    - intValue();
    - toHexString()
    - toOctalString()
    - toBinaryString()

### [2. Flow Control](02_flow_control.md)

- Conditional Statements
    - `if` / `else if` / `else`
    - `switch` / `case` / `default`
- Loop Statements
    - `for` loop / `while` loop / `do-while` loop
- Branch Statements
    - `break`
    -`continue`
    - `return`
    - `break` utilizing a label attached to a loop
    - `continue` utilizing a label attached to a loop
    
### [3. Arrays of primitive types](03_arrays_of_primitive_types.md)

- Array Definition
- Indexing into an array
- Array Declaration and initialization
- Default Values
- Array Allocation
- Multi-Dimensional Arrays
- Jagged Arrays
- Other primitive type arrays

### [4. Strings](04_strings.md)

- What is a Class?
- Bicycle class example
- Java `String` class
- Class vs. Objects / Instances
- Constructors
- Methods
- Method overloading
- String concatenation
- `StringBuilder` and `StringBuffer`
- Strings are immutable

### [5. Reading Files](05_reading_files.md)

- Files Types 
	- Binary vs Text files
- The `File` class
	- `exists()` 
	- `getName()`
	- `getPath()`
	- `canRead()`
	- `canWrite()`
	- `createNewFile()`
	- `delete()`
	- `length()`
- File IO (Reading a text file)
	- The `BufferedReader` class
	- The `InputStreamReader` class
	- The `FileInputStream` class
	- importing classes from the `java.io` package
	- The `FileNotFoundException`
	- The `BufferedReader` `readLine()` method
	- `try-catch` block vs `try-with-resources` block
		- need to explictly `close()` in in a traditional `try-catch`
		- `try-with-resources` implicitly closes for us.
- Alternate approaches to read a text file: The `Scanner` class

- Parsing Text
	- `StringTokenizer`
		- `hasMoreTokens()`
		- `nextToken()`
		- `countTokens()`
	- `String` `split()` method
	- Example `ReadTextFileAndParseTokensExample.java`

### [6. Reading and Writing binary files](06_reading_and-writing_binary_files.md)

- Classes for reading
	- `FileInputStream`     : read bytes from a file
	- `BufferedInputStream` : adds a buffer to an input stream (for efficiency)

- Classes for writing
	- `FileOutputStream`    : write bytes to a file
		- can specify you want to ***append*** to  file via a boolean to the constructor
		- if you do not append, existing file will be overwritten
	- `BufferedOutputStream`: adds a buffer to an output stream (for efficiency)

### [7. More on Reading and Writing Files](07_more_on_reading_and_writing_files.md)

- Writing Text Files
	- `FileWriter`
	- `BufferedWriter`
	- `PrintWriter`
- Reading and Writing data from a byte array
	- `ByteBuffer`
		- `wrap()` method
		- `put()` / `get()` methods
- `ByteBuffer` example code
- Working with a `ByteBuffer`: Accounting for Primitive Sizes
	- `position()` method can set index we are start reading from / writing to
- Using the ByteBuffer to read / write binary files
- Data input and output streams
	- `DataInputStream`
		-`read()` methods for each primitive
	- `DataOutputStream`	
		- `write()` methods for each primitive
	- example code found in the lecture notes.
	
### [8. Selection Sort](08_selection_sort.md)

- Why its called a selection sort
- Pseudo code for selection sort
- Analysis of the comparisons and swaps involved: O(n^2) time complexity
	- this is not a great time complexity, but conceptually the sort is easy to understand.
	- Aside: best possible complexity for sorting algorithms is O(n * lg(n))
	- Time complexity is beyond the scope of this course, will discuss further in algorithms.
- Slightly optimized selection sort
	- only swap the next minimum found on the inner iteration
	- swaps are expensive, so this saves time
	- even though number of comparisons remains the same
	
### [9. Scanner / Exceptions / Wrappers / Lists](09_scanner_exceptions_wrappers_lists.md)

- Using `Scanner`
	- Parse `File`, `InputStream`, `String`, `ReadableBtyeChannel`
	- iteration can be done via a while loop
		- `hasNext()`
		- `next()`
	- supports parsing ***more data*** than `StringTokenizer` which only parses `Strings`
- Exception Handling
	- `try` block
	- `catch` block
	- catching multiple exceptions
		- order matters, more specific exceptions being caught should appear before more general exceptions being caught.
	- `finally` block
	- checked exceptions vs unchecked exceptions
		- specifies who is responsible for catching the exceptions
			- methods can specify they may throw some exception	
			- this delegates the work to the user to deal with exceptions which may be thrown, rather than the method which throws the exception
			```java
			public static void main(String[] args) throws java.io.IOException { ... }
			```
		
- Revisiting the Wrapper Classes
	- creates object version of each of the primitive types
		- `Boolean`, `Double`, `Float`, `Integer, `Long`, `Short`, `Byte`, `Character`
	- can use them with the various classes that only operate on objects
	- ArrayList and other data structures utilze java generics to specify the held type
		-ArrayList<Integer>, ArrayList<String>, etc.
	- autoboxing / unboxing	
	- Wrapper classes have other utility methods built in that can be convenient for dealing with operations involving primitive types
		- `Integer.parseInt(str)` : tries to convert some `String` `str` to an `int`  
		
### [10. Built-In Java Data Structures](10_built_in_java_data_structures.md)

- List Data Structures	
	- `ArrayDeque`, `ArrayList`, `Vector`
	- these are resizable list of objects
	- useful to store data where you don't initially know how much there is to be stored
	- methods: `add()`, `get()`, `set()`, `remove()`, `indexOf()`, `contains()`

- `ArrayLists` : resizable array implemtnation of the `List` interface.	

- `ArrayDeque`
	- supports functionality of both a ***queue*** and a ***stack***
	- queue = FIFO (first in first out, think line in grocery store) 
	- stack = LIFO	(last in first out, think function stack as program executes)
	- deque has a ***head*** and a ***tail***
	- methods: `push()`, `pop()`, `addLast()`, `getFirst()`, `pollFirst()`, `pollLast()`
	
- Set Data Structures
	- `HashSet`, `TreeSet`
	- stores a ***unique*** grouping of objects
	- implemented such that look up should be general quicker than trying to find values in a list
	- order of the elements are not garaunteed to be the same as they way they were added to the set 
	- methods: `add()`, `remove()`, `contains()`	
	
- `HashSet`
	- uses a `HashMap` (quicker lookup)
	- order of elements is undefined
	
- `TreeSet`
	- uses a `TreeMap` (quicker lookup)
	- elements are ordered by their ***natural order*** by default
		- can use `Comparator` to override the natural ordering if you wish	
		
- Using Enhanced for loops to iterate over Data Structures
- Using `Iterators` to iterate over Data Structures
- `toArray()` method can be used to put data from Data Structures into a corresponding array.	

- Example code
	- note: The `HashSet` had numbers printed out of order
	- note: The `TreeSet` had numbers printed in increasing order
	- note: `ArrayDeque` is used for both the stack and queue.
	- the key difference is that:
		- the queue utilized FIFO (`pollFirst()`)
			- resulted in printing values in the SAME order they were added to the queue
		- the stack utilized LIFO (`pollLast()`)	
			- resulted in printing values in REVERSE order they were added to the stack

