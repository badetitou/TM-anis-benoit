package fr.ab.testing.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.ConnexionStep;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.fail;

public class LangueFixture {

    @Steps
    ConnexionStep amazonStep;

    @Given("L'utilisateur est sur la page home d'amazon")
    public void buyerWantsToBuy() {
        amazonStep.openAmazonHome();
    }

    @When("^L'utilisateur clique sur (.*)$")
    public void lUtilisateurCliqueSurLaLanque(String langue) throws Throwable {
        if (langue.equals("Australie")) {
            amazonStep.changeLangueAustralie();
        }
        else if (langue.equals("Bresil")) {
            amazonStep.changeLangueBresil();
        }
        else {
            fail();
        }
    }

    @Then("^La page home est en (.*)$")
    public void laPageHomeEstEnLangue(String langue) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
