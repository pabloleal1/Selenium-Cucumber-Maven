package com.automatedtest.sample.homepage;

import com.automatedtest.sample.basepage.BasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "https://www.google.";

    @FindBy(css = "#hplogo")
    private WebElement logo;

    @FindBy(css = "input[name=q]")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]")
    private WebElement firstElement;

    @FindBy (id = "L2AGLb")
    private WebElement Acept;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Open the URL")
   public void goToHomePage(String country){
        driver.get(HOME_PAGE_URL + country);

        wait.forLoading(5);
        Acept.click();

    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(5, this.logo, "Logo");
    }

    String getTitle() {
        return driver.getTitle();
    }

    void checkSearchBarDisplay() {
        wait.forElementToBeDisplayed(10, this.searchInput, "Search Bar");
    }

    void searchFor(String searchValue) {
        this.searchInput.sendKeys(searchValue);
        this.searchInput.sendKeys(Keys.ENTER);
    }

    public String verify_First_Elemet(){
        return this.firstElement.getText();

    }
}
