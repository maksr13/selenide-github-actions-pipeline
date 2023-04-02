Feature: Test
  
  Scenario: User should be able to open site
    When I open web-site http://127.0.0.1:8080/index.html
    Then I should see text Hello world on header