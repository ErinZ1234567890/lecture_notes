-----------------
Practice Exam
-----------------

## Disclaimers

- This is by no means exhaustive of what you may or may not need to study in preparation for the exam on wednesday.

## Reminders

- The test will be in person on Wednesday, October 19th. You will have from 4:40pm to 5:40pm to take the exam. You can have one sheet of paper, double sided (handwritten or typed). Otherwise, the exam will be closed book.

## Practice Questions

- Here's some practice questions I threw together. 
- These are much more open ended than the exam will be. 
	- The hope is to get you thinking about things high level, not get too caught up in the low level details of the actual code.

- The majority of the actual test will be structured similar to quiz 01 and quiz 02, where some sample code is typically provided and you are expected to give some answers related to the code snippets. 

### Q1: Mystery Calculator

- Suppose we want to design a calculator for a client, that can evaluate given expressions.
- You do not have to implement this mystery calculator in detail. Please don't take the time to do so!

**Description**

The user has given the following requirements: 
- Statements of an expression will be given as a `String`. (see the Input String below)
- Note the Input String is not necessarily readable in the traditional sense, but is still interpretable (concrete example below).

**Requirements**

- Need the ability to add, subtract, multiply, (not division just so you don't have to consider integer division).
- No need to respect order of operations (PEMDAS) or parentheses, we just process the input string from left to right.
- For simplicity, assume the numeric values involved in the input expression are integers.
- Need to be able to print out how the expression is being interpretted (see the Expression Interpretation below)
- Need to be able to print out step by step how the evaluation simplifies (see Step by step Evaluation below)

**Part A**
- Define an interface `ExpressionEvaluator` that one could use to fullfill the requirements as described above.
	- the interface should specify how each of the operations will be handled
	- the interface should specify how an expression given as a String will be broken up into some sort of tokens
	- are there any other methods we could use to specify how an ExpressionEvaluator works?
	- There could be many correct answers here, the point is to get you thinking about defining an interface 
	- which methods in your interface would you make abstract? which would you make default? 
		- the choice you make here are sort of subjective, you could make convincing arguments either way I'm sure.
		- However, the important take away: what's the difference between the two (abstract vs default)?

**Part B**
- B. Looking at the Expression Interpretation, what data structure best resembles it / would you use to store this interpretation?
	- Justify your answer.
- Notice anything special about where the numeric values reside?
- Notice anything special about where the operators reside?
- Based off what you have noticed, do you think there is a way you could determine whether a given exression is well formed?
	- ie, just looking at the interpretation below, without trying to simplify it, could you tell if the expression is invalid?

**Part C**
- Looking at the Step by step Evaluation, what data structure best resembles the output / would you use to implement the simplification?
- Justify your answer.
- What do we do when we encounter a new operator?
	- Depending on the data structure you chose, explain what method applies relative to that data structure.
- What do we do when we encounter a new value?
	- Depending on the data structure you chose, explain what method applies relative to that data structure.
- When does the data structure being utilized start to replace elements and shrink?
	- Explain in terms of values and operators.
	- What methods of the data structure you chose would apply here?
- How do we know when we are done adding new values into the data structure used to simplify the expression?
	- Explain in terms of the input String
- Based purely off the simplification, how do we know whether the given expression was well formed?
	- What's special about step 12 here?
	- What would indicate the expression being simplified was not well formed?

**Concrete Example**
Input String: ```* + 3 * 4 + 2 3  - 6 4```

Expression Interpretation:

```
          *
   +            -
3     *       6   4

    4   +
      2   3

(3 + (4 * (2 + 3))) * (6 - 4) = 46       
```

Step by step Evaluation:

```
=====step 1====== //new operator *, add it
*
=====step 2====== //new operator +, add it
+
*
=====step 3====== //new value 3, add it
3
+
*
=====step 4====== //new operator *, add it
*
3
+
*
=====step 5====== //new value 4, add it
4
*
3
+
*
=====step 6====== //new operator +, add it
+
4
*
3
+
*
=====step 7====== //new value 2, add it
2
+
4
*
3
+
*
=====step 8====== //new value 3, add it. 
//Two values found, evaluate Right = 3, Left = 2, operator = +, ie 2 + 3 = 5. Replace.
3
2
+
4
*
3
+
*
===== 8a ====== 
//two values found, evaluate Right = 5, Left = 4, operator = *, ie 4 * 5 = 20. Replace.
5
4
*
3
+
*
===== 8b ====== 
//two values found, evaluate Right = 20, Left = 3, operator = +, ie 3 + 20 = 23. Replace.
20
3
+
*
====step 9 ==== //new operator -, add it
-
23
*
====step 10 ==== //new value 6, add it
6
-
23
*
====step 11 ==== //new value 4, add it
//two values found, evaluate Right = 4, Left = 6, operator = -, ie 6 - 4 = 2. Replace.
4
6
-
23
*
==== 11b =====
//two values found, evaluate Right = 2, Left = 23, operator = *, ie 23 * 2 = 46. Replace.
2
23
*
====step 12 ===== //we are done... why?
46

Output: 46
```

### Q2: Fun with Shapes 

Suppose we want to design some `Shape` functionality. 

The following is provided. It is intended to compile, but I didn't take the time to verify that is the case.
Assume it does.

``` java
interface Drawable
{
	void dilate(double dilationFactor);
	double getArea();
	double getPerimeter();
}

class Shape implements Drawable
{
	protected double dilation;

	public Shape()
	{
		this.dilation = 1.0;
	}

	public void dilate(double dilationFactor)
	{
		this.dilation = dilationFactor;
	}

	public double getArea()
	{
		return 0.0;
	}	

	public double getPerimeter()
	{
		return 0.0;
	}
}

class Rectangle extends Shape
{
	protected double width;
	protected double height;

	public Rectangle(double w, double h)
	{
		this.width  = w;
		this.height = h;
	}

	@Override
	public double getArea()
	{
		return this.dilation * (this.width * this.height);
	}

	@Override
	public double getPerimeter()
	{
		return this.dilation * (2.0 * (this.width + this.height));
	}
}

class RightTriangle extends Rectangle
{
	public RightTriangle(double base, double height)
	{
		super(base, height);
	}

	@Override
	public double getArea()
	{
		return 0.5 * super.getArea();
	}

	@Override
	public double getPerimeter()
	{
		double hypotenuse = Math.sqrt(width * width + height * height);
		return this.dilation * (hypotenuse + width + height);
	}
}

class Circle extends Shape
{
	protected double radius;
	private static final double PI = 3.14;

	public Circle(double r)
	{
		this.radius = r;
	}

	@Override
	public double getArea()
	{
		return this.dilation * (PI * radius * radius); 
	}

	@Override
	public double getPerimeter()
	{
		return this.dilation * (2.0 * PI * radius);
	}
}
```

**Part A**
- Make a list of all the cases you would consider for some JUnit tests that would test the functionality of each `Shape` above.
	- try to make your list as exhaustive as possible
	- are there any edge cases that aren't being considered in the code above?
		- if so, how would you change the code to account for any such edge cases?

**Part B**
- Focusing on the `RightTriangle`, how is it being implemented differently from the `Circle` and `Rectangle` classes?
	- What are we leveraging in our implementation of the class? 
	- Are there any design tradeoffs here?
	- Could you define the `RightTriangle` class differently than above? If so, how? 

**Part C**
- Consider the following test code below:
	- Will this compile?
		- Is the `dilate()` method something that all the classes deriving the `Shape` class can utilize?
		- can we make an `ArrayList<Shape>` here as we are doing?
		- Justify why or why not for both. 
	- What values should we define for `expectedArea` and `expectedPerimeter` such that the following test would pass?

``` java
import java.util.ArrayList;
//assume all junit test imports are present here too.

class ShapeTest
{
	@Test
	public void test1(String[] args)
	{
		Shape s1 = new Rectangle(3.0,4.0);
		Shape s2 = new Circle(3.0);
		Shape s3 = new RightTriangle(12.0, 5.0);

		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(s1);
		shapes.add(s2);
		shapes.add(s3);

		double totalArea = 0.0;
		double totalPerimeter = 0.0;

		for(Shape s : shapes)
		{
			s.dilate(2.0);

			totalArea += s.getArea();
			totalPerimeter += s.getPerimeter();
		}

		//What should these values be? High level? You don't need to work out the exact values
		//just have a general idea here, with some mathematical expression for instance.
		double expectedArea = ???;
		double expectedPerimeter = ???;

		assertEquals(expectedArea, totalArea, 0.01);
		assertEquals(expectedPerimeter, totalPerimter, 0.01) ;
	}
}
```

**Part D**
- Suppose we stored one of each to the following in the `Shape` class:
	- some `private` field
	- some `public` field 
	- some `protected` field
	- some `static` field  
	- some `package` field

- Compare and contrast the usage of each field.
	- Which could be directly accessed by some subclass? 
	- Which could only be indirectly accessed by some subclass, and how?
	- Which could be accessed by anyone?
	- Which could be accessed by those residing in the same package?
	- Which could only be directly accessed from within the class the field is defined?
	- What's the difference between `package` and `protected`?
	- When would the value be unique to each instance instantitated?
	- When would the value not be unique to each instance instantitated?

### Q3: Suppose we specify a Undirected Graph, defined as follows:

```
G = (V, E)
V = {0,1,2,3,4,5,6,7,8,9}
E = {(2,4),(0,5),(5,9),(8,7),(7,3),(1,3),(3,5),(2,6),(1,9),(6,4),(7,0)}
```

**Part A**
- Draw a pictural representation of the graph. 
	- Tip: Start by putting all vertices around the perimeter of some imaginary circle, then add the specified edges.

**Part B**
- Is the graph connected?
	- If not, give a counter example. (Specify two vertices such that no path exists between them).
	- If not, how many sub pieces are there?

**Part C**
- If possible, define a path from 0 to 9. Are there more than one such paths?

**Part D**
- Are there any cycles in the graph?
	- If so, give an example.

**Part E**
- If you were utilizing a `StringTokenizer`:
	- what delimiter would you utilize to properly parse the Vertices? 
	- what delimiter would you utilize to properly parse the Edges?

### Q4: Suppose we are given an Array of Strings:

``` java
String[] words = new String[]{"elephant", "cat", "dog", "apple", "queen", "king", "hearts", 
							  "purple", "dog", "king", "hearts", "elephant", "diamond", "clubs"};
```

- Write some code such that:

**Part A**
- we print each unique word exactly once

**Part B**
- we print each unique words in lexicographical order

- Are there any data structures that could help get the job done with relative ease?

Best of luck studying.
