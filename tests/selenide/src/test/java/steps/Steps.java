package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Steps {

    @When("^I open web-site (.*)$")
    public void iOpenWebSite(String url) {
        open(url);
    }

    @Then("^I should see text (.*) on header$")
    public void iShouldSeeTextXxxOnHeader(String text) {
        $(By.cssSelector("h1")).shouldHave(visible).shouldHave(Condition.exactText(text));
    }
}