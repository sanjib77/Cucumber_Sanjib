Feature: Facebook Login

  @tag1
  Scenario: Facebook Login Functionality
    Given Navigate to Fcebook Login Page
    When User Enter Username and Password "Mohit","Mohit123"
    Then Validate the login Functionality

  @tag2
  Scenario Outline: Facebook Login Functionality
    Given Navigate to Fcebook Login Page
    When User Enter Username and Password "<Username>","<Password>"
    Then Validate the login Functionality

    Examples: 
      | Username | Password |
      | Rahul    | Rahul123 |

  @tag2
  Scenario Outline: Facebook Login Functionality
    Given Navigate to Fcebook Login Page
    When User Enter Username and Password
      | Username | Password |
      | Rajat    | Rajat123 |
      | Rohan    | Rohan123 |
      | Roban    | Roban123 |
    Then Validate the login Functionality
