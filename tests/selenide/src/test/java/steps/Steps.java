package steps;

import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Steps {

    @When("^I open web-site (.*)$")
    public void iOpenWebSite(String url) {
        open(url);
    }
}