package fr.ab.testing.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.AmazonStep;
import net.thucydides.core.annotations.Steps;

public class SearchByKeywordStepDefinitions {
	
    @Steps
    AmazonStep amazonStep;

    @Given("I have been connected on amazon")
    public void buyerWantsToBuy() {
    	amazonStep.openAmazonHome();
    }

    @When("I search '(.*)'")
    public void searchByKeyword(String keyword) {
    	amazonStep.searches_for_items(keyword);
    }

    @Then("Le site devrait nous proposer '(.*)'")
    public void resultsForACategoryAndKeywordInARegion(String keyword) {
    	amazonStep.should_see_items_related_to(keyword);
    }
}
