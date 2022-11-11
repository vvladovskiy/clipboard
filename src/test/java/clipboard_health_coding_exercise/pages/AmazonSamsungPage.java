package clipboard_health_coding_exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSamsungPage extends BasePage{

    @FindBy(xpath = "//*[@id='a-autoid-0-announce']")
    public WebElement sortBy;

    @FindBy(xpath = "//*[@id='s-result-sort-select_2']")
    public WebElement highToLow;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div")
    public WebElement secondHighPriceItem;
}
