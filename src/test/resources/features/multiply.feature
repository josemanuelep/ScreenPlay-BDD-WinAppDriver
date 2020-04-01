  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @Regresion
  Feature: Multiply to numbers

    As windows user I want to multiply two numbers
    in calculator of windows

    @tag1
    Scenario Outline: Multiply two numbers
      Given He multiply <adding_up_1> and <adding_up_2>
      Then He should see the total <tot>

      Examples:
        | adding_up_1 | adding_up_2 | tot |
        | 4           | 5           | 20  |
#
