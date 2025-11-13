package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

import java.util.List;

public class HomePage extends ReusableMethods {
    public HomePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(xpath = "//div[@class='column is-2-desktop is-4-tablet is-4-mobile']/a/img")
    public WebElement eJunkieLogo;

    @FindBy(xpath = "//a[@onclick='toggleYoutubeModal(true)']")
    public WebElement seeHowItWorksBtn;

    @FindBy(xpath= "//button[@class='modal-close is-large']")
    public WebElement windowCloseBtn;

    @FindBy(xpath = "//button[@class='view_product']")
    public List<WebElement> demoEBook;

    @FindBy(xpath = "//a[@class='contact']")
    public WebElement contactUsBtn;
}
