package com.demoqa.pages.Widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static Utilities.javascriptUtility.clickJS;
import static Utilities.javascriptUtility.scrollToElements;

public class WidgetsPage extends HomePage {

    private By selectMenuButton = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    public SelectMenuPage clickSelectMenu(){
        scrollToElements(selectMenuButton);
        clickJS(selectMenuButton);
        return new SelectMenuPage();
    }
    public DatePickerMenuPage clickDatePicker(){
        scrollToElements(datePickerMenuItem);
        clickJS(datePickerMenuItem);
        return new DatePickerMenuPage();
    }
}
