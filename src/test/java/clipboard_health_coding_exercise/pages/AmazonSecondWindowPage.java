package clipboard_health_coding_exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSecondWindowPage extends BasePage {

    @FindBy(xpath = "//h1[.=' About this item ']")
    public WebElement aboutThisItem;
}
