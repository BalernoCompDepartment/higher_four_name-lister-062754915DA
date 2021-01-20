# HigherNamePrintingTask

A teacher has a class list and wants a program to allow her to choose a number then be given a list of students seperated by that, for example 2 would give every second name in the list or 3 would give every third name in the list

This program is going to make use of modulus (%), the modulus mathmatical operation returns the remainder of a division rather than the the fractional answer

**example of uses**

int numTne = 15%5; //would be 0 as 15/5 is three with no remainder\
int numTwo =15%2; //would be 1 as 15/2 is 7 with 1 remainder\
int numThree = 0%4; //would be 0 as 0 divided byanything is 0 remainder 0

// this means that we can use mod to count to the number on the right of % and then return to 0 so mod three would let us count 0,1,2,0,1,2,0


## Your Task

Write the Java in Main.java to ask for the number (you can assume she will enter a number between 1 and 20) and then display names from the list every what ever number was entered

## The Algorithm Design

**Step 1:** initialise names array\
**Step 2:**	ask user for the number to seperate students by\
**Step 3:**	Start fixed loop length of names array times\
**Step 4:**	  if loop counter modulus the number entered is 0 then\
**Step 5:**	    display the name from the array\
**Step 6:**	  end if\
**Step 7:** end loop

Test your program and submitt through a version control commit!


