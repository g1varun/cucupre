Feature: Person Repository_2

  @Regression
  Scenario: Person Creation_2
    Given an empty repository
    When I create a new Person named
    Then I should have Person named

  @smoke
  Scenario: Person Creation Examples_2
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
    Then close the browser

  @smoketest
  Scenario Outline: Login test with scenario outline & multiple logins
    Given user launch browser
    Then user opens application page
    When user logins with Username "<username>" and Password "<password>"
    Then user logins successfullly
    Then close the browser

    Examples: 
      | username | password |
      | a        | a        |
      | b        | b        |
