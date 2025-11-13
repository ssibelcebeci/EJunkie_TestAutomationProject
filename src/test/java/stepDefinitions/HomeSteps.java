package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utils.ReusableMethods;

public class HomeSteps extends ReusableMethods {
    HomePage hp=new HomePage();

    @When("Click seeHowItWorks button")
    public void Click_seeHowItWorks_button() {
        myClick(hp.seeHowItWorksBtn);
    }

    @And("Click play button")
    public void clickPlayButton() {
        Actions actions = new Actions(driver);
        for (int i = 0; i < 17; i++) {
            actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        }
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
    }

    @Then("Close the window after ten sec")
    public void closeTheWindowAfterTenSec() {
        threadWait(10);
        jsClick(hp.windowCloseBtn);
    }
}
