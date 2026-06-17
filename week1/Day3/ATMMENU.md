# Day 3 — ATM Menu (Menu-Driven Program)

## Problem

Create an ATM program that continuously allows a user to:

1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit

The program should keep running until the user chooses Exit.

It should also handle invalid situations such as:

* Withdrawing more than the available balance
* Depositing a negative amount
* Selecting an invalid menu option
* Trying to withdraw when the balance is zero

---

## My Logic

I need to build a menu that repeats after every action.

Instead of writing everything inside `main()`, I should separate responsibilities into methods.

My thought process:

1. Start with an initial balance (for example 0 or 1000).
2. Display a menu.
3. Ask the user to choose an option.
4. Use a `switch` statement to execute the selected action.
5. After completing the action, show the menu again.
6. Only stop when the user chooses Exit.

I need a loop because a real ATM doesn't close after one transaction.

---

## Pseudocode

START

Create balance variable

Create Scanner object

Create boolean variable `running = true`

WHILE running

Display menu

1. Check Balance

2. Deposit

3. Withdraw

4. Exit

Ask user for choice

Read choice

SWITCH(choice)

CASE 1:

Display balance

BREAK

CASE 2:

Ask amount to deposit

IF amount <= 0

Display error message

ELSE

Add amount to balance

Display success message

END IF

BREAK

CASE 3:

Ask amount to withdraw

IF balance == 0

Display "Insufficient funds"

ELSE IF amount <= 0

Display error message

ELSE IF amount > balance

Display "Cannot withdraw"

ELSE

Subtract amount from balance

Display success message

END IF

BREAK

CASE 4:

Set running = false

Display goodbye message

BREAK

DEFAULT:

Display invalid option

END SWITCH

END WHILE

END PROGRAM

---

## Challenges

* Remembering that the ATM must continue running after one transaction.
* Knowing when to use a loop.
* Deciding where to put validation checks.
* Separating the code into methods instead of writing everything in `main()`.

---

## Lessons Learned

I learned:

* `switch` is useful for menus.
* `while` loops keep the program running.
* Methods make code cleaner and easier to maintain.
* Input validation is important.
* Programs should handle incorrect user input gracefully.
* State management means updating and maintaining a value (balance) over time.

---

## Java Concepts Practiced

* Variables
* Scanner
* while loop
* switch statement
* methods
* if-else statements
* boolean variables
* input validation

---

## Edge Cases

1. User withdraws more than the balance.
2. User deposits a negative amount.
3. User enters an invalid menu option.
4. Balance is zero and user tries to withdraw.
5. User enters zero as a deposit or withdrawal amount.

---

## Interview Notes

Interviewers usually check:

* Does the menu continue running?
* Is the code separated into methods?
* Are invalid inputs handled?
* Is the balance updated correctly?
* Is the code readable?

Key idea:

A real ATM does NOT stop after one transaction.
