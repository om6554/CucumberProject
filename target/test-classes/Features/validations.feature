Feature: Validate all the fileds and values on page respectively

  Background: 
    Given user lanches browser
    Then maximizes the brower
    And Navigate to values page
    

Scenario: verify the count of values appear on the screen    
    Then  verify count of values matches with 6

  Scenario: verify values on the screen grater than 0     
    Then  verify all the values grater than 0

  Scenario: verify the total balance is correct based on the values listed on the screen
    Then verify the sum is equal to the total balance value field

  Scenario: verify the values are formatted as currencies
    Then  Verify $ is present the extracted text
