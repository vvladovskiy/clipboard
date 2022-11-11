package clipboard_health_coding_exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonElectronicsTelevisionPage extends BasePage{

    @FindBy(xpath = "//span[.='Samsung']/..")
    public WebElement checkBoxSamsung;

}
