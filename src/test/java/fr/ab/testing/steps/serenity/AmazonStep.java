package fr.ab.testing.steps.serenity;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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

