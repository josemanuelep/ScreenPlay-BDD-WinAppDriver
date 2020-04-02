  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @Regresion
  Feature: Divide to numbers

    As windows user I want to divide two numbers
    in calculator of windows

    Background: Go to standart calculator
      Given Jose goes to standart calculator

    @tag1
    Scenario Outline: Divide two numbers
      Given He divide <dividend> divided <divisor>
      Then He should see the total <tot>

      Examples:
        | dividend | divisor | tot |
        | 9        | 3       | 3   |
#        | 12       | 6       | 2   |
#        | 20       | 4       | 5   |
