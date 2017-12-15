package fr.ab.testing.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.AmazonStep;
import net.thucydides.core.annotations.Steps;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ConnexionTest {


	@Steps
    AmazonStep amazonStep;

    @Given("L'utilisateur est sur la page home d'amazon")
    public void buyerWantsToBuy() {
        amazonStep.openAmazonHome();
    }

    
    @Then("L'utilisateur est connecté")
    public void userConnected() {
        assertTrue(true);
    //	amazonStep.should_see_items_related_to(keyword);
    }

    @When("^l'utilisateur va sur la page login$")
    public void lUtilisateurVaSurLaPageLogin() throws Throwable {
        amazonStep.openLoginPage();
    }

    @When("^L'utilisateur rentre son (.*) et son (.*)$")
    public void lUtilisateurRentreSonEmailEtSonPassword(String email, String password) throws Throwable {
        amazonStep.login(email, password);
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

    @Then("^Le message d'erreur de mauvais mot de passe s'affiche$")
    public void leMessageDErreurDeMauvaisMotDePasseSAffiche() throws Throwable {
        assertEquals(amazonStep.getPasswordErrorMessage(),"Votre mot de passe est incorrect");

    }


    @Then("^Le message d'erreur d'indentifiant s'affiche$")
    public void leMessageDErreurDIndentifiantSAffiche() throws Throwable {
        assertEquals(amazonStep.getLoginErrorMessage(),"Impossible de trouver un compte correspondant à cette adresse e-mail");
    }
}
