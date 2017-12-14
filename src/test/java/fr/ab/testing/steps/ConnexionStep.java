package fr.ab.testing.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.AmazonStep;
import net.thucydides.core.annotations.Steps;

import java.util.concurrent.TimeUnit;

public class ConnexionStep {


	@Steps
    AmazonStep amazonStep;

    @Given("L'utilisateur est sur la page home d'amazon")
    public void buyerWantsToBuy() {
        amazonStep.openAmazonHome();
    }

    
    @Then("L'utilisateur est connecté")
    public void resultsForACategoryAndKeywordInARegion(String keyword) {
    //	amazonStep.should_see_items_related_to(keyword);
    }

    @When("^l'utilisateur va sur la page login$")
    public void lUtilisateurVaSurLaPageLogin() throws Throwable {
        amazonStep.openLoginPage();
    }

    @And("^L'utilisateur rentre son \"(.+)\" et son \"(.+)\"$")
    public void lUtilisateurRentreSonEmailEtSonPassword(String email, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^Un message d'erreur s'affiche$")
    public void unMessageDErreurSAffiche() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^l'utilisateur clique sur se deconnecter$")
    public void lUtilisateurCliqueSurSeDeconnecter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^L'utilisateur est déconnecté$")
    public void lUtilisateurEstDéconnecté() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
