package fr.ab.testing.steps.serenity;

import org.openqa.selenium.WebDriver;

import fr.ab.testing.pages.HomePage;
import net.thucydides.core.annotations.Managed;

public class AmazonStep {
	
	@Managed
	private WebDriver driver;
	
	HomePage homePage;

	public void openAmazonHome() {
		homePage.open();
	}

	public void searches_for_items(String keyword) {
		//
    }

	public void should_see_items_related_to(String proposition) {
		//
	}

}

