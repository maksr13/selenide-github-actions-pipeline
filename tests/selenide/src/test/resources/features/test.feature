Feature: Test
  
  Scenario: User should be able to open site
    When I open web-site https://google.com
    Then I should see text Gmail