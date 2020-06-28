Feature: Test Guru with Chrome on Android device


  Scenario Outline: Verify login successful on Guru
    Given User go to Guru
    And User login
    Then Verify login successful
    Examples:
      | username                   | password  |

      | mngr267688                 | Ugenyhe |



