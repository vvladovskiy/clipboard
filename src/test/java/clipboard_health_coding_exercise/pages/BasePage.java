package clipboard_health_coding_exercise.pages;

import clipboard_health_coding_exercise.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    //public WebDriver driver;

     public BasePage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }

}
