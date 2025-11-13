package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DemoPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class DemoSteps extends ReusableMethods {
    DemoPage dp;
    HomePage hp;

    @Given("Navigate to the demopage")
    public void Navigate_to_the_demopage() {
        dp = new DemoPage();
        hp = new HomePage();
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("Click e-commerce link")
    public void clickECommerceLink() {
        myClick(dp.eCommerceLinkText);
    }

    @When("Click ejunkie logo")
    public void clickEjunkieLogo() {
        myClick(hp.eJunkieLogo);
    }

    @Then("Verify home page opened")
    public void verifyHomePageOpened() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.e-junkie.com/"), "URL assertion error");
    }
}
