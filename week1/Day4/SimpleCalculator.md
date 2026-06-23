
# Day 4 : Simple Calculator

## Problem
Build a calculator that handles add, subtract, multiply, and divide. The program should continue running until the user enters `exit`.

**Edge cases to handle:**
1. Division by zero
2. Negative numbers
3. Decimal results
4. Very large numbers

---

## My Logic

A loop keeps the program alive. Each iteration asks the user for two numbers and an operator, then routes to the correct operation.

---

## Pseudocode

```
START

LOOP forever:
    PRINT "Enter first number (or 'exit' to quit): "
    READ input
    IF input == "exit" → BREAK

    CONVERT input to float → num1

    PRINT "Enter operator (+, -, *, /): "
    READ operator

    PRINT "Enter second number: "
    READ input
    CONVERT input to float → num2

    IF operator == "+"  → result = num1 + num2
    IF operator == "-"  → result = num1 - num2
    IF operator == "*"  → result = num1 * num2
    IF operator == "/":
        IF num2 == 0 → PRINT "Error: Cannot divide by zero"  → CONTINUE
        ELSE → result = num1 / num2

    PRINT result

END LOOP

PRINT "Goodbye!"
END
```

## Challenges

- **Knowing when to stop the loop** — deciding whether `exit` check goes before or after input matters for clean UX.
- **Type conversion** — user input is always a string, so you must convert to `float` before doing math.
- **Division by zero** — this would crash the program if unchecked; it needs an explicit guard.
- **Graceful invalid input** — what if the user types `"abc"` instead of a number? A bare conversion will crash.

---

## Lessons

- `while True` + `break` is the standard pattern for "run until user quits."
- Always convert user input explicitly ,never assume it's already the right type.
- Handle errors **before** they happen (check `num2 == 0` *before* dividing), not after.
- `float` covers negatives and decimals for free — no extra logic needed.
- A `try/except` around input parsing makes your program robust to typos.