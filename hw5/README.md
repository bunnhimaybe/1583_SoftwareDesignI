# 	RandomGuesser.java  

  
## 	Description  

This program will pick a random integer exclusively between two integers given by the user.   

  
## 	Setup  

  
## 	Errors  

There are no valid integers between the given minimum and maximum. 
> 	ERROR!: INVALID RANGE  
> 	There must be at least two possible integers in your range (noninclusive). Try again!  

> 	ERROR!: CHEATER
> 	There is only one valid integer in that range. 
> 	This isn't fun if you don't have to guess. Try again!  

The number of guesses is invalid.  
> 	ERROR!: YOU HAVE TO GUESS AT LEAST ONCE  
> 	You should enter a positive number. Try again!  

The guess is an invalid number.  
> 	ERROR: INVALID GUESS
> 	That number is not in the range you gave me. Try again!

The same number is guessed more than once.  
> 	ERROR!: DUPLICATE GUESS  
> 	You've already guessed that number. Try again!  

  
## 	Results

If the user guesses a number that is too low:  
> 	Go higher!  

If the user guesses a number that is too high:
> 	Go lower!  

  
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

> 	Hello! We're going to play a game.  
> 	Try to guess a number between two numbers.
> 	
> 	Give me a number: 1  
> 	Give me another number: 10  
> 	
> 	Great! I chose a number between 1 and 10.  
> 	How many times would you like to guess?: 5  
> 	
> 	GOOD LUCK !  
> 	
> 	-----
> 	
> 	Guess a number: 5  
> 	
> 	That's not it. Go higher!  
> 	Guess a number: 5  
> 	
> 	Nice! That's correct.  
> 	You did *EXCELLENT* !  
> 	
> 	GOODBYE :-)  