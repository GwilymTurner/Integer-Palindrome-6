# Maersk-Callenge-6
## Project Brief
**Problem 6: Integer Palindrome**
Check if given Integer is palindrome or not. An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.
Please write the unit tests for your solution using any of the unit testing framework.

## Assumptions
* No user input
* No negative integers
* No invalid entries

## Dependencies used
* JUnit 5.6.0 https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api

## How to Run
1. Open prjoect in IDE (preferably IntelliJ)
2. Navigate to App.java using Project Explorer
3. Run the main method

## Highlights
* Separate method to create palindrom in order to make testing easier (PalindromeChecker.java).
* Code follows SOLID principles

## Improvements
* Allow user input
  * Validate user input to only allow integers
* Add tests for negative integers
