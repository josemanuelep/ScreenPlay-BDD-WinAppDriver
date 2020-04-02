  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @Regresion
  Feature: Add to numbers

    As windows user I want to convert convert currency
    in calculator of windows

    Background: Go to currency calculator
      Given Jose goes to currency calculator

    @tag1
    Scenario Outline: Convert currency
      Given He set currency <units_in> and <units_out>
      When He input <mount_in>
      Then He should see the convert curency <mount_out>

      Examples:
        | units_in               | units_out             | mount_in | mount_out |
        | "Estados Unidos Dólar" | "Nueva Zelanda Dólar" | 100      | 169       |
        | "Afganistán Afgani"    | "Costa Rica Colón"    | 100      | 754       |
