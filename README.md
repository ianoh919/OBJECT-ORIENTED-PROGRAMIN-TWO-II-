# Object-Oriented Programming Assignment

## Student Information
- **Name:** Ian Omwega
- **Registration Number:** SCT221-0927/2021

## Assignment Overview

### i. Object Modeling Techniques (OMT) [1 Mark]
**Definition:**  
Object Modeling Techniques (OMT) is a method for modeling and designing systems using object-oriented concepts. Developed by James Rumbaugh, OMT is a key component of object-oriented analysis and design (OOAD). It employs graphical notations to represent objects, classes, relationships, and other aspects of an object-oriented system.

### ii. Comparison of OOAD and OOP [2 Marks]
**Object-Oriented Analysis and Design (OOAD):**
- Encompasses both analysis and design phases.
- Emphasis on understanding the problem domain and defining system requirements.

**Object Analysis and Design (OOP):**
- Primarily refers to the design phase.
- Focuses on system architecture, classes, and interactions based on the analysis.

### iii. Main Goals of UML [2 Marks]
Unified Modeling Language (UML) Goals:
1. **Visual Modeling:** Standardize system visualization using diagrams.
2. **Specification:** Define system structure and behavior.
3. **Documentation:** Document design decisions and system architecture.
4. **Construction:** Assist in system implementation.
5. **Communication:** Facilitate communication among stakeholders.

### iv. Advantages of Object-Oriented Information System Development
1. **Inheritance and Code Reusability:**
   - Inheritance allows new classes to inherit attributes and behaviors.
   
2. **Encapsulation and Information Hiding:**
   - Encapsulation supports hiding internal state, exposing a well-defined interface.

3. **Modularity and Reusability:**
   - Promotes modular design, breaking systems into manageable object units.

### v. Types of Associations in Object-Oriented [Relationships]
1. **Association:**
   - Represents a bi-directional relationship between two or more classes.

2. **Aggregation:**
   - Specific association where one class represents a whole, and another represents its part.

3. **Composition:**
   - Stronger form of aggregation, indicating a "owns" relationship with parts dependent on the whole's lifetime.

### vi. Class Diagram Explanation
**Class Diagram:**
- **Definition:** A visual representation of the structure and relationships of classes in a system.
- **Usage:** Used for system visualization, design documentation, and communication among stakeholders.

**Steps to Draw a Class Diagram:**
1. **Identify Classes:** Identify the main classes in the system.
2. **Define Attributes and Methods:** For each class, define its attributes and methods.
3. **Establish Relationships:** Define relationships between classes (association, aggregation, composition).
4. **Draw Diagram:** Represent classes, attributes, methods, and relationships using UML notation.

**Example:**
Consider a "Library Management System."
- Classes: `Book`, `Library`, `Member`
- Relationships: `Book` is associated with `Library` and `Member`.







The problem presented is a typical example of the *Travelling Salesperson Problem (TSP)*. In this problem, you are given a set of cities (vertices) and the distances (weights) between each pair of cities, and the goal is to find the shortest possible tour that visits each city exactly once and returns to the starting city.

### Problem Breakdown:
1. *Vertices:* A, B, C, D
2. *Adjacency Matrix:*
   - The matrix provided indicates the distances between the vertices:
     \[
     \begin{array}{c|cccc}
     & A & B & C & D \\
     \hline
     A & 0 & 3 & 5 & 4 \\
     B & 4 & 0 & 7 & 5 \\
     C & 6 & 8 & 0 & 9 \\
     D & 5 & 4 & 8 & 0 \\
     \end{array}
     \]
   - *Explanation of Matrix:* 
     - For example, the distance from A to B is 3, from A to C is 5, etc.

3. *Objective:*
   - Find the shortest tour starting and ending at vertex A, visiting all other vertices (B, C, D) exactly once.

### Dynamic Programming Approach (Bellman-Held-Karp Algorithm):
The problem can be solved using dynamic programming with the formula provided:
\[
g(i, S) = \min_{j \in S} \{ w(i, j) + g(j, S - \{j\}) \}
\]
Where:
- \(g(i, S)\) is the minimum cost of visiting all vertices in set \(S\), starting at vertex \(i\).
- \(w(i, j)\) is the weight of the edge from vertex \(i\) to vertex \(j\).
- \(S\) is the set of vertices that need to be visited.

### Steps:
1. *Initialization:*
   - Start from vertex A.
   - Calculate the costs to visit each possible set of vertices starting from A.
  
2. *Recurrence Relation:*
   - Use the formula to recursively find the minimum tour cost for every subset of cities and finally return to the starting point (vertex A).

3. *Backtracking:*
   - Once the minimum cost is found, reconstruct the path by backtracking through the choices made during the dynamic programming process.

### Final Solution:
The final solution should yield the shortest path and its corresponding cost for the salesperson to visit all cities and return to the starting city A. The computation would involve evaluating all subsets of cities and using the dynamic programming formula to get the optimal path.

Would you like to see the step-by-step dynamic programming table and the final tour calculation?
