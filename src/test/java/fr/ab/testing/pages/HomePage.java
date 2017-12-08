package fr.ab.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://amazon;fr")
public class HomePage extends PageObject {
	
	@FindBy(id="#twotabsearchtextbox")
    private WebElement searchBar;
	
	public HomePage(WebDriver driver) {
	        super(driver);
	}
	
	public void recherche(String keyword){
		searchBar.sendKeys(keyword);
	}
}

