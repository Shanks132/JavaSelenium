package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javascriptUtility extends utility {
    public static void scrollToElements(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";

        ((JavascriptExecutor)driver).executeScript(jsScript,element);

    }
    public static void clickJS(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();",element);
    }
}
