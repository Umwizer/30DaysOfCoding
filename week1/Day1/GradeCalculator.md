# Day 1 — Grade Calculator

## Problem
Create a program that receives a student's score and returns a grade.

### Examples
95 → A  
82 → B  
74 → C  
63 → D  
40 → F  

### Concepts
if/else, methods, user input

## My Logic
1. creating method to check the marks student have
2. method to handle the validation 
3. main class to handle the input and the output 

## Pseudocode
1. Ask the user to enter a score
2. Check if score is between 90-100 → return A
3. Check if score is between 80-89 → return B
4. ...and so on
5. If score is invalid → show error message

## Edge Cases
- Score = 0
- Score = 100
- Score = -5 (invalid — handle this)
- Score = 101 (invalid — handle this)
- Score is a decimal (e.g. 84.5)

## Challenges
1. Validation of handling more decimal values of marks

## Lessons Learned
1. how to use  math.bigdecimal to handle errors which can be caused by decimals and setting the values they can't go above or low
2. Using Class as Return type 

