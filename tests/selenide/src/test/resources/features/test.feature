Feature: Test
  
  Scenario: User should be able to open site
    When I open web-site file:///./index.html
    Then I should see text Gmail