package Utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class utility {
    public static WebDriver driver;
    public static void setUtilityDriver(){
        driver = BasePage.driver;
        //generate a random number
        //Return strings to upper case
    }
}
