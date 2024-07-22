Feature: Google search feature
  This feature helps user to search an appropriate information using google search engin.

  Scenario: User should be able to search an information on various topics
    Given User should open Google search page
    When User enterd "Agile Methodolgy" in search box
    And click on submit button
    Then Multiple Links should be displayed on "Agile Methodolgy" topic

  Scenario Outline: User wants to translate word from one language to another language
    Given User should open Google translater page
    When User enterd "<Word>" word from "<From>"  language and select "<To>" language
    Then Google translater should display word "<Word>" into "<To>" language
 
    Examples:
      | Word        | From    | To      |
      | Abstraction | English | Marathi |
      | Fire        | English | French  |
      | Happy       | English | Marathi |
      | Sad         | English | Marathi |