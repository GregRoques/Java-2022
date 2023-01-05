# What is the Fibonacci sequence?

**Each number in the sequence is the sum of the two numbers that precede it.**

So, the sequence goes: _0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on_.

- In Java, a Fibonacci sequence will trigger a _Stack Overflow_ without a _base case_.

The **base case** is **a way to return without making a recursive call**. We achieve this using _Memoization_.

**Memoization** is an optimization technique that makes applications more efficient and hence faster. It does this by **storing computation results in cache**, and **retrieving that same information from the cache the next time it's needed instead of computing it again**.
