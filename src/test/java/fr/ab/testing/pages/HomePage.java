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

	@FindBy(css="#twotabsearchtextbox")
    private WebElement searchBar;

	@FindBy(css="#navFooter > div:nth-child(5) > ul > li.nav_first > a")
	private WebElement buttonLangueAustralie;

    @FindBy(css="#navFooter > div:nth-child(5) > ul > li:nth-child(3) > a")
    private WebElement buttonLangueBresil;

    @FindBy(css="#nav-your-amazon")
    private WebElement textLangue;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

    public void changeLangueBresil() {
        buttonLangueBresil.click();
    }

    public void changeLangueAustralie() {
        buttonLangueAustralie.click();
    }

    public String getLangueText(){
	    return textLangue.getText();
    }

}

