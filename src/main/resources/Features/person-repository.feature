Feature: Person Repository

  @Regression
  Scenario: Person Creation
    Given an empty repository
    When I create a new Person named
    Then I should have Person named

  @smoke
  Scenario: Person Creation Examples
    Given a repository
    When I create a new Person named
    Then I should have Person named

  @smoketest
  Scenario: Mercury Login test with scenario & multiple logins
    Given user launch browser
    Then user opens application page
    Then user enters Credentials to LogIn <Data in list format>
      | Username | Password |
      | a        | a        |

  @smoketest
  Scenario Outline: Login test with scenario outline & multiple logins
    When user logins with Username "<username>" and Password "<password>"
    Then user logins successfullly

    Examples: 
      | username | password |
      | a        | a        |
      | b        | b        |
