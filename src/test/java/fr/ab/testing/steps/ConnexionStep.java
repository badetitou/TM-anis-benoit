package fr.ab.testing.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.AmazonStep;
import net.thucydides.core.annotations.Steps;

public class ConnexionStep {

	@Steps
    AmazonStep amazonStep;

    @Given("L'utilisateur est sur la page home d'amazon")
    public void buyerWantsToBuy() {
    	amazonStep.openAmazonHome();
    }

    @When("l'utilisateur va sur la page login'")
    public void searchByKeyword() {
    	//
    }

    @When("L'utilisateur rentre son '(.*)' et son '(.*)'")
    public void entreLogin(String email, String password) {
    	//
    }
    
    @Then("L'utilisateur est connecté")
    public void resultsForACategoryAndKeywordInARegion(String keyword) {
    	amazonStep.should_see_items_related_to(keyword);
    }
}
