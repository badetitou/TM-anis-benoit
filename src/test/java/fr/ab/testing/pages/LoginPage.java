package fr.ab.testing.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://www.amazon.fr/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=frflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.fr%2F%3Fref_%3Dnav_ya_signin&switch_account=")
public class LoginPage extends PageObject {

	@Managed
	private  WebDriver driver;

	@FindBy(id="#ap_email")
	private WebElement loginText;

    @FindBy(id="#ap_password")
    private WebElement loginPassword;

    @FindBy(id="#signInSubmit")
    private WebElement submitButton;

    @FindBy(id="#auth-error-message-box > div > div > ul > li > span")
    private WebElement errorMessage;


	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterEmail(String email){
	    loginText.sendKeys(email);
    }

    public void enterPassword(String password){
        loginPassword.sendKeys(password);
    }

    public void validate(){
        submitButton.click();
    }

    public String getErrorMessage(){
	    return errorMessage.getText();
    }

}

