# 	RandomGuesser.java  

  
## 	Description  

This program will pick a random integer exclusively between two integers given by the user.   

  
## 	Setup  

  
## 	Errors  

There are no valid integers between the given minimum and maximum. 
> 	ERROR!: INVALID RANGE  
> 	There must be at least two possible integers in your range (noninclusive). Try again!  

> 	ERROR!: CHEATING RANGE
> 	There is only one valid integer in that range. 
> 	This isn't fun if you don't have to guess. Try again!  

The number of guesses is invalid.  
> 	ERROR!: GUESSES
> 	You should enter a positive number. Try again!  

The same number is guessed more than once.  
> 	ERROR!: DUPLICATE GUESS  
> 	You've already guessed that number. Try again!  

  
## 	Results

If the user guesses a number that is too low:  
> 	Go higher!  

If the user guesses a number that is too high:
> 	Go lower!  

  
## 	Guess Grading

> 	Your grade is *EXCELLENT*

> 	Your grade is *GOOD*

> 	Your grade is *FAILED*

> 	Your grade is *LUCKY*


## 	Execution

To run this program, navigate to the directory with "cd <PATH>/lapham_1583/hw5/src".  
Compile the program with the command "javac RandomGuesser.java".  
Run the program with the command "java RandomGuesser".  

  
## 	Sample

> 	Welcome to Random Guesser!  
> 	Try to guess a number exclusively between two numbers.
> 	
> 	Give me a number: 1  
> 	Give me another number: 10 
> 	How many tries do you want? 5  
> 	
> 	Guess a number: 4  
> 	Go higher!  
> 	Guess a number: 5  
> 	
> 	Nice, that's correct!  
> 	You did EXCELLENT!  