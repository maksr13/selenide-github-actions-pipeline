Feature: Test
  
  Scenario: User should be able to open site
    When I open web-site http://localhost:3000/index.html
    Then I should see text Hello world on header