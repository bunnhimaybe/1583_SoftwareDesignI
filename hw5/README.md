# 	RandomGuesser.java  

## 	Description  

This program will pick a random integer exclusively between two integers given by the user.   

## 	Greeting  

> 	Hello! We're going to play a game. 

## 	Results

If the user guesses a number that is too low:  
> 	Go higher!

If the user guesses a number that is too high:  
> 	Go lower!

## 	Errors  

There are no valid integers between the given boundaries. 
> 	ERROR!: RANGE
> 	There are no valid integers between the given range. Try again!

The number of guesses is invalid.  
> 	ERROR!: GUESSES
> 	You should enter a positive number. Try again!

The same number is guessed more than once.  
> 	ERROR!: DUPLICATE GUESS  
> 	You've already guessed that number. Try again!  

The guess is an invalid number.  
> 	ERROR: INVALID GUESS
> 	That number is not in the range you gave me. Try again!

The range is not within the valid range. 
> 	ERROR: OUT OF BOUNDS
> 	That number is not within the valid bounds. 

## 	Grading

> 	Your grade is *EXCELLENT*

> 	Your grade is *GOOD*

> 	Your grade is *FAILED*

> 	Your grade is *LUCKY*


## 	Execution

To run this program, navigate to the directory with "cd <PATH>/lapham_1583/hw5/src".  
Compile the program with the command "javac RandomGuesser.java".  
Run the program with the command "java RandomGuesser".  

## 	Sample

> 	Hello! 
> 	Give me a number: 1
> 	Give me another number!: 10
> 	
> 	Great! I'm thinking of a number between 100 and 10. 
> 	How many times do you want to guess what it is?: 5
> 	
> 	Okay! 
> 	What number is it?: 5
> 	
> 	That's not it. Go higher!
> 	What number is it?: 5
> 	
> 	That's correct! 
> 	You did EXCELLENT!