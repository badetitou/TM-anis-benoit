package com.pictime.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by pictime on 23/11/17.
 */
public class GoogleSearchAcceptanceTest {

    public static final String SEARCH_INPUT = "CANARD BLEU";
    public static final String SEARCH_SUGGESTION = "Polytech'Lille Rocks!";
    /**
     * Selenium webdriver
     */
    private WebDriver driver;

    /**
     * Setup test
     */
    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/home/gis4/ajomni/GIS5/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     * Opeen Google page and does stuff
     */
    @Test
    public void searching_for_wrong_term_should_trigger_search_suggestion() {
        //given
        driver.get("http://www.google.fr");
        final WebElement searchBar = driver.findElement(By.id("lst-ib"));
        final WebElement searchButton = driver.findElement(By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)"));
        //when
        searchBar.sendKeys(SEARCH_INPUT);
        searchButton.click();
        //then
        WebElement result = driver.findElement(By.id("fprsl"));
        Assert.assertEquals(SEARCH_SUGGESTION, result.getText());
    }

    /**
     * Clean resources
     */
    @After
    public void tearDown() {
        driver.close();
    }
}
