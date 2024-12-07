package com.demoqa.pages.forms;

import com.base.BasePage;
import org.openqa.selenium.By;

import static Utilities.javascriptUtility.scrollToElements;

public class FormsPage extends BasePage {
    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
    public PracticeFormPage clickPracticeForm(){
        scrollToElements(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
