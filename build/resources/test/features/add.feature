  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @Regresion
  Feature: Add to numbers

    As windows user I want to plus two numbers
    in calculator of windows

    @tag1
    Scenario Outline: Add two numbers
      Given He plus <adding_up_1> and <adding_up_2>
      Then He should see the total <tot>

      Examples:
        | adding_up_1 | adding_up_2 | tot |
        | 4           | 5           | 9   |
        | 8           | 9           | 17  |
        | 7           | 5           | 12  |
