package fr.ab.testing.steps.serenity;

import fr.ab.testing.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import fr.ab.testing.pages.HomePage;
import net.thucydides.core.annotations.Managed;

import java.util.concurrent.TimeUnit;

public class AmazonStep {

	HomePage homePage;

	LoginPage loginPage;

	public void openAmazonHome() {
        homePage.open();
    }

	public void searches_for_items(String keyword) {
		//
    }

	public void should_see_items_related_to(String proposition) {
		//
	}

    public void openLoginPage() {
	    loginPage.open();
    }
}

