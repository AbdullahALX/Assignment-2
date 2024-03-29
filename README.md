# Problem one:
In this problem, each guest is given the opportunity to eat a cupcake. At the end of the simulation, all guests have eaten a cupcake. The selection of the next guest to enter is done efficiently using the ThreadLocalRandom method. We ensure that each guest has not eaten yet before marking them as having eaten.

The time efficiency of the solution is evident from the following test cases:

## Test Case 1:

Number of Guests = 50

Output:
Guest 22 eats the cupcake

Guest 40 eats the cupcake

Guest 27 eats the cupcake

Guest 20 eats the cupcake

Guest 29 eats the cupcake

Guest 21 eats the cupcake

Guest 31 eats the cupcake

Guest 13 eats the cupcake

Guest 49 eats the cupcake

Guest 50 eats the cupcake

Guest 17 eats the cupcake

Guest 30 eats the cupcake

Guest 16 eats the cupcake

Guest 33 eats the cupcake

Guest 19 eats the cupcake

Guest 1 eats the cupcake

Guest 6 eats the cupcake

Guest 35 eats the cupcake

Guest 46 eats the cupcake

Guest 12 eats the cupcake

Guest 47 eats the cupcake

Guest 34 eats the cupcake

Guest 9 eats the cupcake

Guest 2 eats the cupcake

Guest 10 eats the cupcake

Guest 45 eats the cupcake

Guest 37 eats the cupcake

Guest 25 eats the cupcake

Guest 18 eats the cupcake

Guest 38 eats the cupcake

Guest 11 eats the cupcake

Guest 23 eats the cupcake

Guest 28 eats the cupcake

Guest 4 eats the cupcake

Guest 24 eats the cupcake

Guest 48 eats the cupcake

Guest 42 eats the cupcake

Guest 32 eats the cupcake

Guest 44 eats the cupcake

Guest 39 eats the cupcake

Guest 36 eats the cupcake

Guest 43 eats the cupcake

Guest 8 eats the cupcake

Guest 3 eats the cupcake

Guest 15 eats the cupcake

Guest 26 eats the cupcake

Guest 14 eats the cupcake

Guest 7 eats the cupcake

Guest 5 eats the cupcake

Guest 41 eats the cupcake

All guests have entered the labyrinth and eaten a cupcake. Total cupcakes eaten: 50

Total time taken for all guests to enter: 22ms

## Test Case 2:

Number of Guests = 10

Output:

Guest 3 eats the cupcake

Guest 4 eats the cupcake

Guest 9 eats the cupcake

Guest 7 eats the cupcake

Guest 5 eats the cupcake

Guest 1 eats the cupcake

Guest 10 eats the cupcake

Guest 2 eats the cupcake

Guest 8 eats the cupcake

Guest 6 eats the cupcake

All guests have entered the labyrinth and eaten a cupcake. Total cupcakes eaten: 10

Total time taken for all guests to enter: 30ms

## Conclusion:
We observe that the runtime remains consistent even when the number of guests is increased by a factor of 5. This demonstrates the efficiency of the solution.


# Problem two:
In this scenario, a third strategy is implemented. This strategy involves allowing only one guest to enter the showroom at a time. Once a guest leaves, the next guest is allowed to enter, and this process continues. Each guest stays in the showroom for a random amount of time.

The time efficiency of this strategy is considered quite favorable. By allowing only one guest to enter at a time, we prevent any potential arguments between guests about who should go first. Below are some test cases demonstrating the effectiveness of this strategy:

## Test Case 1:

Number of Guests = 10

Output:

Guest 1 enters the showroom.

Guest 1 leaves the showroom.

Guest 2 enters the showroom.

Guest 2 leaves the showroom.

Guest 8 enters the showroom.

Guest 8 leaves the showroom.

Guest 5 enters the showroom.

Guest 5 leaves the showroom.

Guest 3 enters the showroom.

Guest 3 leaves the showroom.

Guest 7 enters the showroom.

Guest 7 leaves the showroom.

Guest 10 enters the showroom.

Guest 10 leaves the showroom.

Guest 9 enters the showroom.

Guest 9 leaves the showroom.

Guest 4 enters the showroom.

Guest 4 leaves the showroom.

Guest 6 enters the showroom.

Guest 6 leaves the showroom.

## Conclusion:
We observe that all guests enter the showroom one by one

