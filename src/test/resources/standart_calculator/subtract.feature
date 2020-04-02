  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @Regresion
  Feature: Subtract to numbers

    As windows user I want to subtract two numbers
    in calculator of windows

    Background: Go to standart calculator
      Given Jose goes to standart calculator


    @tag1
    Scenario Outline: Subtract two numbers
      Given He subtract <minuend> minus <subtrahend>
      Then He should see the total <tot>

      Examples:
        | minuend | subtrahend | tot |
        | 10      | 10         | 0   |
#        | 15      | 10         | 5   |
#        | 7       | 5          | 2   |
