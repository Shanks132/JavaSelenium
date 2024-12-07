package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static Utilities.javascriptUtility.scrollToElements;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    public FormsPage goToForms(){
        scrollToElements(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}