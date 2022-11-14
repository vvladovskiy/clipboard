package clipboard_health_coding_exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage {

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']")
    public WebElement hamburgerMenuField;


    @FindBy(xpath = "//div[.='TV, Appliances, Electronics']/..")
    public WebElement tvAppliancesElectronicsMenuLink;


    @FindBy(xpath = "//a[.='Televisions']")
    public WebElement televisionsMenuLink;


}
