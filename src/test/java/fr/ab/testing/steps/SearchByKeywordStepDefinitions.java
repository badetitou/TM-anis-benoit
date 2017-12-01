package fr.ab.testing.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.GoogleStep;
import net.thucydides.core.annotations.Steps;

public class SearchByKeywordStepDefinitions {
	
    @Steps
    GoogleStep googleStep;

    @Given("I have been connected on google")
    public void buyerWantsToBuy() {
    	googleStep.openGoogleHome();
    }

    @When("I search '(.*)'")
    public void searchByKeyword(String keyword) {
    	googleStep.searches_for_items(keyword);
    }

    @Then("I should only see items containing '(.*)'")
    public void resultsForACategoryAndKeywordInARegion(String keyword) {
    	googleStep.should_see_items_related_to(keyword);
    }
}
