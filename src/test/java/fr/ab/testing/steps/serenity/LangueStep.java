package fr.ab.testing.steps.serenity;

import fr.ab.testing.pages.HomePage;

public class LangueStep {

	HomePage homePage;


    public void changeLangueAustralie() {
	    homePage.changeLangueAustralie();
    }

    public void changeLangueBresil() {
        homePage.changeLangueBresil();
    }

    public String getLangueText(){
        return homePage.getLangueText();
    }
}

