package fr.ab.testing.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.AccessHomePage;
import fr.ab.testing.steps.serenity.LangueStep;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LangueFixture {

    @Steps
    LangueStep langueStep;

    @Steps
    AccessHomePage accessHomePage;

    @Given("L'utilisateur est sur la page home d'amazon")
    public void buyerWantsToBuy() {
        accessHomePage.openAmazonHome();
    }

    @When("^L'utilisateur clique sur (.*)$")
    public void lUtilisateurCliqueSurLaLanque(String langue) throws Throwable {
        if (langue.equals("Australie")) {
            langueStep.changeLangueAustralie();
        }
        else if (langue.equals("Bresil")) {
            langueStep.changeLangueBresil();
        }
        else {
            fail();
        }
    }

    @Then("^La page home est en (.*)$")
    public void laPageHomeEstEnLangue(String langue) throws Throwable {
        if (langue.equals("Australie")) {
            assertEquals(langueStep.getLangueText(), "Your Amazon.com.au");
        }
        else if (langue.equals("Bresil")) {
            assertEquals(langueStep.getLangueText(), "Sua Amazon.com.br");
        }
        else {
            fail();
        }
    }
}
