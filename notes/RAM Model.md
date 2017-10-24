# RAM Model of Computation

RAM stands for Random Access Machine. Under this computation we are confronted with a computer where:
* Each simple operation (`+, *, -, =, /, if, call`) takes exactly one time step
* Loops and subroutines are not considered simple operations
* Each memory access takes exactly one time step. We have as much memory as we need. And doesn't matter whether an item is in cache or disk

These assumptions are of course not true on a real computer, and yet, RAM proves an excellent model for understanding how an algorithm will perform on a real computer. The robustness of the RAM enables us to analyze algorithms in a machine-independent manner.

The essence of RAM model is that "algorithms can be understood and studied in a language and machine independent manner".
