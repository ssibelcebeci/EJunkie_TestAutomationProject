package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class AddToCartPage extends ReusableMethods {
    public AddToCartPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//h3[@class='Title']")
    public WebElement cartProductText;

    @FindBy(xpath = "//button[@class='Payment-Button CC']")
    public WebElement payWithCartOpt;

    @FindBy(xpath = "//button[@class='Apply-Button Show-Promo-Code-Button']")
    public WebElement addPromoCodeBtn;

    @FindBy(xpath = "//input[@class='Promo-Code-Value']")
    public WebElement promoCodeInput;

    @FindBy(xpath = "//button[@class='Promo-Apply']")
    public WebElement promoCodeApplyBtn;

    @FindBy(xpath = "//div[@id='SnackBar']/span")
    public WebElement invalidPromoCodeError;
}
