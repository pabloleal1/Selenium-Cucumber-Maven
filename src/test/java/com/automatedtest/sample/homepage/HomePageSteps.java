package com.automatedtest.sample.homepage;

import  cucumber.api.java.en.And;
import  cucumber.api.java.en.Then;
import  cucumber.api.java.en.When;
import  cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import net.thucydides.core.annotations.Steps;

public class HomePageSteps {

    @Steps
    HomePage homePage;

    @Given("^A user navigates to HomePage \"([^\"]*)\"$")
    public void aUserNavigatesToHomePage(String country) {
        homePage.goToHomePage(country);
    }

    @Then("^Google logo is displayed$")
    public void googleLogoIsDisplayed() {
        homePage.checkLogoDisplay();
    }

    @And("^search bar is displayed$")
    public void searchBarIsDisplayed() {
         homePage.checkSearchBarDisplay();
    }

    @Then("^page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        String displayedTitle =  homePage.getTitle();
        Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
                title.equals(displayedTitle));
    }

    @When("^a user searches for \"([^\"]*)\"$")
    public void aUserSearchesFor(String searchValue) {
         homePage.searchFor(searchValue);
    }
    @Then("^\"([^\"]*)\" is displayed in the first \"([^\"]*)\" results$")
    public void firstResultIsDisplayedSuccessfully(String expectedResult, int nbOfResultsToSearch) {
        Assert.assertEquals("Coinciden", true, homePage.verify_First_Elemet().contains("Pablo Leal"));
    }

}
