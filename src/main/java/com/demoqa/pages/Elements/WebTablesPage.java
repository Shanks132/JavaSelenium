package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static Utilities.javascriptUtility.clickJS;

public class WebTablesPage extends ElementsPage{
    private By registrationAgeField = By.id("age");
    private By submitButton = By.id("submit");
    public void clickEdit(String email){
        By edit = By.xpath("//div[text()='"+email+"']//following::span[@Title='Edit']");
        click(edit);

    }
    public void setAge(String age){
        set(registrationAgeField,age);
    }
    public void clickSubmitButton(){
        clickJS(submitButton);
    }

}
