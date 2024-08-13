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





Here is a Python program that implements the *Travelling Salesperson Problem (TSP)* using dynamic programming (Bellman-Held-Karp algorithm) based on the given adjacency matrix:

python
from itertools import combinations

# Function to implement the Bellman-Held-Karp algorithm
def tsp_dp(graph):
    n = len(graph)
    all_sets = []
    g = {}

    # Create a list of all possible subsets of the vertices excluding the starting point (A, which is index 0)
    for x in range(1, n):
        g[(x, ())] = graph[x][0]  # Base case: distance from x to A

    # Iterate through subsets of increasing length
    for subset_size in range(1, n - 1):
        for subset in combinations(range(1, n), subset_size):
            for j in range(1, n):
                if j not in subset:
                    # Find the minimum cost to reach vertex j from any subset that doesn't include j
                    g[(j, subset)] = min(
                        graph[j][k] + g[(k, tuple(x for x in subset if x != k))]
                        for k in subset
                    )

    # Consider the final subset, which includes all vertices except the start
    subset = tuple(range(1, n))
    min_cost = min(
        graph[0][k] + g[(k, tuple(x for x in subset if x != k))] for k in range(1, n)
    )

    return min_cost

# Adjacency matrix from the problem
graph = [
    [0, 3, 5, 4],  # A
    [4, 0, 7, 5],  # B
    [6, 8, 0, 9],  # C
    [5, 4, 8, 0]   # D
]

# Call the tsp_dp function
min_cost = tsp_dp(graph)
print(f"The minimum cost of the tour is: {min_cost}")


### How the Program Works:
- *Graph Representation:* The adjacency matrix is represented as a 2D list graph.
- **Dynamic Programming Table (g):** This stores the minimum cost to reach each vertex from subsets of other vertices.
- *Combinations:* We generate all possible subsets of vertices (excluding the starting vertex A) and calculate the minimum tour cost using the formula given.

### Expected Output:
When you run this code with the given adjacency matrix, it will compute the minimum cost of the shortest tour that starts at vertex A, visits all vertices (B, C, D) exactly once, and returns to A.

This approach ensures the shortest path using dynamic programming to minimize computation time compared to a brute-force solution.
