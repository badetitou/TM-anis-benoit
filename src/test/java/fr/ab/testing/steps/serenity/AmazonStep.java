package fr.ab.testing.steps.serenity;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonStep {
	
	private WebDriver driver;


	public void openAmazonHome() {
		System.setProperty("webdriver.gecko.driver", "/home/gis4/ajomni/GIS5/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.fr/");		
	}

	public void searches_for_items(String keyword) {
		final WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		final WebElement searchButton = driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input"));

		searchBar.sendKeys(keyword);
        searchButton.click();
    }

	public void should_see_items_related_to(String proposition) {
				
		final WebElement didYouMean = driver.findElement(By.cssSelector("#didYouMean > a:nth-child(1)"));
        Assert.assertEquals(proposition, didYouMean.getText());

		driver.close();
		
	}

}

