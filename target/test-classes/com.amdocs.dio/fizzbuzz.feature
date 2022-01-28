Feature: FizzBuzz
  Print a sequence of 5 numbers, but for multiples of 3,
  print Fizzm for multiples of 5 print Buzz
  and for multiples of 3 and 5 print FizzBuzz


  Scenario Outline: FizzBuzz a number
    Given the user selected the number <Number>
    When the user clicked the FizzBuzz number
    Then The program prints <Result>
    Examples:
    | Number  | Result  |
    |   2     |    2    |
    |   3     |   Fizz  |
    |   6     |   Fizz  |
    |   5     |   Buzz  |
    |   10    |   Buzz  |
    |   15    |FizzBuzz |

  Scenario: FizzBuzz sequence
    Given the user wants a sequence of 15 numbers
    When the user clicked the FizzBuzzSequence number
    Then the program printed
    | 1 |
    | 2 |
    | Fizz |
    | 4    |
    |Buzz  |
    | Fizz  |
    | 7     |
    | 8     |
    | Fizz  |
    |Buzz   |
    | 11    |
    | Fizz  |
    | 13    |
    | 14    |
    | FizzBuzz|
