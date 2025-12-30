# TIME COMPLEXITY
The Amount of time or space taken up by an algorithm  as function of input size.
Not actual time taken to execute code!!
NOTE:-
   1. Time complexity is based on input size!!
   2. Time complexity can increase Linearly , Quadrantly , Exponentially.
For example :-
 Case 1: Linear Search
For a given Array Finding the target element using linear search can describe Time Complexity.
  Given Array:- {2,5,4,7,8}
   - If Target element is 2 then the searching the element would be easy because the target element is present in 0-index of the given array, And it is the BEST-CASE scenario!
   - But If in case Target element is 8 then to search target element we need to traverse each element in the given array, Therefore If the array is n-size then we need to traverse n times!!, As 8 is at the last index of array this is a WORST-CASE scenario.
   - Therefore; Time Complexity of LINEAR SEARCH is O(n) [Big Oh of n].
   - Time complexity depends on size of array.

 Case 2: Find Largest Element in a sorted array using Linear Search
For a sorted array the largest element will be always in the end of the array 
 Therefore we can use one operation that
      - Largest=arr[n-1]
      - Even though the size of the array increases the TC remains constant as it performs only single operation!
      - Hence the Time Complexity Of Sorted Array using Linear Search is O(1).
      - Time complexity is Independent from size of array in this case.

SO finally as a developer needs to write a code that is effecient and optimised and better performance of code to run with less time (NOT CPU WORLD TIME) and that is considered as best-case time complexity.

# Big O Notation
Big O notation describes the upper bound of an algorithm's time or space complexity as input size grows, focusing on the worst-case scenario. It ignores constants and lower-order terms to highlight growth rates.
Big O notation, denoted as O(g(n)), means a function f(n)f(n) grows no faster than c⋅g(n)c⋅g(n) for some constant c>0c>0 and large n. 

# Common Complexities
   - O(1): Constant time, execution doesn't depend on input size, like accessing an array element.
   - O(n):  Linear time, grows directly with input, such as linear search.
   - O(nlogn): Seen in efficient sorts like mergesort.
   - O(n^2): Quadratic time, like nested loops in bubble sort.
   - O(2^n): Exponential, impractical for large inputs.

# SPACE COMPLEXITY
The Amount of space occupied by the program in memory describes the Space Complexity.
NOTE:-
The space is occupied in 2 forms!!
  1.Heap -The objects that we create will be stored in Heap
  2.Stack -The function calls will be stored in Stack
Therefore; "input space+ auxiliary space" IS SPACE COMPLEXITY
O(1)-Best case 
O(n^2)-Worst case

