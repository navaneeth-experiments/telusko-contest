# telusko-contest 
# Day 1

Q) Print Pascal's triangle with the following approaches:
  - Iterative.
  - Recursive.
  - Memoization.


Before diving into code first let's try to undestand what is pascal's triangle. 

### What is pascal's triangle?
pascal's triangle is a triangle of numbers as shown below which start with 1 and also every row starts and ends with 1.<br/>
<pre>
    1
   1 1
  1 2 1
 1 3 3 1
</pre>

 Try to observe the above triangle in rows. It has 4 rows. where
 - 1st Row has one number that is 1
 - 2nd row has two numbers that is 1, 1
 - 3rd row has 3 numbers(1, 2, 1) where 2(middle number) is the sum of it's above numbers(1, 1). 
 - 4th row has 4 numbers(1, 3, 3, 1) where first 3, second number in the row is the sum of it's above numbers(1, 2) and second 3, third number in the row is the sum of it's above numbers(2, 1).
 
 So, finally we can say pascal's triangle is a triangle of numbers which looks like below said points:
 - starts with 1
 - Each row in the triangle starts and ends with 1 and the other numbers in the triangle will be the sum of it's above numbers.

Hope it's clear until here 🚀

Now let's reimagine the same pascal's triangle with some mathematics as shown below.
<pre>
         0C0
      1C0    1C1
   2C0    2C1   2C2
3C0    3C1    3C2   3C3
</pre>

![image](https://github.com/navaneeth-experiments/telusko-contest/assets/128879708/3f39895e-b3e4-4481-9601-006f6d521a8d)

This is what we are going to convert into code. We will get the number the rows to be printed as an input. Let's consider it as 4 as in our example.
- So, now number of columns = 4
- And if you observe the number of elements in each row is equal to row number, right? 1st row has 1 number, 2nd row has 2 numbers, 3rd row has 3 and so on...
- So, we will take one for loop for rows starting from 0 and ending at 4, and other for loop for printing columns starting at 1 and ending at row number.
 <pre>
  for (let i = 0; i <= rows; i++) {
    for (let j = 1; j <= i; j++) {
      const number = calculate_nCr(i, j);
      console.log(number)
    }
  }
</pre>
- Like that we will get the each and every number in the pascal triangle and we can format it according to the requirements. Here calculate_nCr is a helper function, which gives result as per maths formula shown below.
<pre>
nCr = n! / [(n-r)! * r!]
</pre>
This is one way of doing.

## Optimization
The above approach looks cool but calculating factorials of big numbers may be difficult.
So, we will change the way we are getting each number. Again by applying some mathematics as shown in the code.

Happy coding 😁😁
