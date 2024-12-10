package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class DropdownUtility extends utility {
    private static Select findDropDown(By locator){

         return new Select(driver.findElement(locator));
    }

    public static void SelectByVisibleTextUtil(By locator,String text){
        findDropDown(locator).selectByVisibleText(text);

    }
    public static void SelectByIndexUtil(By locator,int index){
        findDropDown(locator).selectByIndex(index);

    }
    public static void SelectByValueUtil(By locator,String value){
        findDropDown(locator).selectByValue(value);

    }
    public static void deselectByVisibleTextUtil(By locator,String value){
        findDropDown(locator).deselectByVisibleText(value);

    }
    public static void deselectByIndexUtil(By locator,int index){
        findDropDown(locator).deselectByIndex(index);

    }
    public static List<String> getAllSelectedOptions(By locator){
        List <WebElement> allSelectedOptions = findDropDown(locator).getAllSelectedOptions();
        return  allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}