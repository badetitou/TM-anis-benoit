package fr.ab.testing.steps.serenity;

import fr.ab.testing.pages.HomePage;
import fr.ab.testing.pages.LoginPage;

public class ConnexionStep {

	HomePage homePage;

	LoginPage loginPage;

	public void openAmazonHome() {
        homePage.open();
    }

    public void login(String username, String password){
		loginPage.enterEmail(username);
		loginPage.enterPassword(password);
		loginPage.validate();
	}

    public void openLoginPage() {
	    loginPage.open();
    }

    public String getLoginErrorMessage(){
	    return loginPage.getErrorMessage();
    }

    public String getPasswordErrorMessage(){
	    return loginPage.getErrorMessage();
    }

}

