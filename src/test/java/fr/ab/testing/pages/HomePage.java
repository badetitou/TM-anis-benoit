package fr.ab.testing.pages;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.amazon.fr")
public class HomePage extends PageObject {

	@Managed
	private  WebDriver driver;

	@FindBy(id="#twotabsearchtextbox")
    private WebElement searchBar;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
}

